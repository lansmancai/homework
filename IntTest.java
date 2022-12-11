import java.util.*;

public class IntTest
{
	public static void main(String[] args)
	{
			Scanner scint = new Scanner(System.in);
			var inttest = new int[10];
			int average = 0;
			int countnum = 0;
			int nummin = 0;
			int nummax = 0;
			int sum = 0;
			while (countnum < 10)
			{
				System.out.println("请输入要存入数组的整数，满10个整数程序结束");
				int instr = scint.nextInt();
				inttest[countnum] = instr;
				if (countnum == 0)
				{
					nummin = instr;
					nummax = instr;
				}
				else
				{
					if (instr > nummax)
					{
						nummax = instr;
					}
					if (instr < nummin)
					{
						nummin = instr;
					}
				}
				sum += instr;
				if (countnum ==9)
				{
					average = sum/9;
				}
				countnum++;
			}
			System.out.println(Arrays.toString(inttest));
			System.out.println(nummax);
			System.out.println(nummin);
			System.out.println(average);
			scint.close();		
	}
}