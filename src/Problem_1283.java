import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1283 
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String[] initial = new String[Integer.parseInt(br.readLine())];
			String arr = "";
			
			for(int i=0;i<initial.length;i++)
			{
				String temp = br.readLine();
				for(int j=0;j<temp.length();j++)
				{
					initial[i] = temp;
					if((!arr.contains(temp.toLowerCase().charAt(j)+""))&&(temp.charAt(j)!=' '))
					{
						initial[i] = initial[i].substring(0,j)+"["+temp.charAt(j)+"]"+initial[i].substring(j+1,initial[i].length());
						arr += temp.toLowerCase().charAt(j);
						break;
					}
					else if(arr.contains(temp.toLowerCase().charAt(j)+"")&&temp.contains(" "))
					{
						System.out.println(temp.toLowerCase().charAt(j)+"");
						System.out.println(arr);
						break;
					}
				}
				
			}
			for(String i : initial)
				System.out.println(i);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
