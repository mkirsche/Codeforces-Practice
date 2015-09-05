import java.io.*;
import java.util.*;
public class B545 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	String s = input.next(), t = input.next();
	char[] res = new char[s.length()];
	int c = 0;
	for(int i = 0; i<s.length(); i++)
	{
		if(s.charAt(i) == t.charAt(i)) res[i] = s.charAt(i);
		else
		{
			if(c%2 == 0) res[i] = s.charAt(i);
			else res[i] = t.charAt(i);
			c++;
		}
	}
	out.println(c%2 == 0 ? new String(res) : "impossible");
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

