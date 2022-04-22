import com.mashibing.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //根据id获取，需要强转
        /*Person person = (Person) context.getBean("person");
        //通过id+实例类型反射获取
        Person person2 = context.getBean("person",Person.class);
        System.out.println(person == person2);*/

        /**
         * 根据bean的类型来获取对象
         * 注意：当通过类型进行获取的时候，如果存在两个相同类型的对象，将无法完成获取工作
         */
        //直接根据bean的类型反射获取
//        Person person = context.getBean(Person.class);
//        System.out.println(person);

        //反射实现
        /**
         * 当需要从荣其中获取对象的时候，最好要保留无参构造方法，因为底层的实现是反射
         * Class clazz = Person.class;
         * Object obj = clazz.newInstance();//默认调用无参的构造方法，没有就会报错，此方法已经被弃用
         * Object object = clazz.getDeclaredConstructor().newInstance();
         */
//        Person person2 = context.getBean("person2", Person.class);
//        System.out.println(person2);
        //顺序变了
//        Person person3 = context.getBean("person3", Person.class);
//        System.out.println(person3);
        //当有多个相同参数的构造时，使用的构造会被覆盖
        Person person4 = context.getBean("person4",Person.class);
        System.out.println(person4);

    }

}
