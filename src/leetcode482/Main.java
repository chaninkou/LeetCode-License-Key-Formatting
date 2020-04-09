package leetcode482;

public class Main {
	public static void main(String[] args) {
		String S = "5F3Z-2e-9-w";
		
		int K = 4;
		
		System.out.println("S: " + S);
		
		System.out.println("K: " + K);
		
		FormatDashIntoStringFunction solution = new FormatDashIntoStringFunction();
		
		System.out.println("Solution: " + solution.licenseKeyFormatting(S, K));
	}
}
