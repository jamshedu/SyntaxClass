
public class StringDemo {

	public static void main(String[] args) {
	
		
		
		String name="JaMsheD";
		
		name=name.toLowerCase().charAt(0)+name.substring(1, name.length());
		System.out.println(name);
		
		
		String mixString ="@#%(*&nams%$^*SKDHG**";
		mixString= mixString.replaceAll("[^A-Za-z]", "");
        System.out.println(mixString.toUpperCase());
				
				String str="Jamshed";
				
				
	}

}
