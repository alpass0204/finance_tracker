package model;

import java.time.LocalDate;

public class Transaction {

    private String title;
    private double amount;
    private boolean isIncome;
    private LocalDate date;
    private String category;

    public Transaction(String title, double amount, boolean isIncome, String category, LocalDate date){
        this.title = title;
        this.amount = amount;
        this.isIncome = isIncome;
        this.category = category;
        this.date = date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("[%s] %.2f€ | %s | %s",
                isIncome ? "Income" : "Expenses",
                amount,
                category,
                date.toString()
        );
    }
}
