package ooad.ucer07;

public class Database {

    public boolean updateResourceStatus(String status) {
        // Skeleton behavior for demo/testing.
        return "READY".equalsIgnoreCase(status) || "RETURNED".equalsIgnoreCase(status);
    }
}
