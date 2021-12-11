package utils;

public class Calculator {
    public static String calculate(String expression) {
        String result="0";

        // split the expression according to the operators
        String[] parts = expression.split("[-+*/]");
        // System.out.println(expression);
        System.out.println("parts len: "+parts.length);
        
        String[] operators = expression.split("[0-9]+");
        Integer[] numbers = new Integer[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("nums len: "+numbers.length);
        System.out.println("ops len: "+operators.length);
        for(String op:operators) {
            System.out.println(op);
        }
        // Integer resultNumber = numbers[0];
        // // return resultNumber.toString();
        // for(int i = 0; i < operators.length; i++) {
        //     switch (operators[i]) {
        //         case "+":
        //             resultNumber += numbers[i + 1];
        //             break;
        //         case "-":
        //             resultNumber -= numbers[i + 1];
        //             break;
        //         case "*":
        //             resultNumber *= numbers[i + 1];
        //             break;
        //         case "/":
        //             resultNumber /= numbers[i + 1];
        //             break;
        //     }
        // }
        // result = resultNumber.toString();
        return result;
    }
}
