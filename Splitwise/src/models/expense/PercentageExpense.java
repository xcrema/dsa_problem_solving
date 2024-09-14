package models.expense;

import models.ExpenseMetadata;
import models.split.PercentageSplit;
import models.split.Split;
import models.User;

import java.util.List;

public class PercentageExpense extends Expense{

    public PercentageExpense(String id, User paidBy, List<Split> splits, Double totalAmount, ExpenseMetadata metadata) {
        super(id, paidBy, splits, totalAmount, metadata);
    }

    @Override
    public boolean validate(Expense expense) {
        Double percentage = 0d;
        for (Split split : expense.getSplits()) {
            if (!(split instanceof PercentageSplit)) {
                return false;
            }
            percentage += ((PercentageSplit) split).getPercentage();
        }

        if (percentage != 100d) {
            return false;
        }
        return true;
    }
}
