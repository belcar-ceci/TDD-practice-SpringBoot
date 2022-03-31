package guru.springframework;
//generate class Money to link dollar and frac class
//se pasa  data type a protected
public class Money {
    protected int amount;//class protected to access both Dollar and Franc by the data type that now parent class Money gives them
    public boolean equals(Object object){
        Money money = (Money) object;//change Dollar and Franc for Money, inherits from father
        return amount == money.amount
                && this.getClass().equals(object.getClass());//
    }
}
