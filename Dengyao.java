import java.io.*;
/**
 * Date:3/12/2022<br>
 * @author jinniu
 * @version 1.0
 */

public class Dengyao
{
	public void draw(int len)
	{
		for (int i = 1; i <= len; i++)
	    {
			//先绘制空格
			for (int j = len - i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			//再绘制星星
			for (int k = 1; k <= 2 * i -1; k++)
			{
				System.out.print("*");
			}
			//一行绘制结束，换行
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception
	{
		Dengyao dy = new Dengyao();
		System.out.println("请输入你要绘制的等腰三角形的边长后回车：");
		// 这是用于获取键盘输入的方法
		var br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		// br.readLine()：每当在键盘上输入一行内容按回车，用户刚输入的内容将被br读取到。
		while ((inputStr = br.readLine()) != null)
		{
			// 将用户输入的字符串转整形
			int n  = Integer.parseInt(inputStr);
			dy.draw(n);
			System.out.println("请输入你要绘制的等腰三角形的边长后回车：");
		}
    }
}