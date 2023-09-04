package MyPhotographyCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Camera> Cams = new ArrayList<>();
    static List<Lens> Lenses = new ArrayList<>();

    public static void createCam(String make, double pixels, double displayResolution, boolean hasColor) {
        Camera newCam = new Camera(make, pixels, displayResolution, hasColor);
        Cams.add(newCam);
    }

    public static void createCam(String make, double pixels, double displayResolution, boolean hasColor, Lens lens1) {
        Camera newCam = new Camera(make, pixels, displayResolution, hasColor, lens1);
        Cams.add(newCam);
    }

    public static void createLens(double lensZoomMin, double lensZoomMax) {
        Lens newLens = new Lens(lensZoomMin, lensZoomMax);
        Lenses.add(newLens);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shouldExit = false;

        while (!shouldExit) {
            System.out.println("Enter Camera to data base");
            System.out.println("1. Insert Camera without lens");
            System.out.println("2. Insert Camera with lens");
            System.out.println("3. Insert Camera lens");
            System.out.println("4. Print stock for all");
            System.out.println("5. Print stock for lenses");
            System.out.println("6. Exit");

            int userOption = sc.nextInt();

            switch (userOption) {
                case 1 -> {
                    System.out.println("Enter Camera make/brand: ");
                    String make = sc.next();
                    System.out.println("Enter number of MegaPixels: ");
                    double pixels = sc.nextDouble();
                    System.out.println("Enter Display size: ");
                    double displayResolution = sc.nextDouble();
                    System.out.println("Does this camera take color photos? (please enter true of false): ");
                    boolean hasColor = sc.nextBoolean();
                    createCam(make, pixels, displayResolution, hasColor);
                }

                case 2 -> {
                    System.out.println("Enter Camera make/brand: ");
                    String make = sc.next();
                    System.out.println("Enter number of MegaPixels: ");
                    double pixels = sc.nextDouble();
                    System.out.println("Enter Display size: ");
                    double displayResolution = sc.nextDouble();
                    System.out.println("Does this camera take color photos? (please enter true of false): ");
                    boolean hasColor = sc.nextBoolean();
                    System.out.println("Enter lens max focal length");
                    double lensZoomMax = sc.nextDouble();
                    System.out.println("Enter lens min focal length");
                    double lensZoomMin = sc.nextDouble();
                    createCam(make, pixels, displayResolution, hasColor, new Lens(lensZoomMin, lensZoomMax));
                }

                case 3 -> {
                    System.out.println("Enter lens max focal length");
                    double lensZoomMax = sc.nextDouble();
                    System.out.println("Enter lens min focal length");
                    double lensZoomMin = sc.nextDouble();
                    createLens(lensZoomMin, lensZoomMax);
                }

                case 4 -> {
                    System.out.println(Cams.toString());
                    System.out.println("Current Camera stock: " + Camera.CamCount + "\n" + "Current lens Stock: " + Lens.lensCount);
                    }

                case 5 -> {
                    System.out.println(Lenses.toString());
                    System.out.println("Current lens Stock: " + Lens.lensCount);
                }

                case 6 -> shouldExit = true;

                default -> System.out.println("Invalid option, please choose a valid option.");
            }
        }

       /* createCam("Cannon 5D", 25, 7.7, true);

        createCam("Cannon 80D", 14.5, 2.7, false, createLens(30, 55));

        createCam("Cannon 80D", 14.5, 2.7, true, createLens(34, 50));

        createCam("Cannon 80D", 14.5, 2.7, false);

        createCam("Cannon 80D", 14.5, 2.7, true, createLens(22, 55));

        System.out.println(Lenses.toString());
        */
    }
}
