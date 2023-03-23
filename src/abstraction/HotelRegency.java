package abstraction;

public class HotelRegency extends HotelReservationMoreThan0Abstraction {
    @Override
    int getAvailableRoomNumber() {
        return 33;
    }

    @Override
    String getFoodMenu() {
        return null;
    }

    public static void main(String[] args) {

        //Abstraction with implementation > 0%
        HotelRegency hotel2 = new HotelRegency();
        hotel2.hotelName = "Hotel Regency";
        hotel2.guestCapacity = 800;
        hotel2.is5Star = false;
        hotel2.staffCount = 200;
        hotel2.displayGreetings();
        hotel2.printInfo();
        System.out.println("Available Room: " + hotel2.getAvailableRoomNumber());
        System.out.println("Food Menu: " + hotel2.getFoodMenu());

    }
}
