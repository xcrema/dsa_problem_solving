package models.split;

import models.User;

public class ExactSplit extends Split {

    public ExactSplit(User user, Double amount) {
        super(user);
        this.setAmount(amount);
    }
}
