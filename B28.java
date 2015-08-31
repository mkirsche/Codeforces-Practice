import java.io.*;
import java.util.*;
public class B28 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	int[] p = new int[n], f = new int[n];
	for(int i = 0; i<n; i++) p[i] = input.nextInt();
	for(int i = 0; i<n; i++) f[i] = input.nextInt();
	boolean[][] g = new boolean[n][n];
	for(int i = 0; i<n; i++)
	{
		int next = i + f[i];
		if(next < n) g[i][next] = g[next][i] = true;
		int prev = i - f[i];
		if(prev >= 0) g[i][prev] = g[prev][i] = true;
	}
	for(int k = 0; k<n; k++)
		for(int i = 0; i<n; i++)
			for(int j = 0; j<n; j++)
				g[i][j] |= g[i][k] && g[k][j];
	for(int i = 0; i<n; i++) g[i][i] = true;
	boolean good = true;
	for(int i = 0; i<n; i++)
	{
		good &= g[i][p[i]-1];
	}
	out.println(good ? "YES" : "NO");
	
	
	
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

