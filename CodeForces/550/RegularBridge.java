import java.util.*;
	
public class RegularBridge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		if(k%2 == 0)
			System.out.println("NO");
		else {
			System.out.println("YES");
			int n = 4*k - 2;
			System.out.println(n + " " + (n*k/2));
			//Initial Left graph, and seconds to lasts
			for(int i = 2; i <= k; i++) {
				System.out.println("1 " + i);
				for(int j = 1; j < k; j++) 
					System.out.println(i + " " + (j+k));
			}
			//between seconds
			for(int j = k+1; j < 2*k-1; j+=2) 
				System.out.println(j + " " + (j+1));	
			
			//Initial Right graph, and seconds to lasts
			for(int i = 2*k+1; i <= 3*k-1; i++) {
				System.out.println((2*k) + " " + i);
				for(int j = 1; j < k; j++) 
					System.out.println(i + " " + (j+3*k-1));
			}
			//between seconds
			for(int j = 3*k; j < 4*k-2; j+=2) 
				System.out.println(j + " " + (j+1));
			
			//The bridge
			System.out.println(1 + " " + (2*k));
		}
	}
}
