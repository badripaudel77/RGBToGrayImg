package io.badri.genes;


public class Gene {

	/*
	public String findGene(String code) {
	
		//code must be multiple of 3
		boolean isValid = code.length() %3==0;

		String result = "";

		int start = code.indexOf("ATG"); // in DNA start codon is ATG
		int end = code.indexOf("TAA", start + 3); // in DNA stop codon is TAA but we need to include TAA after start so
												
		if(!isValid) {
		  result = "Not a valid genome sequence!";
		  return result;
		}
		
		// add start + 3

		// extract substring in between ATG & TAA as gene

		if (start == -1) {
			result = "first codon is absent so can't be calculated.";
			return result;
		}

		else if (end == -1) {
			result = "last codon is absent so can't be calculated.";
			return result;
		} 
		
		else {

			result = code.substring(start, end + 3);

			return result;
		}
	}
*/
	public String findGene(String code) {
      
		String result= "";
		
		int startIndex = code.indexOf("ATG");
		int currentIndex = code.indexOf("TAA", startIndex + 3);
		
		//while not end of string
		while(currentIndex != -1) {
			if((currentIndex - startIndex)%3==0){
				
				return code.substring(startIndex, currentIndex + 3);
			}
			else {
				//update current index from currentIndex plus 1
				currentIndex = code.indexOf("TAA", currentIndex + 1);
			}
		}
		
		return result;
	}
	
}
