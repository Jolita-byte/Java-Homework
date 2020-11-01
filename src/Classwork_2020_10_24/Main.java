package Classwork_2020_10_24;


public class Main {
    public static void main(String[]args){
        Rectangle a = new Rectangle(2,3);
        System.out.println("Rectangle: " + a);
        System.out.println("Space: " + a.space());
        System.out.println("Perimeter: " + a.perimeter());
        System.out.println("Space: " + a.space(2));
        System.out.println("Perimeter: " + a.perimeter(2));
        a.resizeInProportion(0.5f);
        System.out.println("Resized: " + a);
    }
}
