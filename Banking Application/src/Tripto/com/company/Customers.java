package Tripto.com.company;

import java.util.ArrayList;

public class Customers {
    private String name;
    private String accNo;
    private ArrayList<Double>transections;

    public Customers(String name,String accNo, double initialAmount) {
        this.name = name;
        this.accNo = accNo;
        this.transections = new ArrayList<Double>();
        addTransection(initialAmount);
    }

    private void addTransection(double amount){
        this.transections.add(amount);
    }

    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public ArrayList<Double> getTransections() {
        return transections;
    }
}
