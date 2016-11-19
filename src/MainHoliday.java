import java.util.ArrayList;
import java.util.List;
public class MainHoliday {

    public static void main(String[] args) {
        HolidayData holidayData = new HolidayData();
        //VacationDataDisplayer displayer = new VacationDataDisplayer();
        SaveToFile saveToFile = new SaveToFile();
        List<Holiday> holidays = new ArrayList<>();
PrintHoliday printHoliday=new PrintHoliday();

        try {
            holidays = holidayData.getHolidaysData();
        } catch (Exception var9) {
            System.out.println(var9.getMessage());
        } finally {
            if(((List) holidays).size() > 0) {
                printHoliday.Show((List)holidays);
                saveToFile.saveTotxt("Wakacje.txt", (List)holidays);
            } else {
                System.out.println("No offers to show and save");
            }

        }

    }
}
