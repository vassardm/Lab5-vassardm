import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for(int candidate = 2; n > 1; candidate++){
			for (; n % candidate == 0; n /= candidate){
				ret.add(candidate);
			}
		}
		return ret;
	}

	public static ArrayList<Integer> factorizePrimes(int i) {
		ArrayList<Integer> listOfNums = new ArrayList<Integer>();
		ArrayList<Integer> candiateList = new ArrayList<Integer>();	
		
		for (int j = 1; j < i; j++) {
			candiateList = generatePrimes(j);
			if (candiateList.size() == 0 || candiateList.size() == 1 ) {
				listOfNums.add(j);
			}		
		}
		
		return listOfNums;
	}
	
	

}
