package commons;

    public class Person implements java.io.Serializable {
        private String name;
        private int age;
        // ע��˴�û���ṩ�޲����Ĺ�����!
        public Person(String name)
        {
            System.out.println("�в����Ĺ�����");
            this.name = name;
        }
        // ʡ��name��age��setter��getter����

        // name��setter��getter����
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return this.name;
        }

        // age��setter��getter����
        public void setAge(int age)
        {
            this.age = age;
        }
        public int getAge()
        {
            return this.age;
        }
    }
