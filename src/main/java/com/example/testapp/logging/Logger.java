package com.example.testapp.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Logger implements ILogger {

	public void log(String logstring) throws IOException {
		BufferedWriter bufferWritter = new BufferedWriter(new FileWriter("D:/Logger.txt", true));
		bufferWritter.write("Logger" + logstring + "at date " + new Date());
		bufferWritter.newLine();
		bufferWritter.close();
		java.util.logging.Logger log = java.util.logging.Logger.getLogger("Logger");
		log.info(logstring);
	}
}

