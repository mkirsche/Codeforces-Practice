import java.io.*;
import java.util.*;
public class A574 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int n = input.nextInt();
	int[] data = new int[n];
	for(int i = 0; i<n; i++) data[i] = input.nextInt();
	int lo = -1, hi = 10000000;
	while(lo < hi - 1)
	{
		int mid = (lo+hi)/2;
		int got = data[0] + mid, need = 0;
		for(int i = 1; i<n; i++) if(data[i] >= got) need += data[i] - got + 1;
		if(need > mid) lo = mid;
		else hi = mid;
	}
	out.println(hi);
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

