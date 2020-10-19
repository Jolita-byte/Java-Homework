package Homework_2;

public class Main {
    public static void main(String[] args) {
        char [] DNAhuman1 = {'G', 'C', 'U', 'A', 'C', 'G', 'G'};
        Human human1 = new Human("Jonas", "Jonaitis", "Male", "black", "White", DNAhuman1, false);
        System.out.println(human1.toString());
    }
}
