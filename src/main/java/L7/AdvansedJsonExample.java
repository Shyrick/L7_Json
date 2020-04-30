package L7;


import L7.Enteties.Group;
import L7.Enteties.User;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
// В Мавен перед dependensies добавили тег <build></build> для корректной работы JDK
// т.к. Мавен отбрасывает версию JDK назад
public class AdvansedJsonExample {

    public static void main(String[] args) {

        ArrayList <User> users = new ArrayList();
        users.add(new User("Tom", User.Gender.male, 50));
        users.add(new User("Marge", User.Gender.female,30 ));
        users.add(new User("Mike", User.Gender.male, 10));

        Group group = new Group("Baskebol team", "bla bla bla", users);
        String json = JSON.toJSONString(group);
        System.out.println(json);

        Group groupClone = JSON.parseObject(json, Group.class);
        System.out.println("-----");
        System.out.println(groupClone);
    }
}
