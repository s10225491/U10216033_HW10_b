public class BubbleSort{
	public static void main(String[] args){
		int[] array = {75,24,18,92,46,58,6,86,39,60};
		
		System.out.print("Before sorting : ");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		
		BubbleSort(array);
		
		System.out.print("After sorting : ");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	
	public static void BubbleSort(int[] array){
		int temp = 0;
		for(int i = array.length - 1; i > 0; i-- ){
			for(int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}