package expression;

import expression.BinaryOperator;

/**
 * Created by vadim on 20.03.2017.
 */
public class Multiply extends BinaryOperator  {
    public Multiply(AllExpressions first, AllExpressions second) {
        super(first, second);
    }

    public int calc(int a, int b) {
        return a*b;
    }
    public double calcd(double a, double b) {
        return a*b;
    }
}
