import java.io.*;
import java.util.*;
public class B574 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt(), m = input.nextInt();
	boolean[][] g = new boolean[n][n];
	int[] ds = new int[n];
	for(int i = 0; i<m; i++)
	{
		int a = input.nextInt()-1, b = input.nextInt()-1;
		g[a][b] = g[b][a] = true;
		ds[a]++;
		ds[b]++;
	}
	int min = 1111111;
	for(int i = 0; i<n; i++)
	{
		for(int j = i+1; j<n; j++)
		{
			if(!g[i][j]) continue;
			for(int k = j+1; k<n; k++)
			{
				if(g[i][k] && g[j][k])
				{
					min = Math.min(min, ds[i] + ds[j] + ds[k] - 6);
				}
			}
		}
	}
	out.println(min > 1000000 ? -1 : min);
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

