
public class Hello {
	public static void main(String[] args){
		System.out.println("\033[2j");

		System.out.println("\033[31m");
		System.out.println("\033[44m");
		System.out.print("\033[5;10H");
		System.out.println("Hello Java!");
		
		System.out.println("\033[34m");
		System.out.println("\033[41m");
		System.out.print("\033[15;25H");
		System.out.println("Hello JavaScript!");

		System.out.println("\033[31m");
		System.out.println("\033[44m");
		System.out.print("\033[20;5H");
		System.out.println("Hello JavaHtml!");

		System.out.println("\033[34m");
		System.out.println("\033[41m");
		System.out.print("\033[25;20H");
		System.out.println("Hello JavaSQL!");

		System.out.println("\033[0m");
	}

	
}
