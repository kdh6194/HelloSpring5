package honeybee.beans;

import org.springframework.context.annotation.Bean;

public class HelloSpring5Bean01 {
    public void sayHello (String msg) {
        System.out.println("Hello, " + msg);
    }
}
