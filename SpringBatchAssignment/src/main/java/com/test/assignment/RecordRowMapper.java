package com.test.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RecordRowMapper implements RowMapper<Record> {

	public Record mapRow(ResultSet rs, int rowNum) throws SQLException {
		Record record = new Record();
		record.setFirstName(rs.getString("FirstName"));
		record.setLastName(rs.getString("LastName"));
		record.setState(rs.getString("State"));
		record.setType(rs.getString("Type"));
		record.setVisit(rs.getInt("Visits"));
		record.setAddress("Address");
		return record;
	}

}
