package gdgoc.calc_backend.service;

import gdgoc.calc_backend.dto.CalcRequest;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public double calculate (CalcRequest x) {
        double a = x.getA();
        double b = x.getB();
        String op = x.getOp();

        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        if (op.equals("/")) return a / b;

        throw new RuntimeException("Invalid operator: " + op);
    }
}
