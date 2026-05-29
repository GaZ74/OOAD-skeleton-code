package ooad.ucrr01;

public class Room {
    private final String roomId;
    private final String description;
    private final int capacity;

    public Room(String roomId, String description, int capacity) {
        this.roomId = roomId;
        this.description = description;
        this.capacity = capacity;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return roomId + " - " + description + " (capacity: " + capacity + ")";
    }
}
