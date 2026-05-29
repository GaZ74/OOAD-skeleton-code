package ooad.ucer01;

public class SearchCriteria {
    private final String equipmentType;
    private final int quantity;

    public SearchCriteria(String equipmentType, int quantity) {
        this.equipmentType = equipmentType;
        this.quantity = quantity;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "equipmentType='" + equipmentType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
