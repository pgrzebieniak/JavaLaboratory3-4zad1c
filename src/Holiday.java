
public class Holiday {

    public String country;
    public String city;
    public String hotelName;
    public double pricePerNight;
    public int peopleInRoom;
    public int countDays;

    public Holiday(String country, String city, String hotelName, double pricePerNight,int countDays, int peopleInRoom)
    {
        this.country = country;
        this.city = city;
        this.hotelName = hotelName;
        this.pricePerNight=pricePerNight;
        this.countDays=countDays;
        this.peopleInRoom=peopleInRoom;

    }

    public double getPricePerRoom()
    {
        double finalPrice=pricePerNight*peopleInRoom*countDays;

        return finalPrice;
    }



}
