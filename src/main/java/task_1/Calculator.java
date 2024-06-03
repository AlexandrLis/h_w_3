package task_1;

public class Calculator {

    public <T extends Number, V extends Number> double sum(T t, V v){
        double sum1 = t.doubleValue();
        double sum2 = v.doubleValue();
        return sum1 + sum2;
    }


    public <T extends Number, V extends Number> double multiply(T t, V v){
        double multiply1 = t.doubleValue();
        double multiply2 = v.doubleValue();
        return multiply1*multiply2;
    }


    public <T extends Number, V extends Number> double divide(T t, V v){
        try{
            double divide1 = t.doubleValue();
            double divide2 = v.doubleValue();
            double divide3 = divide1/divide2;
            return divide3;
        }catch (Exception e){
            System.out.println("Ошибка деления");
        }
        return 0;
    }


    public <T extends Number, V extends Number> double subtract(T t, V v){
        double subtract1 = t.doubleValue();
        double subtract2 = v.doubleValue();
        return subtract1 - subtract2;
    }
}
