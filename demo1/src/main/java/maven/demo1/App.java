package maven.demo1;


public class App 
{
	
	static void moviename(String name) {
		System.out.println(name);
	}
	static void theatre( String screen) {
		System.out.println(screen);
		}
	private static void screen(int i) {
		System.out.println("Screen "+i);
		
		
	}
	static void select(int l,int m) {
		System.out.println("Seat K"+l+"K"+m);
		
		
	}

public static void main(String[] args) {


	theatre("Rohini silver screen");
	moviename("RRR");
	screen(2);
	select(5,6);
	
	System.out.println("Your Ticket is Conformed");
}


}
   