import java.util.*;

public class SetTest
{
	public static void main(String[] args)
	{
			Scanner scstr = new Scanner(System.in);
			var settest = new HashSet();
			while (settest.size() <= 20)
			{
				System.out.println("请输入要存入set集合的字符串，回车提交，满20个字符串程序结束");
				String str1 = scstr.nextLine();
				settest.add(str1);
			}
			System.out.println(settest);
			scstr.close();		
	}
}