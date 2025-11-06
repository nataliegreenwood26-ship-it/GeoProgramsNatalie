public class A1_HowToMove extends World {

    int width;
    int BlueColor;
    int GreenColor;
    int size;

    //todo: add a paramater (special type of variable that is defined inside the parentheses of method and can only be used inside that method) to triangle that controls how big it is



    public void go() {
        tri(200);
        square(200);
        square(100);


    }
    public void tri(int size) {
        width = 4;
        BlueColor=plane.random(0,210);
        System.out.println("This message will be printed to the window below.");
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.setColor(10, 100, BlueColor);
        plane.trailWidth = width;
        plane.move(size);
        plane.turn(-120);
        plane.move(size);
        plane.turn(-120);
        plane.move(size);


    }

    public void square(int size) {
        System.out.println("This message will be printed to the window below.");
        plane.startingAngle(90);
        plane.isTrail = true;
        GreenColor=plane.random(0,200);
        plane.setColor(100, GreenColor, BlueColor );
        plane.trailWidth = width;
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
    }
}

