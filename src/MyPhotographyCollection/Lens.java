package MyPhotographyCollection;

public class Lens {
    private double minLensZoom;
    private double maxLensZoom;

    static int lensCount = 0;

    Lens(double lensZoomMin, double lensZoomMax) {
        if (lensZoomMax > lensZoomMin) {
            this.minLensZoom = lensZoomMin;
        } else {
            throw new IllegalArgumentException("Maximum focal length must always be greater than the specified minimum focal length");
        }

        this.maxLensZoom = lensZoomMax;
        lensCount++;
    }

    public double getMinZoom() {
        return minLensZoom;
    }

    public double getMaxZoom() {
        return maxLensZoom;
    }

    public void setZoom(double lensZoomMin, double lensZoomMax) {
        if (lensZoomMax > lensZoomMin) {
            this.minLensZoom = lensZoomMin;
        } else {
            throw new IllegalArgumentException("Maximum focal length must always be greater than the specified minimum focal length");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n-Lens details-\n");
        result.append("Max Zoom: ").append(getMaxZoom()).append("\n");
        result.append("Min Zoom: ").append(getMinZoom()).append("\n");
        result.append("\n-Lens count-\n").append(lensCount).append("\n");

        return result.toString();
    }
}
