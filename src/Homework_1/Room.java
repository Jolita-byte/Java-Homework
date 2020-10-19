package Homework_1;

import java.util.Arrays;

public class Room {
    private final String Name;
    private final float Height;
    private final float Width;
    private final float Length;
    private final Furniture [] FurnitureArray;

    public Room(String name, float height, float width, float length, Furniture[] furnitureArray) {
        Name = name;
        Height = height;
        Width = width;
        Length = length;
        FurnitureArray = furnitureArray;
    }

    @Override
    public String toString() {
        return  "\n\t\t\t"+ Name +
                ", Height=" + Height +
                ", Width=" + Width +
                ", Length=" + Length +
                "\n\t\t\t\tFurniture:" + Arrays.toString(FurnitureArray);
    }
}
