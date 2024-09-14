package services;

import models.ExpenseMetadata;
import models.ExpenseType;
import models.User;
import models.expense.EqualExpense;
import models.expense.ExactExpense;
import models.expense.Expense;
import models.expense.PercentageExpense;
import models.split.ExactSplit;
import models.split.PercentageSplit;
import models.split.Split;

import java.util.List;

public class ExpenseService {

    public static Expense createExpense(ExpenseType expenseType, String expenseId, User paidBy, List<Split> splits, Double amount, ExpenseMetadata metadata) {

        switch (expenseType) {
            case EXACT:
                return new ExactExpense(expenseId, paidBy, splits, amount, metadata);

            case EQUAL:
                int totalSplits = splits.size();
                Double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100.0;
                for (Split split : splits) {
                    split.setAmount(splitAmount);
                }

                splits.get(0).setAmount(splitAmount + (amount - totalSplits*splitAmount));
                return new EqualExpense(expenseId, paidBy, splits, amount, metadata);

            case PERCENTAGE:
                for (Split split : splits) {
                    PercentageSplit percentageSplit = (PercentageSplit) split;
                    split.setAmount((amount*percentageSplit.getPercentage())/100);
                }

                return new PercentageExpense(expenseId, paidBy, splits, amount, metadata);

            default:
                return null;
        }
    }
}
