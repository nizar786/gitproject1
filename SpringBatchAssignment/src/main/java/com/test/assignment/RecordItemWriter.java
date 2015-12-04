package com.test.assignment;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class RecordItemWriter extends JdbcDaoSupport implements ItemWriter<Record> {

    public String getInsertSQL() {
		return insertSQL;
	}


	public void setInsertSQL(String insertSQL) {
		this.insertSQL = insertSQL;
	}


	private String insertSQL;


    public void write(List<? extends Record> records) throws Exception {
    	for(Record record: records){
    		 getJdbcTemplate().update(insertSQL,
    				 new Object[]{record.getFirstName(),record.getLastName(),record.getType(),record.getAddress(),record.getState(),record.getVisit()});
    	}
    }
}
