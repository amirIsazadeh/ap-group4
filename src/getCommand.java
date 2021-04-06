import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import controller.viewController;

public class getCommand {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String request = "";
        String inputCommand = scanner.nextLine();
        while(!inputCommand.equals("exit")){
            if(inputCommand.matches("even \\d+")){
                request = "find-even " + inputCommand.substring(5); 
            } else if(inputCommand.matches("odd \\d+")){
                request = "find-odd " + inputCommand.substring(4);

            } else if(inputCommand.matches("prime \\d+")) {
                request = "find-prime " + inputCommand.substring(6);
            } else{
                System.out.println("invalid command");
                System.exit(5);
            }
            ArrayList<String> answer = viewController.sendAnswer(inputCommand);
        }
        
    }
}
