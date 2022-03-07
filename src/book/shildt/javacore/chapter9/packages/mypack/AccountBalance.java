package book.shildt.javacore.chapter9.packages.mypack;

class Balance {
    String name;
    double bal;

    public Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("---> ");
        }
        System.out.println(name + ": $" + bal);
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] balances = new Balance[3];

        balances[0] = new Balance("K. J. Fielding", 123.23);
        balances[1] = new Balance("Will Tell", 157.02);
        balances[2] = new Balance("Tom Jackson", -12.33);

        for (Balance a : balances) {
            a.show();
        }
    }
}