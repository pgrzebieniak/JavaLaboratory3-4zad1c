
import java.util.List;

public class PrintHoliday {
    
    public void Show(List<Holiday> holidays)
    {
        for (Holiday holiday: holidays)
        {
            System.out.println("Kraj: " + holiday.country);
            System.out.println("Miasto: " + holiday.city);
            System.out.println("Nazwa Hotelu: " + holiday.hotelName);
            System.out.println("Cena: " + holiday.getPricePerRoom());
            System.out.println("Ilość dni: " + holiday.countDays);
            System.out.println();
        }
    }
}
}
