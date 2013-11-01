/*	Example string : abc
 *   I extract the substrings in the following order:
 *   Start with a:
 *   a, ab, abc
 *   b, bc
 *   c
 * 
 * I used hashtables to store the substrings as hashtables take care 
 * of the uniqueness of each key and hence examples like 'aabc' will 
 * be taken care of automatically 
 * 
 */


import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    	
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	// Taking input from standard input stream
    	Scanner in = new Scanner(System.in);
    	String str = in.nextLine();
    	
    	// Getting length of the string
    	int length = str.length();
    	
    	// converting string into character array to make parsing easier
    	char[] input = str.toCharArray();
    	
    	// declaring hashtable for storing unique substrings
    	Hashtable<String, Integer> uniqueStrings = new Hashtable<String, Integer>();
    	
    	
    	int i = 0;
    	int j = 0;
    	
    	//parsing through the entire string starting from first character
    	for(i=0;i<length;i++)
    	{
    		// declaring length of substring which is to be extracted
    		int subStrLength = 1;
    		
    		// running loop to extract substrings of all possible lengths
    		while(subStrLength < (length-i+1) )
    		{
    			// declaring temporary character array for storing substring
    			char temp[] = new char[subStrLength];
    			int ptr=0;
    			
    			// loop inserting characters from main string to temporary substring
    			for(j=i;j<i+subStrLength;j++)
    			{
    				temp[ptr]=input[j];
    				ptr++;
    			}
    			
    			// converting char array into String
    			String sub = new String(temp);
    			
    			// inserting string into Hashtable
    			uniqueStrings.put(sub, 1);   		
    			
    			subStrLength++;
    		}
    		
    	}

    	/*  To display all the substrings in the Hashtable    	
    	for(String key: uniqueStrings.keySet())
    	{
    		System.out.println("key: " + key + " " + substrings.get(key) );
    		
    	}
    	 */ 	
    	
    	// Printing the size of the hashtable
    	System.out.println(uniqueStrings.size());
 
    	
    }
}
