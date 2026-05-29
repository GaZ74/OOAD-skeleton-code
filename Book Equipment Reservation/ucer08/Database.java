package ooad.ucer08;

public class Database {

    public boolean storeInspectionResult(String result) {
        return result != null && !result.trim().isEmpty();
    }
}
