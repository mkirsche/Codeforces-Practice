import java.io.*;
import java.util.*;
public class I45 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int n = input.nextInt();
	int[] cs = new int[n];
	for(int i = 0; i<n; i++) cs[i] = input.nextInt();
	Arrays.sort(cs);
	int neg = 0;
	while(neg < n && cs[neg] < 0) neg++;
	int count = 0;
	for(int i = neg-1; i >= neg%2; i--)
	{
		count++;
		System.out.print(cs[neg-1-i]+" ");
	}
	while(neg < n && cs[neg] == 0) neg++;
	for(int i = neg; i<n; i++)
	{
		count++;
		System.out.print(cs[i]+" ");
	}
	if(count == 0) System.out.print(cs[n-1]);
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

