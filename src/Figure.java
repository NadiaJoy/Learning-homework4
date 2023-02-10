public class Figure {
    int height;
    int width;
    int length;

    public Figure() {
    }

    public Figure(int figureHeight, int figureWidth, int figureLength) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int calcVolume (int height, int width, int length) {
        int volume;
        volume = height * width * length;
        return volume;
    }

    public void calcSurfaceArea () {
        int a = 1;
        int b = 3;
        int h = 4;
        int surface;

        surface = 2 * (a * b + a * h + b * h);
        System.out.println("Surface Area = "+ surface);

    }
}
