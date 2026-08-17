public class Calculator{
    public static void main(String[] args){
        int num1 = 75;
        int num2 = 90;
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (double)num1 / num2;

        System.out.println("Addition:" +addition);
        System.out.println("Subtraction:" +subtraction);
        System.out.println("Multiplication:" +multiplication);
        System.out.println("Division:" +division);
    }
}