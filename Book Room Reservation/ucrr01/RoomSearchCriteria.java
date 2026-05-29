package ooad.ucrr01;

public class RoomSearchCriteria {
    private final String roomType;
    private final int capacity;

    public RoomSearchCriteria(String roomType, int capacity) {
        this.roomType = roomType;
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }
}
