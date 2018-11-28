package com.example.thymleaf.testThymleaf;

public class CalcService {
    public Cacl calc;

    public void setCalc( Cacl calc ) {
        this.calc = calc;
    }

    public int add(int a, int b){
        return calc.add(a,b);
    }

}
