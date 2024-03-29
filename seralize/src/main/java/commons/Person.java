package commons;

    public class Person implements java.io.Serializable {
        private String name;
        private int age;
        // 注意此处没有提供无参数的构造器!
        public Person(String name)
        {
            System.out.println("有参数的构造器");
            this.name = name;
        }
        // 省略name与age的setter和getter方法

        // name的setter和getter方法
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return this.name;
        }

        // age的setter和getter方法
        public void setAge(int age)
        {
            this.age = age;
        }
        public int getAge()
        {
            return this.age;
        }
    }
