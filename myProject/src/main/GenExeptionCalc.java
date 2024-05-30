package main;

public class GenExeptionCalc {
    private final String zero = "0";
    public String checkZero(String numbertwo){
        if(numbertwo.equals(zero)){
            throw new DivideByZeroExeption("Деление на 0 невозможно!");
        }
        return numbertwo;
    }
}
