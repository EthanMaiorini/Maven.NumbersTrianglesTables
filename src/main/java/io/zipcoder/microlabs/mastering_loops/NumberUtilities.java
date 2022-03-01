package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
       String result = "";
        int num = start;
        while(num < stop){
            if ((num % 2) == 0){
                result= result + num;
            }
            num++;
        }


        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int num = start;
        while(num < stop){
            if ((num % 2) != 0){
                result= result + num;
            }
            num++;
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
       /* String result = "";
        int num = start;
        int square = 0;
        while(num < stop){
            square = num*num;
            result= result + square;
            num+=step;
        }

        */
        return NumberUtilities.getExponentiations(start,stop,step,2);
    }

    public static String getRange(int start) {
       /* String result = "";
        int num = 0;
        while(num < start){
                result= result + num;
            num++;
        }

        */
        return NumberUtilities.getRange(0,start,1);
    }

    public static String getRange(int start, int stop) {
       /* String result = "";
        int num = start;
        while(num < stop){
            result= result + num;
            num++;
        }

        */
        return NumberUtilities.getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        int num = start;
        while(num < stop){
            result= result + num;
            num+= step;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        int num = start;
        int exp = 0;
        while(num < stop){
            exp = num;
            for(int i =2;i <= exponent;i++) {
                exp = exp * num;
            }
            result= result + exp;
            num+=step;
        }
        return result;
    }
}
