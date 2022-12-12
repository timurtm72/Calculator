package model;

public class Calculator {
    private Integer firstOperand;
    private Integer secondOperand;
    private String operator;
    private String convertOperator = null;
    public Integer getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Integer firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Integer getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Integer secondOperand) {
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
            case "plus": result = Double.valueOf(firstOperand) + Double.valueOf(secondOperand);
                        convertOperator = "+";break;
            case "minus": result = Double.valueOf(firstOperand) - Double.valueOf(secondOperand);
                        convertOperator = "-";break;
            case "mul": result = Double.valueOf(firstOperand) * Double.valueOf(secondOperand);
                        convertOperator = "*";break;
            case "div": result = Double.valueOf(firstOperand) / Double.valueOf(secondOperand);
                        convertOperator = "/";break;
        }
        return result;
    }

    @Override
    public String toString() {
        return firstOperand + " " + convertOperator + " " + secondOperand + " " + "=" + " " +  calculateValue();
    }
}
