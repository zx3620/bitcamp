// 스프링 IoC컨테이너 사용
package bitcamp.java106.step05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam02 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = null;
        
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step05/application-context-02.xml");
        
        BeanUtils.printBeanNames(iocContainer);
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println(iocContainer.getBean("c2"));
        
    }

}
