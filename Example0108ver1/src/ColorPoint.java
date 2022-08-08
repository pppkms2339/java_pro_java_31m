public class ColorPoint {

    private double x;
    private double y;
    private int r;  //[0, 255]
    private int g;  //[0, 255]
    private int b;  //[0, 255]

    public ColorPoint() {
        x = 0.0;
        y = 0.0;
        r = 255;
        g = 255;
        b = 255;
    }

    public ColorPoint(double x, double y, int r, int g, int b) {
        this.x = x;
        this.y = y;
        setR(r);
        setG(g);
        setB(b);
    }

    public void setR(int r) {
        if (r < 0) {
            this.r = 0;
        } else if (r > 255) {
            this.r = 255;
        } else {
            this.r = r;
        }
    }

    public void setG(int g) {
        if (g < 0) {
            this.g = 0;
        } else if (g > 255) {
            this.g = 255;
        } else {
            this.g = g;
        }
    }

    public void setB(int b) {
        if (b < 0) {
            this.b = 0;
        } else if (b > 255) {
            this.b = 255;
        } else {
            this.b = b;
        }
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
