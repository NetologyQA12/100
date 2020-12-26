public class Main {

    public static void main(String[] args) {
        boolean registered = true;

        int balance = 100;

        int percent = 1;

        int amount = 1100;

        int bonus = amount * percent / 100;

        int limit = 1000;

        if (amount >= limit) {
            balance = balance + amount + bonus;
        } else {
            balance = balance + amount;
        }

        System.out.println(balance);
    }
}
