import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    int callNumber = 0;

    @Override
    public void log(String message){
        String outputMessage;
        if(message.contains("error") || message.contains("ERROR")){
            outputMessage = "ERROR#" + callNumber + "[" + LocalDateTime.now() + "] " + message;
            callNumber++;
        }
        else{
            outputMessage = "INFO#" + callNumber + "[" + LocalDateTime.now() + "] " + message;
            callNumber++;
        }
        System.out.println(outputMessage);
    }
}
