package Homework_1;

import java.util.Arrays;

public class Street {
    private final String Town;
    private final String Name;
    private final House [] HouseArray;

    public Street(String town, String name, House[] houseArray) {
        Town = town;
        Name = name;
        HouseArray = houseArray;
    }

    @Override
    public String toString() {
        return "Street:" +
                "Town='" + Town + '\'' +
                ", Name='" + Name + '\'' +
                "\n\tHouses:" + Arrays.toString(HouseArray);
    }
}
