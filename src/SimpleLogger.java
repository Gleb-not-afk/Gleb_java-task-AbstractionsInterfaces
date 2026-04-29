import java.time.LocalDateTime;

public class SimpleLogger implements Logger{
    @Override
    public void log(String message) {
        String outputMessage;
        outputMessage = "[" + LocalDateTime.now() + "] " + message;
        System.out.println(outputMessage);
    }
}
