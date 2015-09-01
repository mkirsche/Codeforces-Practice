import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class I100735 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	BigInteger a = new BigInteger(input.next());
	BigInteger b = new BigInteger(input.next());
	BigInteger c = new BigInteger(input.next());
	if(a.add(b).equals(c) || a.add(c).equals(b) || b.add(c).equals(a)) out.println("YES");
	else if(a.add(a).equals(b) || a.add(a).equals(c) ||
			b.add(b).equals(a) || b.add(b).equals(c) ||
			c.add(c).equals(a) || c.add(c).equals(b)) out.println("YES");
	else out.println("NO");
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

