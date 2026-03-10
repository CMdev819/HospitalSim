import java.util.UUID;

public class Nurse {
    // NurseQueue queue;
    String name;
    UUID employeeID;

    public void transferTo(Room currentRoom, Room newDestination, String roleChange) {
        if (roleChange.compareToIgnoreCase("main to main") == 0) {
            currentRoom.removeMainNurse();
            Nurse previousNurse = newDestination.getMainNurse();
            newDestination.assignMainNurse(this);
            // queue.addNurse(previousNurse);
        } else if (roleChange.compareToIgnoreCase("main to assisting") == 0) {
            currentRoom.removeMainNurse();
            Nurse previousNurse = newDestination.getAssistingNurse();
            newDestination.assignAssistingNurse(this);
            // queue.addNurse(previousNurse);
        } else if (roleChange.compareToIgnoreCase("assisting to main") == 0) {
            currentRoom.removeAssistingNurse();
            Nurse previousNurse = newDestination.getMainNurse();
            newDestination.assignMainNurse(this);
            // queue.addNurse(previousNurse);
        } else if (roleChange.compareToIgnoreCase("assisting to assisting") == 0) {
            currentRoom.removeAssistingNurse();
            Nurse previousNurse = newDestination.getAssistingNurse();
            newDestination.assignAssistingNurse(this);
            // queue.addNurse(previousNurse);
        }
    }

}
