import java.util.*;
import java.io.*;
public class C24 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	long k = (int)((input.nextLong())%(2*n));
	long x = input.nextInt(), y = input.nextInt();
	int[] xs = new int[n], ys = new int[n];
	for(int i = 0; i<n; i++)
	{
		xs[i] = input.nextInt();
		ys[i] = input.nextInt();
	}
	for(int i = 0; i<k; i++)
	{
		x = 2 * xs[i%n] - x;
		y = 2 * ys[i%n] - y;
	}
	out.println(x+" "+y);
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

