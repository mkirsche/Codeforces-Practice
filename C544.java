import java.io.*;
import java.util.*;
public class C544 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt(), m = input.nextInt(), b = input.nextInt();
	long mod = input.nextInt();
	long[][] dp = new long[m+1][b+1];
	int[] bs = new int[n];
	for(int i = 0; i<n; i++) bs[i] = input.nextInt();
	dp[0][0] = 1;
	for(int i = 0; i<n; i++)
	{
		for(int j = 0; j<m; j++)
		{
			for(int k = 0; k<=b; k++)
			{
				if(k + bs[i] <= b)
					dp[j+1][k + bs[i]] = (dp[j+1][k+bs[i]] + dp[j][k])%mod;
			}
		}
	}
	long res = 0;
	for(int i = 0; i<=b; i++) res = (res + dp[m][i])%mod;
	out.println(res);
	out.close();
}

public static class input {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens())
			tokenizer = new StringTokenizer(reader.readLine());
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
}

