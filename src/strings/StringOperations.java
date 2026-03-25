package strings;

import java.util.StringTokenizer;

public class StringOperations 
{
	public static void main(String[] args) 
	{
		/**
		 * String		 (fixed-length, immutable character sequences)
		 * StringBuffer	 (mutable | synchronous | threadsafe)
		 * StringBuilder (mutable | As-synchronous | No-threadsafe)
		 * */
		stringTokenizer();
		string();
		stringBuffer();
		stringBuilder();
	}


	private static void stringTokenizer() 
	{
		StringTokenizer st1 = new StringTokenizer("Hi user how are you ?"); 	// Default delimiters are whitespaces, new lines, spaces, and tabs.
		StringTokenizer st2 = new StringTokenizer("Hi~user~how~are~you", "~");  // Single Delimiter
		StringTokenizer st3 = new StringTokenizer("Hi~user/how~are", "~,/"); 	// Multi Delimiter

		while (st3.hasMoreTokens())
			System.out.println(st3.nextToken());

	}

	private static void string() 
	{
		String join = String.join("->", "Wakeup", "eat", "sleep", "code");
		System.out.println(join);

		if ("racecar".equals(new StringBuffer("racecar").reverse().toString()))
			System.out.println("Its a palindrome");

	}

	private static void stringBuffer() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Hi Rubi");
		System.out.println("append :: " + sb);

		sb.delete(0, 3);
		System.out.println("delete :: " + sb);

		sb.insert(0, "Hi ");
		System.out.println("insert :: " + sb);

		sb.reverse();
		System.out.println("reverse :: " + sb);
	}

	private static void stringBuilder() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("HI Rubi");
		System.out.println("append :: " + sb);

		sb.delete(0, 3);
		System.out.println("delete :: " + sb);

		sb.insert(0, "Hi ");
		System.out.println("insert :: " + sb);

		sb.reverse();
		System.out.println("reverse :: " + sb);
	}
}
