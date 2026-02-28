package WeekEight;


class Account {
    double calculateInterest() {
        return 0;
    }
}

class SavingAccount extends Account {
    double calculateInterest() {
        return 5.0;
    }
}

class CurrentAccount extends Account {
    double calculateInterest() {
        return 3.0;
    }
}

class FixedDeposit extends Account {
    double calculateInterest() {
        return 7.5;
    }
}
