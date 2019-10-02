import java.util.Arrays;
import java.util.stream.Collectors;

public class TupleMapper {
    final static String[][] MAP = new String[][]{
            {},
            {"I", "X", "C", "M"},
            {"II", "XX", "CC", "MM"},
            {"III", "XXX", "CCC", "MMM"},
            {"IV", "XL", "CD"},
            {"V", "L", "D"},
            {"VI", "LX", "DC"},
            {"VII", "LXX", "DCC"},
            {"VIII", "LXXX", "DCCC"},
            {"IX", "XC", "CM"}
    };

    private final int[][] tuples;

    public TupleMapper(int[][] tuples) {
        this.tuples = tuples;
    }

    public String value() {
        return Arrays.stream(tuples)
                .map(i -> valueOf(i[0], i[1]))
                .collect(Collectors.joining());
    }

    private String valueOf(int i, int j) {
        return MAP[i][j];
    }
}
