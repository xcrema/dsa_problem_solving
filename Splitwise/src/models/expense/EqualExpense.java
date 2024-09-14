package models.expense;

import models.split.EqualSplit;
import models.ExpenseMetadata;
import models.split.Split;
import models.User;

import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String id, User paidBy, List<Split> splits, Double totalAmount, ExpenseMetadata metadata) {
        super(id, paidBy, splits, totalAmount, metadata);
    }

    @Override
    public boolean validate(Expense expense) {
        for (Split split : expense.getSplits()) {
            if (!(split instanceof EqualSplit)) {
                return false;
            }
        }

        return true;
    }
}
