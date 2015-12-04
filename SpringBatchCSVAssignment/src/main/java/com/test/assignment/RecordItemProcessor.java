package com.test.assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.batch.item.ItemProcessor;

public class RecordItemProcessor implements ItemProcessor<Record, Record> {

	private Map<String,Record> recordMap = new HashMap<String,Record>();
	
	private Set<String> processedRecords = new HashSet<String>();

	public Record process(Record record) throws Exception {
		//Not Processed & Not having null values.
		if(record.havingNotNULLProperties() && !processedRecords.contains(record.key())){
			processedRecords.add(record.key());
			return record;
		}
		
		//Merge with existing Record.
		if(recordMap.containsKey(record.key()) && !processedRecords.contains(record.key())){
			Record oldRecord = recordMap.get(record.key());
			oldRecord.merge(record);
			if(oldRecord.havingNotNULLProperties()){
				processedRecords.add(record.key());
				recordMap.remove(record.key());
				return oldRecord;
			}
		}else{
			recordMap.put(record.key(), record);
		}

		return null;
	}
}
