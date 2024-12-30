package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("depreciation")
public class Main {
    public static void main(String[] args) {

        /*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
    */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Triangle triangle = (Triangle) context.getBean("alias-triangle");
        triangle.draw();
    }
}