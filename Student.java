
/**
 * Date:5/12/2022<br>
 * @author jinniu
 * @version 1.0
 */
public class Student
{
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	//默认的无参数构造器
	public Student(){}
	// 提供带多个参数的构造器
	public Student(String name, int age, String gender, String phone, String address, String email)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone =phone;
		this.address = address;
		this.email = email;
	}
	//
	public void setName(String name)
	{

		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return this.gender;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setAddress(String Address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setEmail(String Email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void eat()
	{
		System.out.println("eating..........");
	}
	public void drink()
	{
		System.out.println("drinking........");
	}
	public void play()
	{
		System.out.println("playing.........");
	}
	public void sleep()
	{
		System.out.println("sleeping........");
	}
	public static void main(String[] args)
	{
		Student litongxue = new Student("lilei", 20, "male", "13577811920", "shenzhen", "612355674@qq.com");
		System.out.println(litongxue.getName());
		System.out.println(litongxue.getAge());
		System.out.println(litongxue.getGender());
		System.out.println(litongxue.getPhone());
		System.out.println(litongxue.getAddress());
		System.out.println(litongxue.getEmail());
		litongxue.eat();
		litongxue.drink();
		litongxue.play();
		litongxue.sleep();
	}
}
