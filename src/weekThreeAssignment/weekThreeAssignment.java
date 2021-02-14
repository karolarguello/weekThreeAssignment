package weekThreeAssignment;

import java.util.Arrays;

public class weekThreeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ages = new int [] {3,9,23,64,2,8,28,93,63};
		int lastMinusFirst = (ages[ages.length - 1] - ages[0]);
		System.out.println("Last element minus Firs element: " + lastMinusFirst);
		
		double sum = 0; 
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i];
			}
			
		double average = sum / ages.length;
		System.out.println("Average of Age Array: " + average);
		
		String [] names = new String [] {"Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumOfLetters = 0;
				for (String name : names) {
					sumOfLetters += name.length(); 
				}
				
		int averageNumberOfLetters = sumOfLetters / names.length;
		System.out.println(averageNumberOfLetters);
			
		int k = 0 ;
		for (String name : names) {
				System.out.print(name + " ");
			}
		 		
		int [] nameLenghts = new int [names.length];	
			for (int i = 0 ; i < names.length; i++) {
				nameLenghts[i] = names [i].length();
				}
			System.out.println(Arrays.toString(nameLenghts));
			
		int sumOfArray = 0;
		for (int i = 0; i <nameLenghts.length; i++) {
			sumOfArray += nameLenghts.length;
		}
		System.out.println(sumOfArray);
			
		System.out.println(concatenateString("Hello", 3));
			
			String firstName = "Larry" ;
			String lastName = "Smith" ;
			String fullName = fullNameString (firstName, lastName);
					System.out.println(fullName);
					
			System.out.println("Is sum of Ages greater than 100: " + isSumIntArray(ages)); 
			
			double [] doubles = new double [] {34.5, 20.9, 13.4, 5.6};
			System.out.println("Average of all the elements is: " + elementsAverage(doubles));	
			
			double [] doubles2 = new double [] {25.4, 8.7, 63.8};
			
			System.out.println(averageOfTwoArrays(doubles, doubles2));
			
			boolean isHotOutside = true;
			double moneyinPocket = 10.68;
			System.out.println("Will I buy a drink: " + willBuyDrink(isHotOutside, moneyinPocket));
			
			boolean isColdOutside = true;
			boolean haveToDoHomework = true;
			System.out.println("Can I take my dog for a walk? :" + willTakeDogForWalk(isColdOutside, haveToDoHomework));
			}
			
			public static String concatenateString(String word , int n) {
				String result = "";
				for (int i = 0; i < n; i++) {
					result += word;
				}
				return result;
			}
			
			public static String fullNameString (String firstName, String lastName) {
				return firstName + " " + lastName;
			}
			public static boolean isSumIntArray(int[] numbers) {
				int sum = numbers[0];
						for (int number : numbers) {
							if (sum > 100) {
								return true;
							}
						}
						return false;
			}
			public static double elementsAverage(double [] array) {
				double sum = 0;
				for (double number : array) {
					sum += number;
				}
				return sum / array.length;
			}
			
			public static boolean averageOfTwoArrays(double [] firstArray, double[] secondArray) {
				double sum = 0;
				if (firstArray.length > secondArray.length) {
				return true;
			}
			return false;
}
			
			public static boolean willBuyDrink(boolean isHotOutside, double moneyinPocket) {
			if (isHotOutside == true && (moneyinPocket > 0)) {
				return true;
			}
			return false;
		}
			public static boolean willTakeDogForWalk(boolean isColdOutside, boolean haveToDoHomework) {
				if (isColdOutside == false && haveToDoHomework) {
					return true;
				}
				return false;
			}	
	
}	
			
	

		