package methods;

public class IsThereNumber {

	public static void main(String[] args) {
		
		int [] numbers = {2,36,5,1,0,18,3,26,21,66};
		int searching = 46;
		boolean isThere = false;
		
		for (int number : numbers) {
			if (number== searching) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			System.out.println("The numbers array includes the searching number: " + searching);
		}else {
			System.out.println("The numbers array does not include the searching number: " + searching);
		}
 
	}

}
