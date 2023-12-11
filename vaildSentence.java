package codeTest;

public class vaildSentence {
	
	public static boolean validSentence(String sentence) {
		int puncCount = 0;
		int length = sentence.length();
		//Checks that the first letter in the sentence is a capital letter
		if(sentence.charAt(0) < 'A' || sentence.charAt(0) > 'Z') {
			return false;
		}
		for(int i = 0; i < length-1; i++) {
			//checks all the letters except the last letter to make sure that the last character
			//is the only period character
			if(sentence.charAt(i)== '.') {
				return false;
			}
			if(sentence.charAt(i) == '"') {
				puncCount++;
			}
			//Checks for 11 and 12
			if(sentence.charAt(i) == '1' && (sentence.charAt(i+1) == '1' 
					|| sentence.charAt(i+1) == '2')) {
				return false;
			}
		}
	
		for(int i = 0;i < length - 1;i++) {
			//Checks for 1-9 and if it's not got a number next to it'll return false
			if(sentence.charAt(i) <= '9' && sentence.charAt(i+1) == ' ') {
				return false;
			}
		}
		puncCount = puncCount % 2;
		//Checks if the number of " is even by dividing the total count by 2
		if(puncCount ==  1) {
			return false;
		}
		if(sentence.charAt(length-1) == '?'||sentence.charAt(length-1)== '.'
				|| sentence.charAt(length-1) == '!') {
				return true;
			}
		return false;
	}
	
	public static void testCase1() {
		System.out.println("Test Case 1:" );
		System.out.println("The sentence: The quick brown fox said “hello Mr lazy dog”.");
		if(validSentence("The quick brown fox said “hello Mr lazy dog”.")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	public static void testCase2() {
		System.out.println("Test Case 2:" );
		System.out.println("The sentence: The quick brown fox said hello Mr lazy dog.");
		if(validSentence("The quick brown fox said hello Mr lazy dog.")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	public static void testCase3() {
		System.out.println("Test Case 3:" );
		System.out.println("The sentence: One lazy dog is too few, 13 is too many.");
		if(validSentence("One lazy dog is too few, 13 is too many.")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	public static void testCase4() {
		System.out.println("Test Case 4:" );
		System.out.println("The sentence: One lazy dog is too few, thirteen is too many.");
		if(validSentence("One lazy dog is too few, thirteen is too many.")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	public static void testCase5() {
		System.out.println("Test Case 5:" );
		System.out.println("The sentence: How many \"lazy dogs\" are there?");
		if(validSentence("How many \"lazy dogs\" are there?")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	//Fails on "." period character check
	public static void testCase6() {
		System.out.println("Test Case 6:" );
		System.out.println("The sentence: The quick brown fox said \"hello Mr. lazy dog\".");
		if(validSentence("The quick brown fox said \"hello Mr. lazy dog\".")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	//Fails on Capital Letter check
	public static void testCase7() {
		System.out.println("Test Case 7:" );
		System.out.println("The sentence: the quick brown fox said “hello Mr lazy dog\".");
		if(validSentence("the quick brown fox said “hello Mr lazy dog\".")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	//Fails on capital letter check
	public static void testCase8() {
		System.out.println("Test Case 8:" );
		System.out.println("The sentence: \"The quick brown fox said “hello Mr lazy dog.\"");
		if(validSentence("\"The quick brown fox said “hello Mr lazy dog.\".")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	//fail because of number check
	public static void testCase9() {
		System.out.println("Test Case 9:" );
		System.out.println("The sentence: One lazy dog is too few, 12 is too many.");
		if(validSentence("One lazy dog is too few, 12 is too many.")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
	//Fail because of number check
	public static void testCase10() {
		System.out.println("Test Case 10:" );
		System.out.println("The sentence: Are there 11, 12, or 13 lazy dogs?");
		if(validSentence("Are there 11, 12, or 13 lazy dogs?")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	
		public static void testCase11() {
		System.out.println("Test Case 11:" );
		System.out.println("The sentence: There is no punctuation in this sentence");
		if(validSentence("There is no punctuation in this sentence")) {
			System.out.println("Valid\n");
		}
		else {
			System.out.println("Invalid\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testCase1();
		testCase2();
		testCase3();
		testCase4();
		testCase5();
		testCase6();
		testCase7();
		testCase8();
		testCase9();
		testCase10();
		testCase11();
		
	}

}
