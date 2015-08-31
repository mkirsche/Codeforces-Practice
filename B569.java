import java.io.*;
import java.util.*;
public class B569 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	int[] data = new int[n];
	for(int i = 0; i<n; i++) data[i] = input.nextInt();
	HashSet<Integer> set = new HashSet<Integer>();
	for(int x : data) set.add(x);
	Queue<Integer> toAdd = new LinkedList<Integer>();
	for(int i = 1; i<=n; i++)
		if(!set.contains(i)) toAdd.add(i);
	set = new HashSet<Integer>();
	int[] res = new int[n];
	for(int i = 0; i<n; i++)
	{
		if(data[i] >= 1 && data[i] <= n && !set.contains(data[i]))
		{
			set.add(data[i]);
			res[i] = data[i];
		}
		else res[i] = toAdd.poll();
		out.print(res[i]+" ");
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

