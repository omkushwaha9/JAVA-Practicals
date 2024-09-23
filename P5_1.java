class Room {
    double length;
    double breadth;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class BedRoom extends Room {
    double height;

    public BedRoom(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class P5_1 {
    public static void main(String[] args) {
        BedRoom bedroom = new BedRoom(10.5, 8.2, 4.0);

        System.out.println("Area of the bedroom: " + bedroom.area());
        System.out.println("Volume of the bedroom: " + bedroom.volume());
    }
}