package lesson05.part04.task16;

public class Hrivna extends Money {
    @Override
    public String getCurrencyName() {
        return "UAH";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
