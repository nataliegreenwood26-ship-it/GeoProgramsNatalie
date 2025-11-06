public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
 //   public int dinosaur;

    public void go() {
        plane.loadBackGround("Nat&Ma.png");
        //      plane.showBackGround();

        for (int y = 1; y < 5000; y = y + 1) {
            for (int x = 1; x < 100; x = x + 1) {
                plane.teleport(x, y);
                //             plane.teleport(x * 2, y * 2 + 1);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //             plane.teleport(x * 2, y * 2);


                if (y < 1000 && x < 2000) {
                    //                 if (300 > red && red > 210 && green > 150 && blue > 100)

                  plane.setPixelColor(red, 0, x / 4);
               plane.teleport(x * 2 + 1, y * 1);
                 //  plane.setPixelColor(y / 2, red / 4, 200);
                    plane.teleport(x * 2, y * 1 + 1);
                   plane.setPixelColor(red, (blue + green) / 4, blue);


                }
            }
        }
    }
    }

//        plane.pausetime = 0;
 //       plane.teleport(500, 400);
 //       dinosaur = plane.random(0, 2);
   //     if (dinosaur == 0) {
 //           plane.house(100);

 //       } else {
 //           plane.circle(100);
 //       }
 //   }
//}


