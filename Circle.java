import java.io.*;
/**
 * Date:4/12/2022<br>
 * @author jinniu
 * @version 1.0
 */

public class Circle
{
	public void draw(int rlen)
	{
		//先近似绘制上半个圆
		for (int height = rlen; height > 0; height -= 2)
		{
			int width = (int)Math.round(Math.sqrt(rlen*rlen-height*height));
			//近似绘制上半个圆的一行的左半行
			for (int i = 0; i < rlen - width; i++)
			{
				System.out.print(" ");
		    }
			System.out.print("*");
			//近似绘制上半个圆的一行的右半行
			for(int k = 2 * width; k > 0; k-- )
			{
				System.out.print(" ");
			}
			System.out.println("*");
			//为了美观 再补上上下半行中间一行
			if( height - 2 <=0)
			{
				System.out.print("*");
				for(int k = 2 * width; k > 0; k-- )
				{
				System.out.print(" ");
				}
				System.out.println("*");
			}
	    }
		
		//再近似绘制下半个圆
		for (int depth = (rlen % 2 > 0? 1:2); depth <= rlen; depth += 2)
		{
			int width = (int)Math.round(Math.sqrt(rlen * rlen - depth * depth));
			//近似绘制下半个圆的一行的左半行
			for (int j = 0; j < rlen - width; j++)
			{
				System.out.print(" ");
		    }
			System.out.print("*");
			//近似绘制下半个圆的一行的右半行
			for(int k = 2 * width; k > 0; k-- )
			{
				System.out.print(" ");
			}
			System.out.println("*");
	    }
				
	}
	public static void main(String[] args) throws Exception
	{
		Circle dy = new Circle();
		System.out.println("请输入你要绘制的近似圆的半径后回车：");
		// 这是用于获取键盘输入的方法
		var br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		// br.readLine()：每当在键盘上输入一行内容按回车，用户刚输入的内容将被br读取到。
		while ((inputStr = br.readLine()) != null)
		{
			// 将用户输入的字符串转整形
			int n  = Integer.parseInt(inputStr);
			dy.draw(n);
			System.out.println("请输入你要绘制的近似圆的半径后回车：");
		}
    }
}