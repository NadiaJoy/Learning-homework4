public class Figure {
    int height;
    int width;
    int length;

    public Figure() {
    }

    public Figure(int figureHeight, int figureWidth, int figureLength) {
        this.height = figureHeight;
        this.width = figureWidth;
        this.length = figureLength;
    }

    public int calcVolume (int height, int width, int length) {
        int volume;
        volume = height * width * length;
        return volume;
    }

    public void calcSurfaceArea () {
        int a = this.length;
        int b = this.width;
        int h = this.height;
        int surface;

        surface = 2 * (a * b + a * h + b * h);
        System.out.println("Surface Area = "+ surface);

    }
}
