package L7.PR;

import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1_Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("files/Pr7_Task1.txt");
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();

        Tsk1_Text text1 = JSON.parseObject(data, Tsk1_Text.class);

        System.out.println(text1);
    }
}
