package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getRow(int num, int columns) {
        String row = "";
        int var = 0;
        for(int x=1; x <= columns;x++){
            var += num;
            row = row + String.format("%3d |",var);
        }
        row = row +"\n";
        return row;
    }


    public static String getSmallMultiplicationTable() {
        String result ="";
        for(int out =1; out<=5;out++){
            result = result + getRow(out,5);
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {

        String result ="";
        for(int out =1; out<=10;out++){
            result = result + getRow(out,10);
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";
        for(int out =1; out<= tableSize;out++){
            result = result + getRow(out,tableSize);
        }
        return result;

    }
}
