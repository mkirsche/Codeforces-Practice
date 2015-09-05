import java.io.*;
import java.util.*;
public class D545 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	int[] data = new int[n];
	for(int i = 0; i<n; i++) data[i] = input.nextInt();
	int res = 0;
	long sum = 0;
	Arrays.sort(data);
	for(int i = 0; i<n; i++)
	{
		if(data[i] >= sum)
		{
			sum += data[i];
			res++;
		}
	}
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

