public class queue {

    private queueRecord head; //points to beginning of queue
    private queueRecord tail; //points to last object of queue

    public void enqueue(Alert newAlert){
        //creates new queueRecord with Alert al at end of queue
    }
    public Alert dequeue(){
        //moves head to refer to next item
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


}
