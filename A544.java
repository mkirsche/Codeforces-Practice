import java.io.*;
import java.util.*;
public class A544 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int k = input.nextInt();
	String s = input.next();
	int n = s.length();
	ArrayList<Integer> starts = new ArrayList<Integer>();
	boolean[] used = new boolean[26];
	for(int i = 0; i<n && starts.size() < k; i++)
	{
		if(used[s.charAt(i) - 'a']) continue;
		starts.add(i);
		used[s.charAt(i) - 'a'] = true;
	}
	if(starts.size() < k) out.println("NO");
	else
	{
		out.println("YES");
		starts.add(n);
		for(int i = 0; i<k; i++) out.println(s.substring(starts.get(i), starts.get(i+1)));
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

