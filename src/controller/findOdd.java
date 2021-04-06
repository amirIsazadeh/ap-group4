package controller;

public class findOdd {
    public static boolean oddFind(String number) {
        int intNumber = Integer.parseInt(number);

        return !(intNumber % 2 == 0);
    }
}
