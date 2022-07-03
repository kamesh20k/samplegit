import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-DD HH:mm:ss.SS");
        String formatted = current.format(formatter);

        System.out.println("Current Time is: " + formatted);
    }
}
