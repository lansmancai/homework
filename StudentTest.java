import java.io.*;
/**
 * Date:5/12/2022<br>
 * @author jinniu
 * @version 1.0
 */
public class StudentTest
{
 //name搜索
public void searchbyName(Student[] stuarry, String name)
{
	int count = 0;
	for (int i = 0; i < stuarry.length; i++)
	{
		
		if (stuarry[i].getName().equals(name))
		{
			System.out.println("find:");
			System.out.println(stuarry[i].getName());
			System.out.println(stuarry[i].getAge());
			System.out.println(stuarry[i].getGender());
			System.out.println(stuarry[i].getPhone());
			System.out.println(stuarry[i].getAddress());
			System.out.println(stuarry[i].getEmail());
		}
		else
		{
			count++;
		}
	}
	//判断一个符合的都没有
	if (count == stuarry.length)
	{
		System.out.println("Sorry,not found");
	}
}
//eamil搜索
public void searchbyEmail(Student[] stuarry, String email)
{
	int count = 0;
	for (int i = 0; i < stuarry.length; i++)
	{
		
		if (stuarry[i].getEmail().equals(email))
		{
			System.out.println("find:");
			System.out.println(stuarry[i].getName());
			System.out.println(stuarry[i].getAge());
			System.out.println(stuarry[i].getGender());
			System.out.println(stuarry[i].getPhone());
			System.out.println(stuarry[i].getAddress());
			System.out.println(stuarry[i].getEmail());
		}
		else
		{
			count++;
		}
	}
	//判断一个符合的都没有
	if (count == stuarry.length)
	{
		System.out.println("Sorry,not found");
	}
}
//address搜索
public void searchbyAddress(Student[] stuarry, String address)
{
	int count = 0;
	for (int i = 0; i < stuarry.length; i++)
	{
		
		if (stuarry[i].getAddress().equals(address))
		{
			System.out.println("find:");
			System.out.println(stuarry[i].getName());
			System.out.println(stuarry[i].getAge());
			System.out.println(stuarry[i].getGender());
			System.out.println(stuarry[i].getPhone());
			System.out.println(stuarry[i].getAddress());
			System.out.println(stuarry[i].getEmail());
		}
		else
		{
			count++;
		}
	}
	//判断一个符合的都没有
	if (count == stuarry.length)
	{
		System.out.println("Sorry,not found");
	}
}
	public static void main(String[] args) throws Exception
	{
		Student litongxue = new Student("lilei", 20, "male", "13577811920", "shenzhen", "612355674@qq.com");
		Student lintongxue = new Student("lindan", 21, "male", "13819177819", "beijing", "6123999999@qq.com");
		Student wangtongxue= new Student("wangmeng", 21, "female", "13819188819", "shanghai", "612355674@qq.com");
		Student[] studentarray = new Student[3];
		studentarray[0] = litongxue;
		studentarray[1] = lintongxue;
		studentarray[2] = wangtongxue;
		
		StudentTest stest = new StudentTest();
		
	    System.out.println("请输入你要搜索的变量名，值，应以x,y的格式：");
		
		var br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while ((inputStr = br.readLine()) != null)
		{
			String[] posStrArr = inputStr.split(",");
			var bywhat = posStrArr[0];
			var byvalue = posStrArr[1];
			if (bywhat.equals("name"))
			{
				stest.searchbyName(studentarray, byvalue);
			}
			else if (bywhat.equals("email"))
			{
				stest.searchbyEmail(studentarray, byvalue);
			}
			else if (bywhat.equals("address"))
			{
				stest.searchbyAddress(studentarray, byvalue);
			}
			else
			{
				System.out.println("bywhat ony name or email or address");
			}
			System.out.println("请输入你要搜索的变量名，值，应以x,y的格式：");
		}
				
	}
}
