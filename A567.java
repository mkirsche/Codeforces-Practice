import java.io.*;
import java.util.*;
public class A567 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	int[] data = new int[n];
	for(int i = 0; i<n; i++) data[i] = input.nextInt();
	for(int i = 0; i<n; i++)
	{
		int max = Math.max(data[n-1] - data[i], data[i] - data[0]);
		int min = (int)(2e9+1);
		if(i > 0) min = Math.min(min, data[i] - data[i-1]);
		if(i < n-1) min = Math.min(min,  data[i+1] - data[i]);
		out.println(min+" "+max);;
	}
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

