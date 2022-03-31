package guru.springframework;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        //amount = amount * multiplier;
        //amount *= multiplier;(refactor)
        return new Dollar(amount * multiplier);
    }


}
