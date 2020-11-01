package Homework_2;

import java.math.BigDecimal;
import java.util.Arrays;

public class Human {
    private String Name;
    private String Surname;
    private int Personal_ID_No;
    private String Gender;
    private String HairColor;
    private float Height;
    private float Weight;
    private String Nacionality;
    private String Race;
    private char [] DNRcode;
    private Boolean Extroverted;
    private BigDecimal Savings;
    private String [] FavoriteFood;
    private String [] FavoriteMovies;
    private String [] FavoriteActivities;
    private String [] Achievements;
    private String [] Bodyparts;

    public Human(String name, String surname, String gender, String hairColor, String race, char[] DNRcode, Boolean extroverted) {
        Name = name;
        Surname = surname;
        Gender = gender;
        HairColor = hairColor;
        Race = race;
        this.DNRcode = DNRcode;
        Extroverted = extroverted;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Personal_ID_No=" + Personal_ID_No +
                ", Gender='" + Gender + '\'' +
                ", HairColor='" + HairColor + '\'' +
                ", Height=" + Height +
                ", Weight=" + Weight +
                ", Nacionality='" + Nacionality + '\'' +
                ", Race='" + Race + '\'' +
                ", DNRcode=" + Arrays.toString(DNRcode) +
                ", Extroverted=" + Extroverted +
                ", Savings=" + Savings +
                ", FavoriteFood=" + Arrays.toString(FavoriteFood) +
                ", FavoriteMovies=" + Arrays.toString(FavoriteMovies) +
                ", FavoriteActivities=" + Arrays.toString(FavoriteActivities) +
                ", FavoriteActivities=" + Arrays.toString(FavoriteActivities) +
                ", Achievements=" + Arrays.toString(Achievements) +
                '}';
    }

    

}
