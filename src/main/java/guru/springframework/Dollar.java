package guru.springframework;

public class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier){
        //amount = amount * multiplier;
        //amount *= multiplier;(refactor)
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
