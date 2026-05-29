package ooad.ucer01;

public class Resource {
    private final String id;
    private final String name;
    private final int availableUnits;

    public Resource(String id, String name, int availableUnits) {
        this.id = id;
        this.name = name;
        this.availableUnits = availableUnits;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", availableUnits=" + availableUnits +
                '}';
    }
}
