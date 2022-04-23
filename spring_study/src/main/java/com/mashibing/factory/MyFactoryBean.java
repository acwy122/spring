package com.mashibing.factory;

import com.mashibing.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Person> {
    /**
     * 返回获取的Bean
     * @return
     * @throws Exception
     */
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("王五");
        return person;
    }

    /**
     * 获取返回bean的类型
     * @return
     */
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 判断当前bean是否是单例的
     * @return
     */
    public boolean isSingleton() {
        return false;
    }
}
