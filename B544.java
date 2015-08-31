import java.io.*;
import java.util.*;
public class B544 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt(), k = input.nextInt();
	if(k > (n*n+1)/2) out.println("NO");
	else
	{
		char[][] grid = new char[n][n];
		for(char[] A : grid) Arrays.fill(A,  'S');
		int c = 0;
		for(int i = 0; i<n; i++)
			for(int j = 0; j<n; j++)
			{
				if((i+j)%2 == 0 && c < k)
				{
					grid[i][j] = 'L';
					c++;
				}
			}
		out.println("YES");
		for(char[] A : grid) out.println(new String(A));
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

