import java.util.ArrayList;
import java.util.Collections;


public class CodingQuestionOne {

	/**
	* Sorts the ArrayList of Strings in-place such that the sorted list
	* is in reverse alphabetical order.
	*/
	
	public static void sortingAlgorithm(ArrayList<String> input) {

		int start = 0;
		int end = input.size() -1;
		boolean swapped = true;

		while(swapped == true) {
			for(int i = start;i<end-1;i++) {
				if((input.get(i)).compareTo(input.get(i+1)) < 0) {
					Collections.swap(input, i, i+1);
					swapped = true;
				}
			}
		

			if(swapped == false) {
				break;
			}

			swapped = false;
			end-=1;

			for(int i = end;i >start;i--) {
				if((input.get(i)).compareTo(input.get(i+1)) < 0) {
					Collections.swap(input, i, i+1);
					swapped = true;
				}
			}

			start+=1;

		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> test = new ArrayList<String>(); 
		test.add("Raspberry");
		test.add("Banana");
		test.add("Melon");
		test.add("Apple");
		test.add("Mango");
		test.add("Strawberry");
		test.add("Pineapple");
		test.add("Coconut");
		test.add("Grapes");
		test.add("Avacado");
		
		CodingQuestionOne.sortingAlgorithm(test);
		for(String item: test) {
			System.out.println(item);
		}
	
	}	
}
