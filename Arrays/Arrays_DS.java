/*
An array is a type of data structure that stores elements of the same type in a contiguous 
block of memory. In an array, "A", of size "N", each memory location has some unique index,
"i" (where 0 <= i < N), that can be referenced as A[i] (you may also see it written as Ai).

Given an array, "A" , of "N" integers, print each element in reverse order as a single line of 
space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,"N"  (the number of integers in "A"). 
The second line contains "N" space-separated integers describing "A".

Constraints
* 1 <= N <= 10^3
* 1 <= A[i] <= 10^4, where Ai is the i-th integer in "A"


Output Format

Print all "N" integers in "A" in reverse order as a single line of space-separated integers.

Sample Input
4
1 4 3 2

Sample Output
2 3 4 1
 */

import java.io.*;
import java.util.*;

public class Arrays_DS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int numArg = scan.nextInt();
	    int arr[] = new int[numArg];
	        
	    //Fills out the array
	    for(int i=0; i< numArg; i++)
	    {
	    		arr[i] = scan.nextInt();
	    }
	        
	    //Outputs the arrays in reverse  order
	    for(int i=arr.length-1; i >= 0; i--)
	    {
	       System.out.print(arr[i] + " ");
	    }//end of for loop
	    
	}// end of main
}