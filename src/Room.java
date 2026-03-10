public class Room extends Hospital {
    int roomNum;
    Patient roomPatient;
    Nurse mainNurse;
    Nurse assistingNurse;

    public Room(int roomNum) {
        this.roomNum = roomNum;
    }

    public Room(int roomNum, Patient assignee1) {
        this.roomNum = roomNum;
        roomPatient = assignee1;
    }

    public Room(int roomNum, Patient assignee1, Nurse assignee2) {
        this.roomNum = roomNum;
        roomPatient = assignee1;
        mainNurse = assignee2;
    }

    public Room(int roomNum, Patient assignee1, Nurse assignee2, Nurse assignee3) {
        this.roomNum = roomNum;
        roomPatient = assignee1;
        mainNurse = assignee2;
        assistingNurse = assignee3;
    }

    public void assignMainNurse(Nurse assignee1) {
        mainNurse = assignee1;
    }

    public void removeMainNurse() {
        mainNurse = null;
    }

    public void assignAssistingNurse(Nurse assignee1) {
        assistingNurse = assignee1;
    }

    public void removeAssistingNurse() {
        mainNurse = null;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public Patient getRoomPatient() {
        return roomPatient;
    }

    public Nurse getMainNurse() {
        return mainNurse;
    }

    public Nurse getAssistingNurse() {
        return assistingNurse;
    }
}
