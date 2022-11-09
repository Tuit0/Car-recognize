package uz.ogabek_dev;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final CreatureService service = new CreatureService();

    public static void main(String[] args) throws FileNotFoundException {
        String line = "";
        String splitBy = ",";
        List<CarModel> carModels = new ArrayList<>();
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/uz/ogabek_dev/car.data"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] car = line.split(splitBy);    // use comma as separator
                System.out.println("Car[buying=" + car[0] + ", maint=" + car[1] + ", doors=" + car[2] + ", persons=" + car[3] + ", lugBoot= " + car[4] + ", safety= " + car[5] + ", status= " + car[6] + "]");
                carModels.add(new CarModel(car[0], car[1], car[2], car[3], car[4], car[5], car[6]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("We have dataset size: " + carModels.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter buying: ");
        String buying = scanner.next();

        System.out.print("Enter maint: ");
        String maint = scanner.next();

        System.out.print("Enter doors: ");
        String doors = scanner.next();

        System.out.print("Enter persons: ");
        String persons = scanner.next();

        System.out.print("Enter lugBoot: ");
        String lugBoot = scanner.next();

        System.out.print("Enter safety: ");
        String safety = scanner.next();


        System.out.println(service.findSimilarClass(buying, maint, doors, persons, lugBoot, safety, carModels));
    }
}
