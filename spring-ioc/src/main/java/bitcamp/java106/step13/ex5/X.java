package bitcamp.java106.step13.ex5;

import org.springframework.stereotype.Component;

@Component
public class X {
    public X() {
        System.out.println("X객체 생성됨");
    }
    
    public int m1(int a, int b) {
        System.out.printf("X.m1()");
        return a / b;
    }
}
