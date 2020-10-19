package Homework_1;

import java.util.Arrays;

public class House {
    private final Room [] RoomArray;

    public House(Room[] roomArray) {
        RoomArray = roomArray;
    }

    @Override
    public String toString() {
        return "\n\t\tRooms:" + Arrays.toString(RoomArray) ;
    }
}
