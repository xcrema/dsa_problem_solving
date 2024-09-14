package models.expense;

import models.ExpenseMetadata;
import models.split.Split;
import models.User;

import java.util.List;

public abstract class Expense {

    private String id;
    private User paidBy;
    private List<Split> splits;
    private Double totalAmount;
    private ExpenseMetadata metadata;

    public Expense() {
    }

    public Expense(String id, User paidBy, List<Split> splits, Double totalAmount, ExpenseMetadata metadata) {
        this.id = id;
        this.paidBy = paidBy;
        this.splits = splits;
        this.totalAmount = totalAmount;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ExpenseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ExpenseMetadata metadata) {
        this.metadata = metadata;
    }

    public abstract boolean validate(Expense expense);
}
