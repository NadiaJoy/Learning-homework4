import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! I can calculate the volume of your figure. "
                + "\nEnter its height: ");
        int h = input.nextInt();
        System.out.println("Enter its width: ");
        int w = input.nextInt();
        System.out.println("Enter its lengh: ");
        int l = input.nextInt();

        Figure figure = new Figure();
        int figureVolume = figure.calcVolume(h, w, l);

        System.out.println("Volume = " + figureVolume);

        figure.calcSurfaceArea();

    }
}
