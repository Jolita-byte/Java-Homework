package Homework_1;

public class Furniture {
    private final String Name;
    private final float Height;
    private final float Width;
    private final float Length;

    public Furniture(String name, float height, float width, float length) {
        Name = name;
        Height = height;
        Width = width;
        Length = length;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\t"+Name + ": Height=" + Height +
                ", Width=" + Width +
                ", Length=" + Length;
    }
}
