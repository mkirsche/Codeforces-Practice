import java.io.*;
import java.util.*;
public class D45 {
public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = input.nextInt();
	Pair[] data = new Pair[n];
	for(int i = 0; i<n; i++) data[i] = new Pair(input.nextInt(), input.nextInt(), i);
	int[] res = new int[n];
	Arrays.sort(data);
	int last = 0;
	PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
	int minA = 987654321;
	for(int i = 0; i<n; i++)
	{
		if(!data[i].used && data[i].a < minA) minA = data[i].a;
	}
	for(int i = 0; i<n; i++)
	{
		if(!data[i].used && data[i].a == minA)
		{
			data[i].used = true;
			pq.add(data[i]);
		}
	}
	for(int x = 0; x<n; x++)
	{
		Pair p = pq.poll();
		int cur = Math.max(p.a, last + 1);
		res[p.i] = cur;
		last = cur;
		if(pq.isEmpty())
		{
			minA = 987654321;
			for(int i = 0; i<n; i++)
			{
				if(!data[i].used && data[i].a < minA) minA = data[i].a;
			}
			for(int i = 0; i<n; i++)
			{
				if(!data[i].used && data[i].a == minA)
				{
					data[i].used = true;
					pq.add(data[i]);
				}
			}
		}
		else
		{
			for(int i = 0;i<n; i++)
				if(!data[i].used && data[i].a == 1 + last)
				{
					data[i].used = true;
					pq.add(data[i]);
				}
		}
	}
	for(int x : res) System.out.print(x+" ");
	out.close();
}
static class Pair implements Comparable<Pair>
{
	int a, b, i;
	boolean used;
	public Pair(int aa, int bb, int ii)
	{
		a = aa; b = bb; i = ii; used = false;
	}
	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		if(b != o.b) return b - o.b;
		return a - o.a;
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

