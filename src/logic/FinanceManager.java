package logic;

import model.Transaction;

import java.util.ArrayList;

public class FinanceManager {

    private ArrayList<Transaction> transactionList;

    public FinanceManager(){
        this.transactionList = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }

    public ArrayList<Transaction> getAllTransactions(){
        return transactionList;
    }

    public double getTotalBalance(){
        double total = 0;
        for(Transaction t:transactionList){
            if(t.isIncome()){
                total += t.getAmount();
            }
            else{
                total -= t.getAmount();
            }

        }
        return total;
    }

    public ArrayList<Transaction> getTransactionsByCategory(String category){
        ArrayList<Transaction> filtered = new ArrayList<Transaction>();
        for(Transaction t:transactionList){
            if (t.getCategory().equalsIgnoreCase(category)) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}
