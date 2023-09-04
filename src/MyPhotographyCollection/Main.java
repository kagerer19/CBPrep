package MyPhotographyCollection;

public class Main {
    public static void main(String[] args) {
        Camera Cannon5D = new Camera("Cannon 5D", 25, 7.7, true, new Lens(88, 450));
        System.out.println(Cannon5D);

        Camera Cannon80D = new Camera("Cannon 80D", 14.5, 2.7, false);
        System.out.println(Cannon80D);

        Camera Cannon81D = new Camera("Cannon 80D", 14.5, 2.7, true, new Lens(34, 55));
        System.out.println(Cannon81D);

        Camera Cannon82D = new Camera("Cannon 80D", 14.5, 2.7, false);
        System.out.println(Cannon82D);

        Camera Cannon83D = new Camera("Cannon 80D", 14.5, 2.7, true, new Lens(22, 55));
        System.out.println(Cannon83D);
    }
}
