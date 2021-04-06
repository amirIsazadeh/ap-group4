package controller;

public class findEven {
    public static boolean evenFind(String number) {
        int intNumber = Integer.parseInt(number);

        return intNumber % 2 == 0;
    }
}
