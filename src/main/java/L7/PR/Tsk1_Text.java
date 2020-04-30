package L7.PR;

import java.util.Arrays;

public class Tsk1_Text {
String [] lines;

    public Tsk1_Text(String[] lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Tsk1_Text{" +
                "lines=" + Arrays.toString(lines) +
                '}';
    }
}
