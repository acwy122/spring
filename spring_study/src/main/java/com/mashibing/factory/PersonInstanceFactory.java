package com.mashibing.factory;

import com.mashibing.bean.Person;

/**
 * 实例工厂类
 */
public class PersonInstanceFactory {

    public Person getInstance(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(11);
        return person;
    }
}
