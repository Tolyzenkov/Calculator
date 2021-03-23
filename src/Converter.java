public class Converter {
    String romeNum;
    int arabNum;
    String[] romeUnits = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] romeTens = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};


    public String arabToRome(int number) {

        if (number <= 10) {
            romeNum = romeUnits[number - 1];
        } else {
            int a = number / 10;
            int b = number % 10;
            String units;
            String tens = romeTens[a - 1];

            if (b == 0) {
                units = "";
            } else {
                units = romeUnits[b - 1];
            }


            romeNum =  tens + units;
        }
        return romeNum;
    }

    public int romeToArab(String number) {
        switch (number) {
            case "I" : arabNum = 1;
                 break;
            case "II" : arabNum = 2;
                break;
            case "III" : arabNum = 3;
                break;
            case "IV" : arabNum = 4;
                break;
            case "V" : arabNum = 5;
                break;
            case "VI" : arabNum = 6;
                break;
            case "VII" : arabNum = 7;
                break;
            case "VIII" : arabNum = 8;
                break;
            case "IX" : arabNum = 9;
                break;
            case "X" : arabNum = 10;
                break;
        }
        return arabNum;
    }
}
