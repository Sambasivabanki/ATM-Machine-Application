import java.util.Scanner;

class Atm {
    int pin = 545;
    float balance;

    public void checkpin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            
        }
    }  // <-- Closing brace for checkpin method

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a Valid Choice");
            menu();  // Added to handle invalid choice
        }
    }

    public void checkBalance() {
        System.out.println(balance);https://github.com/Sambasivabanki/ATM-Machine-Application.git
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawal successful");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited successfully");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();
    }
}
