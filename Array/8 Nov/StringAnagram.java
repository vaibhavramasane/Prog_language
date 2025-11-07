/*
10.Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.
*/

import java.util.*;

class StringAnagram{
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string.");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string.");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	
		if(str1.length()==str2.length())
		{
			char[] str1arr = str1.toCharArray();
			char[] str2arr = str2.toCharArray();
			
			Arrays.sort(str1arr);
			Arrays.sort(str2arr);
			
	
			boolean isAnagram = true;
			for(int k=0;k<str1arr.length;k++)
			{
				if(str1arr[k]!=str2arr[k])
				{
					isAnagram = false;
					break;
				}
				
			}
			if(isAnagram)
				System.out.println("Strings are anagrams.");
			else
				System.out.println("Strings are not anagrams.");
		}
		else
		{
			System.out.println("Strings are not anagrams.");
		}
	}
}