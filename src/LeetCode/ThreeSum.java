package LeetCode;
import java.util.*;
public class ThreeSum 
{
	public List<List<Integer>> threeSum(int[] nums)
	{
		List<List<Integer>> ls = new ArrayList();
		
		int n = nums.length;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(i != j && i!=k && j!=k)
					{
						if( nums[i] + nums[j] + nums[k]==0)
						{
							List<Integer> lp = new ArrayList();
							lp.add(nums[i]);
							lp.add(nums[j]);
							lp.add(nums[k]);
							Collections.sort(lp);
							ls.add(lp);
						}
						
						
					}
					}
				}
			}
		  
		
		  return ls;
		}
	}
