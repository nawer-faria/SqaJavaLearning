package abstraction;

public class HotelPanPacific extends HotelReservationMoreThan0Abstraction {

    @Override
    int getAvailableRoomNumber() {
        return 30;
    }

    @Override
    String getFoodMenu() {
        return "Rice, Meat, Dal, Doi ";
    }

    public void aboutHotel(){
        System.out.println("A conveniently located hotel in Dhaka with luxury facilities, Pan Pacific Sonargaon Dhaka is the ideal accommodation for a pampering stay!");
    }

    public static void main(String[] args) {

        //Abstraction with implementation > 0%
        HotelPanPacific hotel1 = new HotelPanPacific();
        hotel1.hotelName = "Pan Pacific Sonargaon";
        hotel1.guestCapacity = 1000;
        hotel1.is5Star = true;
        hotel1.staffCount = 300;
        hotel1.displayGreetings();
        hotel1.printInfo();
        System.out.println("Available Room: " + hotel1.getAvailableRoomNumber());
        System.out.println("Food Menu: " + hotel1.getFoodMenu());
        hotel1.aboutHotel();

    }
}
