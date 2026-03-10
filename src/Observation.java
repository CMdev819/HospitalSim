abstract class Observation {
    private int time;

    protected Observation(int tm) {
        time = tm;
    }

    public int getTime() {
        return time;
    }

    abstract public boolean critical();
    abstract public String data();

}