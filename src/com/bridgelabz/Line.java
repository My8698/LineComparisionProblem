package com.bridgelabz;
public class Line {
    Point point1=new Point();///instance variable of class Point,Here we have to create two point for 1 line so that
    Point point2=new Point();
    public int getLengthOfLine(){
        int lineLength=(int)Math.sqrt(Math.pow((point2.getY()-point1.getY()),2)+Math.pow((point2.getX()-point1.getX()),2));
        return lineLength;
    }
    public void pointsInput(){
        System.out.println("Enter co-ordinates for point1:");
        point1.getPoints();
        System.out.println("Enter co-ordinates for point2:");
        point2.getPoints();
    }

    /**
     *check equality by using compareByEquals method of Oops
     */
    public static void compareByEquals(Line line1,Line line2){
        Integer length1=line1.getLengthOfLine();
        Integer length2=line2.getLengthOfLine();

        if (length1.equals(length2)){
            System.out.println("Line1 is equal to Line2");
        }
        else {
            System.out.println("Line1 is is not equal to Line2");
        }
    }
    public static void compareByCompareTo(Line line1,Line line2){
        Integer length1=line1.getLengthOfLine();
        Integer length2=line2.getLengthOfLine();
        /**
         * compare lines by using compareByCompareTo method of Oops
         */
        if (length1.compareTo(length2)==0){
            System.out.println("Line1 is equal to Line2");
        } else if (length1.compareTo(length2)==1) {
            System.out.println("Line1 is greater than Line2");
        }
        else{
            System.out.println("Line1 is less than Line2");
        }
    }
}


