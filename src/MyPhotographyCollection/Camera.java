package MyPhotographyCollection;

public class Camera {
    private String brand;
    private double megaPixels;
    private double displayCamCount;
    private boolean isColor;
    public Lens myLens;
    static int CamCount = 0;

    Camera() {
    }

    Camera(String make, double pixels, double displayResolution, boolean hasColor) {
        this.brand = make;
        this.megaPixels = pixels;
        this.displayCamCount = displayResolution;
        this.isColor = hasColor;
        CamCount++;
    }

    Camera(String make, double pixels, double displayResolution, boolean hasColor, Lens lens1) {
        this.brand = make;
        this.megaPixels = pixels;
        this.displayCamCount = displayResolution;
        this.isColor = hasColor;
        setLens(lens1);
        CamCount++;
    }

    public String getBrand() {
        return brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public double getDisplayCamCount() {
        return displayCamCount;
    }

    public boolean getColorSpec() {
        return isColor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLens(Lens lens1) {
        this.myLens = lens1;
    }

    public void setMegaPixels(double pixels) {
        this.megaPixels = pixels;
    }

    public void setDisplayCamCount(double displayResolution) {
        this.displayCamCount = displayResolution;
    }

    public void setColor(boolean hasColor) {
        this.isColor = hasColor;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n-Camera details-\n");
        result.append("Brand: ").append(getBrand()).append("\n");
        result.append("Mega Pixels: ").append(getMegaPixels()).append("\n");
        result.append("Display CamCount: ").append(getDisplayCamCount()).append("\n");
        result.append("Color: ").append(getColorSpec()).append("\n");
        result.append("\n-Camera count-\n").append(CamCount).append("\n");


        if (myLens != null) {
            result.append("\n-Lens details-\n");
            result.append("Max Zoom: ").append(myLens.getMaxZoom()).append("\n");
            result.append("Min Zoom: ").append(myLens.getMinZoom()).append("\n");
            result.append("\n-Lens count-\n").append(Lens.lensCount).append("\n");
        } else {
            result.append("\nNo lens information found\n");
        }
        return result.toString();
    }
}
