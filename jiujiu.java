import java.io.*;
/**
 * Date:3/12/2022<br>
 * @author jinniu
 * @version 1.0
 */
public class jiujiu
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 1; i <= 9; i ++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i+"*"+j+"="+i*j+",");
			}
			//内for循环走完后需要换行
			System.out.println();
        }
    }
}	