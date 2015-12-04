package com.test.assignment;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class HeaderCallback implements FlatFileHeaderCallback {

	public void writeHeader(Writer writer) throws IOException {
		writer.write("FirstName,LastName,Type,Address,State,Visits");
	}

}
