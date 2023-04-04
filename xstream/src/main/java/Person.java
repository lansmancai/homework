import com.thoughtworks.xstream.XStream;
public class Person
{
	private String name;
	private int age;

	//默认的无参数构造器
	public Person(){}
	// 提供带多个参数的构造器
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
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
	public static void main(String[] args) {
      
        XStream xStream = new XStream();
        Person person = new Person();
        person.setName("bruce");
        person.setAge(22);
        String s = xStream.toXML(person);
        System.out.println(s);
    }
}