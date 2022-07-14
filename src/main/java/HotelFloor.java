import java.util.ArrayList;
import java.util.List;

public class HotelFloor implements  HotelRoomInterface{

    private List<HotelRoomInterface> hotelRooms;



    public HotelFloor() {
        this.hotelRooms = new ArrayList<>();
    }

    @Override
    public void book(String guestName) {
      hotelRooms.forEach(child -> child.book(guestName));
    }

    @Override
    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom){
        hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom){
        hotelRooms.remove(hotelRoom);
    }



}
