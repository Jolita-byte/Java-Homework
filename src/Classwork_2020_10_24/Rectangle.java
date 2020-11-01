package Classwork_2020_10_24;

import java.lang.String;

public class Rectangle {
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }
    public float perimeter (){
        return width*2+length*2;
    }

    public float space (){
        return width*length;
    }

    public float perimeter (int n){
        return width*2+length*2*n;
    }

    public float space (int n){
        return width*length*n;
    }

    public void resizeInProportion(float p){
        this.width = this.width * p;
        this.length = this.length * p;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
