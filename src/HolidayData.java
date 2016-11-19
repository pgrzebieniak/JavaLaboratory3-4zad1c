
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HolidayData
{
    private Scanner scanner = new Scanner(System.in);
    private List<Holiday> holidays = new ArrayList<>();

    public List<Holiday> getHolidaysData()
    {
        String userAnswer;


             String country;
             String city;
             String hotelName;
             double pricePerNight;
             int peopleInRoom;
             int countDays;

            System.out.println("Podaj Kraj :");
            country = scanner.nextLine();

            System.out.println("Podaj miasto:");
            city = scanner.nextLine();

            System.out.println("Podaj hotel:");
            hotelName = scanner.nextLine();

            System.out.println("Podaj hotel:");
            hotelName = scanner.nextLine();

            System.out.println("Podaj cene pokoju:");
            pricePerNight = Double.parseDouble(scanner.nextLine());

            System.out.println("Podaj ilość osób w pokoju:");
            peopleInRoom = Integer.parseInt(scanner.nextLine());

            System.out.println("Podaj ilość dni:");
            countDays = Integer.parseInt(scanner.nextLine());

            System.out.println("Type term (winter, autumn, spring, summer):");

            Holiday holidays = new Holiday(country,  city, hotelName,pricePerNight, countDays, peopleInRoom);

        getHolidaysData().add(holidays);

        return getHolidaysData();
    }
}
