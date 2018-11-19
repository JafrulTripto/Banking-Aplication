package Tripto.com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch>branchList;

    public Bank() {
        this.branchList = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch){
        String branchName = branch.getBranchName();
        if (findBrunch(branchName)>=0) {
            System.out.println("This Brunch already Exists.");
        }
        else {
            branchList.add(branch);
            System.out.println("Brunch successfully added.");
        }
    }

    public int findBrunch(String brunchName){
        for (int i=0; i<branchList.size(); i++){
            branchList.get(i);
            if (branchList.get(i).getBranchName().equals(brunchName)){
                System.out.println("Brunch exists.");
                return i;
            }
        }
        System.out.println("Brunch doesn't exist");
        return -1;
    }

    public Branch queryBrunch(String name){
        int position = findBrunch(name);
        if (position>=0) {
            return branchList.get(position);
        }
        return null;
    }

    public void printBrunchList(){

        for (int i=0; i<branchList.size(); i++){
            System.out.println((i+1)+". "+branchList.get(i).getBranchName() + " --> " + branchList.get(i).getLocation());
        }
    }


}
