package Tripto.com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank();


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            boolean quit = false;
            mainMenu();

            while(!quit){

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        bank.printBrunchList();
                        break;
                    case 2:
                        addBrunch();
                        break;
                    case 3:
                        viewCustomerInfo();
                        break;
                    case 4:
                        addCustomer();
//                    case 3:
//                        depositMoney();
//                        break;
//                    case 4:
//                        withdraw();
//                        break;
//                    case 5:

                }
            }

    }

    public static void mainMenu(){

        System.out.println("Bank Information: \n" +
                "1. View Branches.\n"+
                "2. Add a Brunch.\n" +
                "3. Show Customer Information.\n" +
                "4. Withdraw money.\n" +
                "5. Exit.");
    }


    private static void addBrunch(){

        System.out.println("Enter Brunch Name:");
        String brunchName = scanner.nextLine();
        System.out.println("Enter Brunch Location:");
        String location = scanner.nextLine();

        Branch branch = new Branch(brunchName,location);
        bank.addBranch(branch);



    }

    private static void viewCustomerInfo(){
        System.out.println("Enter Brunch Name: ");
        String brunchName = scanner.nextLine();
        bank.queryBrunch(brunchName).printCustomerList();

    }

    private static void addCustomer(){
        System.out.println("Enter Brunch Name:");
        String brunch = scanner.nextLine();
        System.out.println("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.println("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        Customers customers = new Customers(name,accNo,balance);

        bank.queryBrunch(brunch).addCustomer(customers);

    }
}
