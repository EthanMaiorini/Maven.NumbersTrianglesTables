package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String output = "";
        for(int num =1; num<=numberOfRows;num++){
            output += getRow(num)+"\n";
        }

        return output;
    }
    public static String getRow(int numberOfStars) {
        String row = "*";
        String newRow = row;
        for(int x=1; x < numberOfStars;x++){
            newRow += row;
        }
        return newRow;
    }

    public static String getSmallTriangle() {
        /*String output = "";
        for(int x=1;x<=4;x++){
            output += getRow(x)+"\n";
        }
         */
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
       /* String outPut = "";
        for(int x=1;x<=10;x++){
            outPut += getRow(x)+"\n";
        }
        */
        return getTriangle(10);
    }
}
