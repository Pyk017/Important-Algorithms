import java.util.*;
public class LCS {
	public static int max(int a, int b) {
		if(a >= b) {
			return a;
		}
		return b;
	}
	public static String lcs(String a, String b) {
		int m = a.length();
		int n = b.length();
		int c[][] = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i == 0 || j == 0) {
					c[i][j] = 0;
				}
				else if(a.charAt(i-1) == b.charAt(j-1)) {
					c[i][j] = c[i-1][j-1] + 1;
				}
				else {
					c[i][j] = max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		int i1 = m, j1 = n;
		String str = "";
		while(i1 > 0 && j1 > 0) {
			if(a.charAt(i1 - 1) == b.charAt(j1 - 1)) {
				str = b.charAt(j1 - 1) + str;
				i1 -= 1;
				j1 -= 1;
			}
			else if(c[i1 - 1][j1] > c[i1][j1 - 1]) {
				i1 -= 1;
			}
			else {
				j1 -= 1;
			}
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First String :- ");
		String fstr = in.nextLine();
		System.out.println("Enter Second String :- ");
		String lstr = in.nextLine();
		in.close();
		String str = lcs(fstr, lstr);
		System.out.println("Longest Common Subsequence is :- "+str);
	}

}
