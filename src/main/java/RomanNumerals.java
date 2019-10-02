
public class RomanNumerals {
    private final int number;
    public RomanNumerals(int number){
        this.number = number;
    }

    public String toRomanNotation(){
        return new TupleMapper(new NumberBreaker(number)
                .breakdown())
                .value();
    }
}
