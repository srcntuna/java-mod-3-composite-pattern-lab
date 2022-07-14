public class HotelManager {
    public static void main(String[] args) {

        Logger.Logger.getInstance().log("Managing hotel...");

        Hotel hiltonHotel = new Hotel();
        HotelFloor floor1 = new HotelFloor();
        HotelFloor floor2  = new HotelFloor();
        HotelRoom room101 = new HotelRoom();
        HotelRoom room102 = new HotelRoom();
        HotelRoom room103 = new HotelRoom();
        HotelRoom room201 = new HotelRoom();
        HotelRoom room202 = new HotelRoom();
        HotelRoom room203 = new HotelRoom();
        hiltonHotel.addHotelFloor(floor1);
        hiltonHotel.addHotelFloor(floor2);
        floor1.addHotelRoom(room101);
        floor1.addHotelRoom(room102);
        floor1.addHotelRoom(room103);
        floor2.addHotelRoom(room201);
        floor2.addHotelRoom(room202);
        floor2.addHotelRoom(room203);

        //book entire hotel for Sercan
        System.out.println("----Booking entire hotel for Sercan----");
        hiltonHotel.book("Sercan");
        System.out.println("---------------------------------------");

        //clean entire hotel room by room
        System.out.println("----Cleaning entire hotel room by room----");
        hiltonHotel.clean();
        System.out.println("---------------------------------------");

        //book entire floor for Josh
        System.out.println("----Booking entire floor1 for Josh----");
        floor1.book("Josh");
        System.out.println("---------------------------------------");

        //clean entire first floor room by room
        System.out.println("----Cleaning entire first floor room by room----");
        floor1.clean();
        System.out.println("---------------------------------------");

        //book room203 for David
        System.out.println("----Booking Room203 for David----");
        room203.book("David");
        System.out.println("---------------------------------------");

    }
}
