package basics;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class datetime {
    public static void main (String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}        
