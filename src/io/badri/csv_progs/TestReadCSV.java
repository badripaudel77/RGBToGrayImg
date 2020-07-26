package io.badri.csv_progs;

import java.io.IOException;

public class TestReadCSV {

	private static String path = "e:/test/data.csv";

	public static void main(String[] args) throws IOException {
     		
		
		CSVReader csvRead = new CSVReader();
		
		
		csvRead.readCSV(path);
	}

}
