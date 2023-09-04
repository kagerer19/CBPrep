package MyPhotographyCollection;

public class Camera {
    private String brand;
    private double megaPixels;
    private double displaySize;
    private boolean isColor;
    private Lens myLens;
    static int CamCount = 0;

    Camera(String make, double pixels, double displayResolution, boolean hasColor) {
        setBrand(make);
        setMegaPixels(pixels);
        setDisplay(displayResolution);
        setColor(hasColor);
        CamCount++;
    }

    Camera(String make, double pixels, double displayResolution, boolean hasColor, Lens lens1) {
        setBrand(make);
        setMegaPixels(pixels);
        setDisplay(displayResolution);
        setColor(hasColor);
        setLens(lens1);
        CamCount++;
    }

    //Getters
    public String getBrand() {
        return brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public boolean getColorSpec() {
        return isColor;
    }


    //Setters
    public void setBrand(String make) {
        this.brand = make;
    }

    public void setLens(Lens lens1) {
        this.myLens = lens1;
    }

    public void setMegaPixels(double pixels) {
        this.megaPixels = pixels;
    }

    public void setDisplay(double displayResolution) {
        this.displaySize = displayResolution;
    }

    public void setColor(boolean hasColor) {
        this.isColor = hasColor;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n-Camera details-\n");
        result.append("Brand: ").append(getBrand()).append("\n");
        result.append("Mega Pixels: ").append(getMegaPixels()).append(" MP").append("\n");
        result.append("Display: ").append(getDisplaySize()).append(" in").append("\n");
        result.append("Color-images: ").append(getColorSpec()).append("\n");

        if (myLens != null) {
            result.append("\n-Lens details-\n");
            result.append("Max Zoom: ").append(myLens.getMaxZoom()).append(" mm").append("\n");
            result.append("Min Zoom: ").append(myLens.getMinZoom()).append(" mm").append("\n");
        } else {
            result.append("\nNo lens information found for this Camera\n");
        }
        return result.toString();
    }
}
