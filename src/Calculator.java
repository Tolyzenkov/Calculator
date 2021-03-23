public class Calculator {

    int result;
    boolean isRome = false;
    Converter converter = new Converter();

    public void add(int a, int b) {
        result = a + b;
        output();
    }

    public void subtract(int a, int b) {
        result = a - b;
        output();
    }

    public void multiply(int a, int b) {
        result = a * b;
        output();
    }

    public void divide(int a, int b) {
        result = a / b;
        output();
    }

    public void output() {
        if (isRome) {
            System.out.println(converter.arabToRome(result));
        } else System.out.println(result);
    }

}
