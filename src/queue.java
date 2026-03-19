public class queue {

    private queueRecord head; //points to beginning of queue
    private queueRecord tail; //points to last object of queue

    public void enqueue(Alert newAlert){
        //creates new queueRecord with alert al at end of queue
        if(tail == null){
            head = new queueRecord(newAlert);
            tail = head;
        } else {
            tail.next = new queueRecord(newAlert);
            tail = tail.next;
        }
    }
    public Alert dequeue(){
        //moves head to refer to next item
        if(head == null){
            return null;
        } else {
            Alert dequeuedAlert = head;
            head = head.next;
            return dequeuedAlert;
        }
    }
    public Alert peek(){
        //returns first item in queue
        return head.alert;
    }
    public int count(){
        //returns total number of items in queue
        if(head == null){
            return 0;
        }
        int i = 0;
        Alert current = head;
        while(current.next != null){
            i++;
            current = current.next;
        }
        return i;
    }

    private class queueRecord{
        public Alert alert;
        public queueRecord next;

        public queueRecord(Alert al){
            alert = al;
            next = null;
        }
    }

}
