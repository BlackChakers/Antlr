package AST;

import Visitors.Visitor;

public class Plus extends Expression {
    public Plus(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public Object accept(Visitor v) {
        Float left_value = (Float) left.accept(v);
        Float right_value = (Float) right.accept(v);

        return left_value + right_value;
    }

}
