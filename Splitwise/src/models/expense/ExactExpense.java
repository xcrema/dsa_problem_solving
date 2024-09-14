package models.expense;

import models.split.ExactSplit;
import models.ExpenseMetadata;
import models.split.Split;
import models.User;

import java.util.List;

public class ExactExpense extends Expense{

    public ExactExpense(String id, User paidBy, List<Split> splits, Double totalAmount, ExpenseMetadata metadata) {
        super(id, paidBy, splits, totalAmount, metadata);
    }

    @Override
    public boolean validate(Expense expense) {
        Double amount = 0d;
        for (Split split : expense.getSplits()) {
            if (!(split instanceof ExactSplit)) {
                return false;
            }
            amount += split.getAmount();
        }

        if (amount != expense.getTotalAmount()) {
            return false;
        }

        return true;
    }
}
