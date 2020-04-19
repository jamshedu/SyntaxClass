
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num = 3;
		
		for(int i = 1; i <=10;i++) {
			System.out.println(num + "*"+i +" = " +i*num);
		}
		
		System.out.println("=======");
		
		for (int i=0; i<10; i+=1) {
			for (int j=10; j>i; j-=2) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println();
	}
}
