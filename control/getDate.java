package control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class getDate {
    public static void main(String[] args) {
        String s= String.valueOf(LocalDateTime.now());
        System.out.println(s);

    }
}
