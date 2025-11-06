public class ExitTicket extends World {

    public void go() {
        int distance;

            for (int x = 1; x < 5; x++) {
                System.out.println(x);
            distance = plane.random(1, 100);
            plane.trailWidth = 5;
            plane.isTrail = true;
            plane.turn(90);
            plane.move(distance);
        }
    }
}