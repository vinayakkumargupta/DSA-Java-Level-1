public class Circle {
    double radius;

    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
        return Math.PI*radius*radius;

    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public static void main (String args[]){
        Circle c1 = new Circle();
        c1.radius=6.0;
        System.out.println("Area of the Circle is "+ c1.getArea());
    }
}
