package controller;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;
import javax.print.event.PrintEvent;

import model.model;

public class viewController {

    public static ArrayList<String> sendAnswer(String inputCommand) {
        String number = inputCommand.split("\\s")[1];
        model.number = number;
        ArrayList<String> answer = new ArrayList<>();
        String message = "";
        String commandType = inputCommand.split("\\s")[0];
        boolean booleanField = false;
        if(commandType.equals("find-even")) {
            booleanField = findEven.evenFind(number);
            message = "successfull";
        } else if(commandType.equals("find-odd")){
            booleanField = (findOdd.oddFind(number));
            message = "successfull";
        } else if(commandType.equals("find-prime")) {
            booleanField = (findPrime.primeFind(number));
            message = "successfull";
        } else{
            booleanField = false;
            message = "there was a problem!!!!";
        }

        answer.add(booleanField? "true" : "flase");
        answer.add(message);
        return answer;


    }
    
}
