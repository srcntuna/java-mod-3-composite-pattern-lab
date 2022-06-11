# Composite Pattern Lab

## Learning Goals

- Apply the composite pattern.

## Instructions

Let's model hotel rooms and hotel floors using the Composite design pattern. In
this example:

- A floor will have one or more rooms
- A floor cannot have other floors on it
- A room will support the following actions:
  - `book(String guestName)` - this books a room for a specific person. For this
    example, we will not model a person object and instead use a simple string
    value.
  - `clean()` - this cleans the room
- When applied to an entire floor, these actions delegate to each room

Hints:

- This is a basic implementation, so each of your method just needs to output
  what it's supposed to have done. We won't implement the actual underlying
  functionality.
- Customize your output so it can give you a good idea of what's being done,
  i.e. booking vs cleaning, a single room vs an entire floor, etc...

Base solution:

```java
package com.flatiron.patterns;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");

        // create hotel rooms
        // create hotel floors
        // add hotel rooms to hotel floors
        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        // behaviors
    }
}

interface HotelRoomInterface {
    void book(String guestName);
    void clean();
}

class HotelRoom implements HotelRoomInterface {
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }
}

class HotelFloor implements HotelRoomInterface {
    private List<HotelRoomInterface> hotelRooms = new ArrayList<HotelRoomInterface>();

    public void book(String guestName) {
        hotelRooms.forEach(child -> {
            child.book(guestName);
        });
    }

    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.remove(hotelRoom);
    }
}
```
