public class DogProject extends World {
    //Variables listed below (red, green, blue, x, y)
    public int red;
    public int green;
    public int blue;
    public int x;
    public int y;

    //Method 1:
    public void go() {
        //Load and show background image --> "DOGS.png" is the image
        plane.loadBackGround("DOGS.png");
        plane.showBackGround();
        //My own methods:
        Imagefiltering(40,20,30);  //method that applies a color filter (pink) to the entire image
        hearts(100);

    }

        //Method: Imagefiltering
        public void Imagefiltering(int redChange, int greenChange, int blueChange) {
            //Nested for loops below:
            for (y = 0; y < 800; y = y + 1) { //represents the height of the image
                for (x = 0; x < 1000; x = x + 1) { // represents the width of the image
                    plane.teleport(x, y);

                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();

                    if (x < 1000) {
                        red = red + redChange;
                        green = green + greenChange;
                        blue = blue + blueChange;

                        //range of colors:
                        if (red > 255) red = 255;
                        if (green > 255) green = 255;
                        if (blue > 255) blue = 255;

                        plane.setPixelColor(red, green, blue);
                    }
                }
            }
        }

    public void hearts(int distance) {
        plane.teleport(50,50);
        plane.setColor(0,100,0);
        plane.pausetime=0;
        plane.isTrail=true;
        plane.move(distance);
        plane.width=100;
        plane.turn(90);
        plane.move(distance);
        plane.teleport(174,50);
        plane.turn(270);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
    }
}




