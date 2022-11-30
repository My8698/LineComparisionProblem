package com.bridgelabz;
import java.util.Scanner;
public class LineComparision {
    public static int lineLength() {
        int x1,y1,x2,y2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the line co-ordinates: x1,y1,x2,y2");
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        int lineLength = (int)Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2), 2) );
        return lineLength;
    }

    /**
     * check equality of two lines
     *by comparing two lines
     * */
    public static void LineEquality(int lineOneLength , int lineTwoLength ) {
        if(lineOneLength == lineTwoLength ) {
            System.out.println("Lines are Equal");
        }
        else if(lineOneLength > lineTwoLength){
            System.out.println("Line 1 is greater than Line 2 ");
        }
        else {
            System.out.println("Line 2 is greater than Line 1 ");
        }
    }
    public static void main(String[] args) {
        int lineOneLength = lineLength();
        int lineTwoLength = lineLength();
        System.out.println("The length of line 1 is: "+lineOneLength);
        System.out.println("The length of line 2 is: "+lineTwoLength);
        LineEquality(lineOneLength,lineTwoLength);

    }

}