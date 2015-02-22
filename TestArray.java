public class TestArray{
	
	public static void printArr(double[] arr){
		for(double x: arr){
			System.out.println(x + " ");
		}
		System.out.println("\n");
	}

	public static void main(String args[]){
		double numArr[] = {1.9,2.9,3.4,3.5};
		
		//Print
		//for(int i = 0; i < numArr.length; i++){
		for(double x: numArr){
			System.out.println(x + " ");
		}
		System.out.println("\n");
		
		//Total
		double total = 0;
		//for(int i = 0; i < numArr.length; i++){
		for(double x: numArr){
			//total += numArr[i];
			total += x;
		}	
		System.out.println("Total: " + total + "\n");

		//Biggest
		double max = numArr[0];
		for(int i = 0; i < numArr.length; i++){
			if(numArr[i] > max){
				max = numArr[i];
			}
		}		
		System.out.println("Max: " + max);

		//Print arr once more

		printArr(numArr);

	}
}
