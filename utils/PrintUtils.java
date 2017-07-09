package utils;

public class PrintUtils {
	
	public static void printArray(int array[]) {
		System.out.print("\nPrinting array: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");	
	}
	
	public static void printArrayCurrent(int array[],int i , int j) {
		System.out.print("\n");
		for (int index = 0; index < array.length; index++){
			if(i==index && j==index ){
				System.out.print(array[index]+"(i)(j) ");	
			} else if(i==index){
				System.out.print(array[index]+"(i) ");
			} else if(j==index){
				System.out.print(array[index]+"(j) ");
			}else{
				System.out.print(array[index]+" ");
			}
		}
	}

}
