package com.xls.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xls.domain.EmployeeDetails;
import com.xls.domain.ResultCalculation;

@Repository
public class XLSDAOImpl implements XLSDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ResultCalculation> getCalculationData(int year) {
		List<ResultCalculation> employeeDetails = null;
		try {
			employeeDetails = jdbcTemplate.query("CALL sp_r_fetchCalculations (?)", new Object[] { year },
					new int[] { Types.INTEGER }, new ResultCalculationRowMapper());
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return employeeDetails;
	}

	private class ResultCalculationRowMapper implements RowMapper<ResultCalculation> {

		@Override
		public ResultCalculation mapRow(ResultSet rs, int arg1) throws SQLException {
			ResultCalculation resultCalculation = new ResultCalculation();
			resultCalculation.setTeamCapacityHrs(rs.getInt(1));
			resultCalculation.setMonth(rs.getString(2));
			resultCalculation.setRegionCode(rs.getString(3));
			return resultCalculation;
		}
	}

	@SuppressWarnings("unused")
	@Override
	public boolean insertEmployeeDetails(EmployeeDetails employeeDetails) {
		try {
			int billable = employeeDetails.isBillable() ? 1 : 0;
			int isUpdated = jdbcTemplate.update("CALL sp_i_insertCalculations (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
					new Object[] { employeeDetails.getEmployeeName(), employeeDetails.getMonth(),
							employeeDetails.getYear(), employeeDetails.getWeek1(), employeeDetails.getWeek2(),
							employeeDetails.getWeek3(), employeeDetails.getWeek4(), employeeDetails.getWeek5(),
							billable, employeeDetails.getRegionId() }, 
					new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.INTEGER, Types.INTEGER, Types.INTEGER,
							Types.INTEGER, Types.INTEGER, Types.BIT, Types.INTEGER });
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return false;
	}

}
