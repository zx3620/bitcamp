// 스프링 IoC컨테이너 사용
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam07 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-07.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("--------------");
        BeanUtils.printBeanNames(iocContainer);
        
    }

}
