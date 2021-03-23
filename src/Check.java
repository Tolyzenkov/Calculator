import java.util.Arrays;

public class Check {
    String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] rome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] operators = new String[]{"+", "/", "*", "-"};

    private int firstNum;
    private int secondNum;
    private String operator;
    public static boolean isRome1;
    boolean isRome2;

    Converter converter = new Converter();
    Calculator calculator = new Calculator();

    public void setFirstNum(String a) throws Exception {
        if (!Arrays.asList(arab).contains(a) && !Arrays.asList(rome).contains(a)) {
            throw new Exception("Недопустимое значение!");
        }

        try {
            firstNum = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            converter.romeToArab(a);
            firstNum = converter.arabNum;
            isRome1 = true;
            calculator.isRome = true;
        }
    }

    public void setSecondNun(String b) throws Exception {
        if (!Arrays.asList(arab).contains(b) && !Arrays.asList(rome).contains(b)) {
            throw new Exception("Недопустимое значение!");
        }
        try {
            secondNum = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            converter.romeToArab(b);
            secondNum = converter.arabNum;
            isRome2 = true;
        }

        if (isRome1 != isRome2) {
            throw new Exception();
        }
    }


    public void setOperator(String c) throws Exception {
        if (!Arrays.asList(operators).contains(c) && !Arrays.asList(operators).contains(c)) {
            throw new Exception("Недопустимое значение!");
        }
        operator = c;

        switch (c) {
            case "+" :
                calculator.add(firstNum, secondNum);
                break;
            case "-" :
                calculator.subtract(firstNum, secondNum);
                break;
            case "*" :
                calculator.multiply(firstNum, secondNum);
                break;
            case "/" :
                calculator.divide(firstNum, secondNum);
                break;
        }
    }



}
