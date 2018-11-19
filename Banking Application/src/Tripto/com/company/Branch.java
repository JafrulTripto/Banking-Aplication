package Tripto.com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private String location;
    private ArrayList<Customers>customersList;

    public Branch(String branchName, String location) {
        this.branchName = branchName;
        this.location = location;
        this.customersList = new ArrayList<Customers>();
    }

    public String getBranchName() {
        return branchName;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }

    public void addCustomer(Customers customers){
        String customerName = customers.getName();
        if (findCustomer(customerName)>=0) {
            System.out.println("This customer has an account already.");
        }
        else {
            customersList.add(customers);
            System.out.println("Customer successfully added.");
        }
    }

    public int findCustomer(String accNo){
        for (int i=0; i<customersList.size(); i++){
            customersList.get(i);
            if (customersList.get(i).getAccNo().equals(accNo)){
                System.out.println("Customer exists.");
                return i;
            }
        }
        System.out.println("Customer doesn't exist");
        return -1;
    }

    public void diposit(Customers customers, double amount){

        String name = customers.getAccNo();
        int customerPosition = findCustomer(name);
        if (customerPosition>=0) {
            double initialAmount = customers.getTransections().get(customerPosition);
            double amountAdd = initialAmount + amount;
            System.out.println(amount + " Tk is added to your account.");
        }
        else {
            System.out.println("Transaction Unsuccessful.");
        }
    }

    public void printCustomerList(){

        for (int i=0; i<customersList.size(); i++){
            System.out.println((i+1)+". "+customersList.get(i).getName() + " --> " +
                    customersList.get(i).getAccNo()+" = "+customersList.get(i).getTransections());
        }
    }
}
