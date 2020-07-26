package io.badri.genes;

public class FindGene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstDNA = "ATGGCTAATFGTTAA";
		String secondDNA = "ATATGCCTAAATATGTAAATATGTAA";
		
		 Gene gene =  new Gene();
		
		 String firstGene = gene.findGene(firstDNA);
	     System.out.println("First Gene is " + firstGene);
	     
		
	     String secondGene = gene.findGene(secondDNA);
	     System.out.println("Second gene is "+ secondGene);
	     
	}
}
