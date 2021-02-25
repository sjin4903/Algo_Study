import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1436 
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			int n = Integer.parseInt(br.readLine());
			int i=666, count=0;
			while(true)
			{
				if(Integer.toString(i).contains("666"))
				{
					count++;
					if(count==n)
					{
						System.out.println(i);
						break;
					}
				}
				i++;
			}
		}
		catch (NumberFormatException | IOException e) 
		{
			e.printStackTrace();
		}
	}
}
