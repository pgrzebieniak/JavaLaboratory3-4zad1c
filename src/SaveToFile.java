import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class SaveToFile {

    public void saveTotxt(String filename, List<Holiday> holidays)
    {
        try
        {
            PrintWriter writer = new PrintWriter("holidays.txt");

            for (Holiday holiday: holidays)
            {
                writer.println("Kraj: " + holiday.country);
                writer.println("Miasto: " + holiday.city);
                writer.println("Hotel: " + holiday.hotelName);
                writer.println("Cena: " + holiday.getPricePerRoom());
            }
            writer.close();
        }
        catch(FileNotFoundException e)
        {
            e.getMessage();
        }
    }
}
