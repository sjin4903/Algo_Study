import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Problem_7568 
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			String tmp = br.readLine();
			int[][] list;
			for(int i=0;i<tmp.length();i++)
			{
				char t = tmp.charAt(i);
				if(!Character.isDigit(t))
					return;
			}
			
			list = new int[2][Integer.parseInt(tmp)];
			int n = Integer.parseInt(tmp);
			for(int i = 0 ; i < n ; i++)
			{
				String temp = br.readLine();
				list[0][i] = Integer.parseInt(temp.split(" ")[0]);
				list[1][i] = Integer.parseInt(temp.split(" ")[1]);
			}
			
//			int maxW=list[0][1], maxWindex = 0, maxH=0, maxHindex = 0;
//			for(int i = 1; i < n; i++)
//			{
//				if(maxW < list[0][i-1])
//				{
//					maxW = list[0][i-1];
//					maxWindex = i-1;
//				}
//				if(maxH < list[1][i-1])
//				{
//					maxH = list[1][i-1];
//					maxHindex = i-1;
//				}
//			}
//			int[] scoreW = new int[n];
//			int[] scoreH = new int[n];
//			int[] scoreA = new int[n];
//			Arrays.fill(scoreW, 1);
//			Arrays.fill(scoreH, 1);
//			for(int i=0; i<n ; i++)
//			{
//				for(int j=0; j<n ; j++)
//				{
//					if(list[0][i] < list[0][j])
//					{
//						scoreW[i]++;
//					}
//					if(list[1][i] < list[1][j])
//					{
//						scoreH[i]++;
//					}
//				}
//			}
//			for(int i=0;i<n;i++)
//			{
//				System.out.println(scoreW[i] +" "+scoreH[i]);
//			}
//			
//			for(int i=0;i<n;i++)
//				for(int j=0;j<n;j++)
//				{
//					if(scoreW[i]+scoreH[i] > scoreW[j]+scoreH[j])
//					{
//						scoreA[i]++;
//					}
//				}
//			for(int i=0;i<n;i++)
//			System.out.println(scoreA[i]+1);
			int rank=0;
			for(int i=0;i<n;i++)
			{
				rank=0;
				for(int j=0;j<n;j++)
				{
					if(list[0][i]<list[0][j] && list[1][i] < list[1][j])
					{
						rank++;
					}
				}
				System.out.println(rank+1);
			}
//			System.out.println(maxW);
//			System.out.println(maxWindex);
//			System.out.println(maxH);
//			System.out.println(maxHindex);
			
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
