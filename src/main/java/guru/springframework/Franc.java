package guru.springframework;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }
    Franc times(int multiplier){
        //amount = amount * multiplier;
        //amount *= multiplier;(refactor)
        return new Franc(amount * multiplier);
    }

}
