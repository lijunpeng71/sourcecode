package cn.xuelianyong.study.spring;

import cn.xuelianyong.study.spring.applicationcontext.MyClassPathXmlApplicationContext;
import cn.xuelianyong.study.spring.domain.Person;
import org.springframework.context.ApplicationContext;

/**
 * @author lijunpeng
 * 2022/11/29 20:00
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new MyClassPathXmlApplicationContext("application.xml");
		Person person = ac.getBean(Person.class);
		System.out.println(person.toString());
	}
}
