
public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int [] array= {145,33,10,100,333};
		int smalest =array[0];
		int largest =0;
		int largest2=0;
		
		
		for(int i=0; i<array.length;i++) {
			int arr=array[i];
			
			if(arr>largest) {
				largest2=largest;
				largest=arr;
				
			}else if (arr>largest2) {
				largest2=arr;
			}
			if(arr<smalest) {
				smalest=arr;
			}
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Second largest is "+largest2);
		System.out.println("Smallest number is "+smalest);

	}

}
