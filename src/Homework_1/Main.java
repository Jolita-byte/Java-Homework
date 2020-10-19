package Homework_1;

public class Main {
    public static void main(String[] args) {
        /*Create a class Furniture. It has a name, dimensions.
          Create a class Room. Room has a size, many furniture.
          Create a class House. A house has a kitchen, bedroom, bathroom and extra rooms.
          Create a class Street. A street has many houses, town name it belongs to.
          Create a function that prints names of all the furniture of all the houses in the street
          (where, in what class, static or not is up to you)
        */

        Furniture Sofa = new Furniture("Sofa", 0.5f,1, 2);
        Furniture Table = new Furniture("Table", 1, 1, 2);
        Furniture CoffeeTable = new Furniture("Coffe table", 0.5f, 0.5f, 1);
        Furniture ArmChair= new Furniture("Armchair", 1.5f,0.5f, 0.5f);
        Furniture Chair = new Furniture("Chair", 1.5f,0.5f, 0.5f);
        Furniture OfficeChair = new Furniture("Office Chair", 1.5f,0.5f, 0.5f);
        Furniture Bed = new Furniture("Bed", 0.2f,1.5f, 2);
        Furniture Childbed = new Furniture("Bed", 0.2f,0.8f, 2);
        Furniture Wardrobe = new Furniture("Wardrobe", 2,1.5f, 0.5f);
        Furniture NightTable= new Furniture("Night table", 0.2f,0.2f, 0.2f);

        Furniture [] KitchenFurniture = {Table, Chair, Chair, Chair, Chair};
        Furniture [] BedroomFurniture = {Bed, Wardrobe, NightTable, NightTable};
        Furniture [] HomeOfficeFurniture = {Table, OfficeChair, Table, OfficeChair};
        Furniture [] LivingRoomFurniture = {Sofa, CoffeeTable, ArmChair, ArmChair};
        Furniture [] BathroomFurniture = {};
        Furniture [] ChildroomFurniture = {Wardrobe, Table, OfficeChair, Childbed};

        Room Kitchen = new Room("Kitchen", 2.5f, 4, 5, KitchenFurniture);
        Room Bathroom = new Room("Bathroom", 2.5f, 2, 3, BathroomFurniture);
        Room Bedroom = new Room("Bedroom", 2.5f, 5, 6, BedroomFurniture);
        Room Childroom =  new Room("Cildroom", 2.5f, 4, 5, ChildroomFurniture);
        Room HomeOffice = new Room("Home office", 2.5f, 3, 4, HomeOfficeFurniture);
        Room Livingroom = new Room("Living Room", 2.5f, 5, 4, LivingRoomFurniture);

        Room [] Roomset1 = {Kitchen, Bathroom, Livingroom};
        Room [] Roomset2 = {Kitchen, Bathroom, Livingroom, Bedroom};
        Room [] Roomset3 = {Kitchen, Bathroom, Livingroom, Bedroom, HomeOffice};
        Room [] Roomset4 = {Kitchen, Bathroom, Livingroom, Bedroom, Childroom};
        Room [] Roomset5 = {Kitchen, Bathroom, Livingroom, Bedroom, Childroom, Childroom};
        Room [] Roomset6 = {Kitchen, Bathroom, Livingroom, Bedroom, Childroom, HomeOffice};

        House house1 = new House(Roomset1);
        House house2 = new House(Roomset2);
        House house3 = new House(Roomset3);
        House house4 = new House(Roomset4);
        House house5 = new House(Roomset5);
        House house6 = new House(Roomset6);
        House house7 = new House(Roomset3);
        House house8 = new House(Roomset5);
        House house9 = new House(Roomset4);
        House house10 = new House(Roomset2);

        House [] Houseset1 = {house3, house7, house9, house9, house2};
        House [] Houseset2 = {house3, house4, house4, house2, house8, house10};
        House [] Houseset3 = {house5, house5, house6, house1, house9};

        Street Guobu = new Street("Kaunas", "Guobų gatvė", Houseset1);
        Street Vilniaus = new Street("Kaunas", "Vilniaus gatvė", Houseset2);
        Street Donelaicio = new Street("Kaunas", "Donelaičio gatvė", Houseset3);
        System.out.println(Guobu.toString());
    }
}
