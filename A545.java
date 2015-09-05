import java.io.*;
import java.util.*;
public class A545
{
	public static void main(String[] args) throws IOException {
		input.init(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = input.nextInt();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i<n; i++)
		{
			boolean good = true;
			for(int j = 0; j<n; j++)
			{
				int x = input.nextInt();
				if(x == 1 || x == 3) good = false;
			}
			if(good) res.add(i+1);
		}
		out.println(res.size());
		for(int x : res) out.print(x+" ");
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