import java.util.UUID;

public class Patient {

    // General Information
    String name;
    String DoB;
    UUID patientID;
    Device[] devices;
    int assignedRoom;

    public Patient(String name, String DoB) {
        patientID = UUID.randomUUID();
        this.name = name;
        this.DoB = DoB;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }

    public UUID getPatientID() {
        return patientID;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevice(int index, Device device) {
        devices[index] = device;
    }

    public Device getDevice(int index){
        return devices[index];
    }

    public void setAssignedRoom(int assignedRoom) {
        this.assignedRoom = assignedRoom;
    }

    public int getAssignedRoom() {
        return assignedRoom;
    }
}