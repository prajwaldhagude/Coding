package com.TwodArray;
import java.util.*;
public class Search {
public int[] show(int[][] arr, int target)
{
	int n= arr.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j] == target)
			{
				return new int[] {i,j};
			}
			
		}
		continue;
	}
	return new int[]{};
}
}
