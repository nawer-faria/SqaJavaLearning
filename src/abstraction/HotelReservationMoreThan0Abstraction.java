package abstraction;

public abstract class HotelReservationMoreThan0Abstraction {
    String hotelName;
    int guestCapacity;
    boolean is5Star;
    int staffCount;

    abstract int getAvailableRoomNumber();

    abstract String getFoodMenu();

    public void printInfo() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Guest Capacity: " + guestCapacity);
        System.out.println("Hotel is a 5 star Hotel: " + is5Star);
        System.out.println("Hotel has " + staffCount + " staff");

    }

    public void displayGreetings() {
        System.out.println(">>>>>>>>>>>Wellcome to " + hotelName + "<<<<<<<<<<<<<");

    }
}
