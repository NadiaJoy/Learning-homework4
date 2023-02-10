import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Part 1
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
        //ex.4
        System.out.println("Volume = " + figureVolume);
        //ex.5
        figure.calcSurfaceArea();

        //Part 2
        //ex.3
        Client perepelkin = new Client("Perepelkin Petr", 256.3, 325131234);
        Client ivanova =  new Client("Ivanov Jan", 1458.95, 366010100);
        Client tamm = new Client("Tamm Anna", 998.44, 491020112);
        //ex.5
        String tereClient = perepelkin.greetings() +", "+ perepelkin.name;
        System.out.println(tereClient);




    }
}
