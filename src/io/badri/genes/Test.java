package io.badri.genes;

public class Test {

	public static void findAbc(String input){
	       int index = input.indexOf("abc");
	       while (true){
	           if (index == -1 || index >= input.length() - 3){
	               break;
	           }
	           String found = input.substring(index+1, index+4);
	           System.out.println("indices "+ index);
	           System.out.println(found);
	           index = input.indexOf("abc",index+4);
	           System.out.println(index);
	       }
	   }

	   public static void test(){
	       //findAbc("abcd");
	       findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
	   }
	   
	   public static void main(String []args) {
		   Test.test();
	   }
}
