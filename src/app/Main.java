package app;

import logic.FinanceManager;
import model.Transaction;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FinanceManager fm1 = new FinanceManager();

        Transaction t1 = new Transaction("Coffee", 2.20,false,"Food",LocalDate.now());
        Transaction t2 = new Transaction("Salary", 1200,true,"Income",LocalDate.now());
        Transaction t3 = new Transaction("Cinema", 10,false,"Fun",LocalDate.now());

        fm1.addTransaction(t1);
        fm1.addTransaction(t2);
        fm1.addTransaction(t3);

        System.out.println("All Transactions: ");
        for(Transaction t: fm1.getAllTransactions()){
            System.out.println(t.toString());
        }

        System.out.printf("Total Balance: %.2f€%n", fm1.getTotalBalance());

        System.out.println("--- Food Transactions ---");
        for (Transaction t : fm1.getTransactionsByCategory("Food")) {
            System.out.println(t);
        }
    }
}
