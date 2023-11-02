package DI_Setter;

public class EmployeeTest {

	public static void main(String[] args) {
		
       // BeanFactory factory = new ClassPathXmlApplicationContext("springConfig.xml");

        //EmployeeBean employeeBean = (EmployeeBean) factory.getBean("studentbean");
		
		//System.out.println(employeeBean.getAdd().getCity());

		//System.out.println(employeeBean.getName());

	}

}




//
////<?xml version="1.0" encoding="UTF-8"?>
//
//<beans xmlns="https://www.springframework.org/schema/beans"
//
//      xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
//
//      xsi:schemaLocation="https://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd">
//
//
//
//      <bean id="adrress" class="com.java4coding.EmplyeeAdress">
//
//              <property name="city" value="Bangalore"></property>
//
//      </bean>
//
//
//
//      <bean id="studentbean" class="com.java4coding.EmployeeBean">
//
//              <property name="add" ref="adrress"></property>
//
//              <property name="name" value="Manu Manjunatha"></property>
//
//      </bean>
//
//
//
//</beans>