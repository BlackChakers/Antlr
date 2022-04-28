package Expression;

import java.util.ArrayList;
import java.util.List;

public class Forever_Loop extends Expression{
    public Expression beginning;
    public List<Expression> block;
    public Expression end;

    public Forever_Loop(Expression beginning, Expression end){
        this.beginning = beginning;

        this.block = new ArrayList<Expression>();
        this.end = end;
    }

    public void add(Expression child) {
        block.add(child);
    }

    @Override
    public String toString(){
        return "forever: " + beginning + block + end;
    }
}