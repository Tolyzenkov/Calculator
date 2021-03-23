public class Parser {



    public static void parse(String input) throws Exception {
        String[] subStr = Input.input.split(" ");
        Check check = new Check();
        check.setFirstNum(subStr[0]);
        check.setSecondNun(subStr[2]);
        check.setOperator(subStr[1]);

    }

}
