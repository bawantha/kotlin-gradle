import com.example.MessageModel;


public class Application {
    public static void main(String[] args){
        MessageModel message = new MessageModel("Hello, World!");
        PrintServiceDemo printService = new PrintServiceDemo();
        printService.printMessage(message);
    }
}
