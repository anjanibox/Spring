package co.edureka.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEid(100);
		e.setEname("John Paul");
		e.setEsalary(10000);
		
		System.out.println(e.eid);


	// Inversion of Control
	// 1. Add Jar files using Maven
	// 2. Configure Java Objects in an XML file
	// 3. Use Spring IOC Container, eg. BeanFactory or ApplicationContext to get the objects consructed.
	
	ApplicationContext context = new ClassPathXmlApplicationContext("employeeBeans.xml");
	Employee e1 = (Employee) context.getBean("emp1");
	Employee e2 = (Employee) context.getBean("emp2");
	
	System.out.println("-----------------------------------");
	
	System.out.println(e1.ename);
	System.out.println(e2.ename);

	
	System.out.println("-----------------------------------");
	Resource resource = new ClassPathResource("employeeBeans.xml");
	@SuppressWarnings("deprecation")
	BeanFactory factory = new XmlBeanFactory(resource);
	
	Employee em1 = (Employee) factory.getBean("emp1");
	Employee em2 = factory.getBean("emp2",Employee.class);
	
	System.out.println("Employee 1 details " + em1.ename);
	System.out.println("Employee 2 details " + em2.ename);
	
	ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close();
	
	}
	
}
