package model;

import java.text.DecimalFormat;

public class Calculator {
    private Double firstOperand;
    private Double secondOperand;
    private String operator;
    private String convertOperator = null;
    public Double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public Double calculateValue(){
        Double result = 0.0;
        switch(getOperator()){
            case "plus": result =firstOperand + secondOperand;
                        convertOperator = "+";break;
            case "minus": result = firstOperand - secondOperand;
                        convertOperator = "-";break;
            case "mul": result = firstOperand * secondOperand;
                        convertOperator = "*";break;
            case "div": result = firstOperand / secondOperand;
                        convertOperator = "/";break;
        }
        return result;
    }
    DecimalFormat formatter = new DecimalFormat("#0.00");
    @Override
    public String toString() {
        return firstOperand + " " +
                convertOperator + " " +
                secondOperand + " " + "=" + " " +
                formatter.format(calculateValue());
    }
}
