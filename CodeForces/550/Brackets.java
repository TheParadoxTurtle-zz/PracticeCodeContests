import java.util.Scanner;
public class Brackets {
	public static boolean falsefiable(boolean[] expr) {
		if(expr.length == 1)
			return !expr[0];
		if(expr[expr.length-1])
			return false;
		for(int i = 0; i < expr.length-2; i++)
			if(!expr[i])
				return true;
		return expr[expr.length-2];
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean[] expr = new boolean[n];
		for(int i = 0; i < n; i++)
			expr[i] = scan.next().equals("1");
		if(!falsefiable(expr)) 
			System.out.println("NO");
		else {
			System.out.println("YES");
			int first = -1;
			for(int i = 0; i < n; i++)
				if(!expr[i]) {
					first = i;
					break;
				}
				
			//Something fucked up
			if(first == -1) {
				System.out.println("ERROR");
				System.exit(1);
			}
			if(first == n-1) {
				for(int i = 0; i < n-1; i++)
					System.out.print("1->");
				System.out.print("0");
				return;
			}
			//First paren
			System.out.print("(");
			
			if(first > 0) {
				//Initial True block
				System.out.print("(1");
				for(int i = 1; i < first; i++)
					System.out.print("->1");
				System.out.print(")->");
			}
			System.out.print("(0->(");
			System.out.print(expr[first+1] ? "1":"0");
			for(int i = first+2; i < n-1; i++) 
				System.out.print("->" + (expr[i] ? "1":"0"));
			System.out.print(")))");
			System.out.println("->0");
		}
	}
}
