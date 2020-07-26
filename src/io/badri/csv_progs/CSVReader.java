package io.badri.csv_progs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;

//reading csv file using open csv
public class CSVReader {
	public void readCSV(String filePath) throws FileNotFoundException {
	
		try { 
	        // Create an object of file reader class , pass file path as an arg 
	        FileReader filereader = new FileReader(filePath); 
	  
	        // create csvParser object
	        CSVParser parser = new CSVParserBuilder().withSeparator(';').build(); 
	  
	        // create csvReader object with parameter 
	        // filereader and parser 
	        com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader) 
	                                  .withCSVParser(parser) 
	                                  .build(); 
	        // all the data reading at once
	        List<String[]> allData = csvReader.readAll(); 
	  
	        //display values. 
	        for (String[] currentRow : allData) { 
	            for (String cell : currentRow) { 
	                System.out.print(cell + "\t"); //give one  
	            } 
	            System.out.println(); 
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 

  }
}
	
