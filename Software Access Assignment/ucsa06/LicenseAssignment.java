package ooad.ucsa06;

public class LicenseAssignment {
    private String requestId;
    private String softwareId;
    private String machineId;

    public LicenseAssignment(String requestId, String softwareId, String machineId) {
        this.requestId = requestId;
        this.softwareId = softwareId;
        this.machineId = machineId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public String getMachineId() {
        return machineId;
    }

    @Override
    public String toString() {
        return "LicenseAssignment{requestId='" + requestId + "', softwareId='" + softwareId + "', machineId='" + machineId + "'}";
    }
}