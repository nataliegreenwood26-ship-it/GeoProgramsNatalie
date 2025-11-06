public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;

        //todo: make 3 rows of squares
        for (int y = 0; y < 3; y = y + 1) {
            for (int x = 0; x < 5; x = x + 1) {
                System.out.println("x: " + x);
                plane.pausetime = 3;
                int blue = 40 + 50 * x;
                plane.setColor(0, 40, blue);
                plane.startingAngle(0);
                    plane.teleport(100 + 150 * x, 150 + 200 * y);
                plane.square(100);

                plane.isTrail = false;
                plane.move(100);

            }

        }
    }
}
