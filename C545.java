import java.io.*;
import java.util.*;
public class C545 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	Tree[] data = new Tree[n];
	for(int i = 0; i<n; i++)
	{
		data[i] = new Tree(input.nextInt(), input.nextInt());
	}
	int max = (int)(-1e9-1);
	int res = 0;
	for(int i = 0; i<n; i++)
	{
		if(data[i].x <= max) continue;
		if(data[i].x - data[i].h > max && (i == 0 || data[i].x - data[i].h > data[i-1].x))
		{
			res++;
			max = data[i].x;
		}
		else if(i == n-1 || data[i].x + data[i].h < data[i+1].x)
		{
			res++;
			max = data[i].x + data[i].h;
		}
	}
	out.println(res);
	out.close();
}
static class Tree implements Comparable<Tree>
{
	int x, h;
	public Tree(int xx, int hh)
	{
		x = xx; h = hh;
	}
	@Override
	public int compareTo(Tree o) {
		// TODO Auto-generated method stub
		return x - o.x;
	}
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

