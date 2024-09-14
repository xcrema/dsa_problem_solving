package services;

import models.ExpenseMetadata;
import models.ExpenseType;
import models.User;
import models.expense.Expense;
import models.split.Split;

import java.util.*;

public class ExpenseManager {

    public List<Expense> expenses;
    public Map<String, User> userList;
    public Map<String, Map<String, Double>> balanceSheet;

    public ExpenseManager() {
        expenses = new ArrayList<>();
        userList = new HashMap<>();
        balanceSheet = new HashMap<>();
    }

    public void addUser(User user) {
        userList.put(user.getUserId(), user);
        balanceSheet.put(user.getUserId(), new HashMap<>());
    }

    public void addExpense(ExpenseType expenseType, Double amount, String paidBy, List<Split> splits, ExpenseMetadata metadata) {

        Expense expense = ExpenseService.createExpense(expenseType, UUID.randomUUID().toString(), userList.get(paidBy), splits, amount, metadata);
        expenses.add(expense);

        Map<String, Double> balanceSheetOfLender = balanceSheet.get(paidBy);
        for (Split split : splits) {
            User paidTo = split.getUser();
            Double balanceAmount = balanceSheetOfLender.getOrDefault(paidTo.getUserId(), 0d);
            balanceSheetOfLender.put(paidTo.getUserId(), balanceAmount + split.getAmount());

            Map<String, Double> balanceSheetOfBorrower = balanceSheet.get(paidTo.getUserId());
            balanceAmount = balanceSheetOfBorrower.getOrDefault(paidBy, 0d);
            balanceSheetOfBorrower.put(paidBy, balanceAmount - split.getAmount());
        }
    }

    public void showBalance(String userId) {
        boolean isEmpty = true;
        Map<String, Double> balanceSheetOfUser = balanceSheet.get(userId);
        for (Map.Entry<String, Double> entry : balanceSheetOfUser.entrySet()) {
            if (entry.getValue() != 0) {
                isEmpty = false;
                printBalance(userList.get(userId).getName(), userList.get(entry.getKey()).getName(), entry.getValue());
            }
        }
        if (isEmpty) {
            System.out.println("No Balance");
        }
    }

    public void showBalances() {
        boolean isEmpty = true;
        for (Map.Entry<String, Map<String, Double>> balanceSheetOfUser : balanceSheet.entrySet()) {
            for (Map.Entry<String, Double> entry : balanceSheetOfUser.getValue().entrySet()) {
                if (entry.getValue() > 0) {
                    isEmpty = false;
                    printBalance(userList.get(balanceSheetOfUser.getKey()).getName(), userList.get(entry.getKey()).getName(), entry.getValue());
                }
            }
        }

        if (isEmpty) {
            System.out.println("No Balance");
        }
    }

    public void printBalance(String user1, String user2, Double amount) {
        if (amount > 0) {
            System.out.println(String.format("%s ows %s to %s", user2, amount, user1));
        } else {
            System.out.println(String.format("%s ows %s to %s", user1, amount, user2));
        }
    }
}
