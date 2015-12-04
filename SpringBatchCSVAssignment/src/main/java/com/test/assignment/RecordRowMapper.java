package com.test.assignment;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class RecordRowMapper implements FieldSetMapper<Record> {  //implements RowMapper<Record> {

	public Record mapFieldSet(FieldSet fieldSet) throws BindException {
		Record record = new Record();
		record.setFirstName(fieldSet.readString("FirstName"));
		record.setLastName(fieldSet.readString("LastName"));
		record.setState(fieldSet.readString("State"));
		record.setType(fieldSet.readString("Type"));
		record.setVisits(fieldSet.readInt("Visits",0) == 0 ? null : fieldSet.readInt("Visits",0));
		record.setAddress(fieldSet.readString("Address"));
		return record;
	} 

}
