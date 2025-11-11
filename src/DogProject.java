public class DogProject extends World {
    //Variables listed below (red, green, blue, x, y). The variables store color values and coordinates (x,y).
    public int red;
    public int green;
    public int blue;
    public int x;
    public int y;

    //Main Method (go): This method shows the image, and also calls other methods that I made.
    public void go() {
        //Load and show background image --> "DOGS.png" is the image
        plane.loadBackGround("DOGS.png");
        plane.showBackGround();
        //My own custom methods:
        Imagefiltering(40,20,30);  //Method that applies a color filter (pink) to the entire image. The method has 3 parameters set at values 40, 20, and 30.
        love(100,90); //Method to create the word "love". This method has the parameter of fly and turn set at values 100 and 90.
        stars(); //Method that draws stars in the image. This method has no parameter
        sun(); //Method that draws the sun.



    }

        //Method: Imagefiltering. The parameters: moreRed, moreGreen, and moreBlue say how much color to add.
        public void Imagefiltering(int moreRed, int moreGreen, int moreBlue) {
            //Nested for loops below:
            for (y = 0; y < 800; y = y + 1) { //represents the height of the image
                for (x = 0; x < 1000; x = x + 1) { // represents the width of the image
                    plane.teleport(x, y); //Brings the plane to that position on the graph.

                    //Regular color values.
                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();

                    //Below shows where I want the color filter to be applied. In the image it is only in the box where it says "love".
                    if (x < 576 && x>20 && y<180 && y>30) {

                        //Changing the color by adding the parameters for the filter.
                        red = red + moreRed;
                        green = green + moreGreen;
                        blue = blue + moreBlue;

                        //Conditional statements. The values need to keep inside of the range, they cannot go over 255.
                        if (red > 255) red = 255;
                        if (green > 255) green = 255;
                        if (blue > 255) blue = 255;

                        //Set pixel to the new filter color at the end of the method.
                        plane.setPixelColor(red, green, blue);
                    }
                }
            }
        }

        //Method 2: My own method: love. This method draws out the word "love" at the top left of the image. This method has two parameters: fly and turn.
    public void love(int fly, int turn) {
        plane.teleport(50,50); //Plane starting position
        plane.setColor(250,0,100); //color of the word
        plane.pausetime=0;
        plane.isTrail=true; //Makes sure that a trail is left.
        //Draw the L
        plane.trailWidth = 10;
        plane.move(fly);
        plane.width=100;
        plane.turn(turn);
        plane.move(fly);
        //Draw the O
        plane.teleport(174,50);
        plane.turn(270);
        plane.move(fly);
        plane.turn(turn);
        plane.move(fly);
        plane.turn(turn);
        plane.move(fly);
        plane.turn(turn);
        plane.move(fly);
        //Draw the V
        plane.teleport(301,50);
        plane.turn(120);
        plane.move(115);
        plane.turn(120);
        plane.move(115);
        //Draw the E
        plane.teleport(437,50);
        plane.trailWidth=2;
        plane.turn(300);
        plane.trailWidth = 10;
        plane.move(90);
        plane.teleport(437,50);
        plane.turn(-90);
        plane.move(100);
        plane.turn(turn);
        plane.move(90);
        plane.teleport(442,104);
        plane.turn(0);
        plane.move(50);
        //Draw the box around the word
        plane.teleport(17,27);
        plane.move(550);
        plane.turn(-90);
        plane.move(145);
        plane.turn(-90);
        plane.move(550);
        plane.turn(-90);
        plane.move(145);

    }
// Method 3: Stars. No parameters. This method draws stars in the image.
    public void stars() {
        plane.isTrail=true;
        plane.trailWidth=3;
        plane.setColor(250, 250, 250);
        //Star 1
        plane.teleport(49,246); //Star coordinates
        plane.move(45); //Star size
        plane.turn(144); //Star angle.
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 2
        plane.teleport(126,263);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 3
        plane.teleport(67,285);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 4
        plane.teleport(195,240);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 5
        plane.teleport(171, 285);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 6
        plane.teleport(233,265);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 7
        plane.teleport(292,271);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 8
        plane.teleport(261,232);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 9
        plane.teleport(347,249);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 10
        plane.teleport(408,261);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 11
        plane.teleport(339,301);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 12
        plane.teleport(453,244);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 13
        plane.teleport(508,234);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        //Star 14
        plane.teleport(563,239);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.move(45);
        plane.turn(144);
        plane.teleport(1,1);

    }
//Method 4: Sun. This method draws a sun in the top right corner of the image.
    public void sun() {
        plane.isTrail=true;
        plane.trailWidth=2;
        plane.setColor(200,0, 20);
        for (int x=0; x<1; x++) { //Repeats once because I only need one sun. For loop (not nested)
            plane.teleport(920, 200); // Sun coordinates
            plane.circle(100);//Make a circle with a radius of 100.
        }

plane.teleport(10,10); //Place for plane to end.

    }
    }



