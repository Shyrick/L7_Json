package L7;

import L7.Enteties.DogEntity;
import com.alibaba.fastjson.JSON;

public class JsonExample {
    public static void main(String[] args) {
        DogEntity dog = new DogEntity("Bobik", 3);
        String json = JSON.toJSONString(dog);
        System.out.println(json);
    }

}
