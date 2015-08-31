import java.io.*;
import java.util.*;
public class A572 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int na = input.nextInt(), nb = input.nextInt();
	int k = input.nextInt(), m = input.nextInt();
	int[] as = new int[na], bs = new int[nb];
	for(int i = 0; i<na; i++) as[i] = input.nextInt();
	for(int i = 0; i<nb; i++) bs[i] = input.nextInt();
	out.println(as[k-1] < bs[nb-m] ? "YES" : "NO");
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

