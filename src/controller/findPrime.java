package controller;

public class findPrime {
    public static boolean primeFind(String number) {
        int intNumber = Integer.parseInt(number);
        for (int i = 2; i < intNumber / 2 ; i++) {
            if(intNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
