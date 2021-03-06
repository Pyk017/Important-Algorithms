import java.util.*;
public class Matric_Chain {
	public static int matric_chain(int p[], int n){
		int m[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			m[i][i] = 0;
		}
		int j=0, q=0;
		for(int l=2; l<n; l++) {
			for(int i=1; i<(n-l+1); i++) {
				j = i+l-1;
				m[i][j] = Integer.MAX_VALUE;
				for(int k=i; k<=(j-1); k++) {
					q = m[i][k] + m[k+1][j] + (p[i-1]*p[k]*p[j]);
					if(q < m[i][j]) {
						m[i][j] = q;
					}
				}
			}
		}
		
		return m[1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number of Matrices :- ");
		int n = in.nextInt();
		n += 1;
		int p[] = new int[n];
		System.out.println("Enter the Dimentions of the Matrices :- ");
		for(int i=0; i<n; i++) {
			p[i] = in.nextInt();
		}
		int result = matric_chain(p, n);
		System.out.println("Minimum Number of Multiplication are :- "+result);
		in.close();
	}

}
