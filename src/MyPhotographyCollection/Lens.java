package MyPhotographyCollection;

public class Lens {
    private double minLensZoom;
    private double maxLensZoom;
    static int lensCount = 0;

    Lens(double lensZoomMin, double lensZoomMax) {
        if (lensZoomMax > lensZoomMin) {
            setMaxZoom(lensZoomMax);
        } else {
            throw new IllegalArgumentException("Maximum focal length must always be greater than the minimum focal length");
        }
        setMinZoom(lensZoomMin);
        lensCount++;
    }

    //Getters
    public double getMinZoom() {
        return minLensZoom;
    }

    public double getMaxZoom() {
        return maxLensZoom;
    }

    //Setters
    public void setMaxZoom(double maxZoom) {
        this.maxLensZoom = maxZoom;
    }

    public void setMinZoom(double minZoom) {
        this.minLensZoom = minZoom;
    }

    @Override
    public String toString() {
        String result = "\n-Lens details-\n" +
                "Max Zoom: " + getMaxZoom() + " mm" + "\n" +
                "Min Zoom: " + getMinZoom() + " mm" + "\n";

        return result;
    }
}
