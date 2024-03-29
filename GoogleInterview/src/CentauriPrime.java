import java.util.*;
import java.io.*;

public class CentauriPrime {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("A-small-practice-2.in"));
		int T = Integer.parseInt(scan.next());
		PrintWriter pw = new PrintWriter("A-small-2.out");
		for(int i = 0; i < T; i++) {
			String temp = scan.next();
			pw.write("Case #" + (i+1) + ": " + temp + " is ruled by " + ruler(temp) + "\n");
		}
		pw.flush();
		pw.close();
	}
	
	public static String ruler(String s) {
		char c = s.charAt(s.length()-1);
		if("aeiouAEIOU".indexOf(c) != -1)
			return "a queen.";
		else if(c == 'y' || c == 'Y')
			return "nobody.";
		return "a king.";
	}
}
