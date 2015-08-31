import java.io.*;
import java.util.*;
public class D574 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	int[] data = new int[n+2];
	for(int i = 0; i<n; i++) data[i+1] = input.nextInt();
	int[] res = new int[n+2];
	for(int i = 0; i<n+2; i++) res[i] = data[i];
	for(int i = 1; i<n+2; i++) res[i] = Math.min(res[i], 1 + res[i-1]);
	for(int i = n; i>=0; i--) res[i] = Math.min(res[i], 1 + res[i+1]);
	int max = 0;
	for(int x : res) max = Math.max(max, x);
	out.println(max);
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

