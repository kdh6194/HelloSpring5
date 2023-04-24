package honeybee.beans;

public class HelloSpring5BeanFactory04 {
    public static HelloSpring5Bean03 create(String bean) {
        HelloSpring5Bean03 obj = null;

        if (bean.equalsIgnoreCase("kor")) obj = new HelloSpring5Bean03Kor();
            else if (bean.equalsIgnoreCase("eng")) obj = new HelloSpring5Bean03Eng();
            else if (bean.equalsIgnoreCase("jpn")) obj = new HelloSpring5Bean03Jpn();
        return obj;
    }

}
