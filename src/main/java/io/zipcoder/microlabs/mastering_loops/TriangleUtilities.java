package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String output = "";
        for(int num =1; num<=numberOfRows;num++){
            output = output + getRow(num);
        }


        return output;
    }
    public static String getRow(int numberOfStars) {
        String row = "*";
        String newRow = row;
        for(int x=1; x < numberOfStars;x++){
            newRow= newRow + row;
        }
        newRow = newRow +"\n";
        return newRow;
    }

    public static String getSmallTriangle() {
        String output = "";
        for(int x=1;x<=4;x++){
            output = output + getRow(x);
        }

        return output;
    }

    public static String getLargeTriangle() {
        String outPut = "";
        for(int x=1;x<=10;x++){
            outPut = outPut + getRow(x);
        }

        return outPut;
    }
}
