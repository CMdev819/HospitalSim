abstract class Alert {
    Patient pt;
    Observation obv;
    int time;
    int startTime;

    public Alert (Patient pt, Observation obv, int time) {
        this.pt = pt;
        this.obv = obv;
        this.time = time;
    }

    public int getStartTime() {
        return startTime;
    }

    public Patient getPt() {
        return pt;
    }

    public int getTime() {
        return time;
    }

    public Observation getObv() {
        return obv;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String toString() {
        String result = "";
        if (obv.critical()) {
            result = pt.getName() + " has a critical symptom of " + obv.data();
        } else if (!obv.critical()) {
            result = pt.getName() + " has a non-critical symptom of " + obv.data();
        }
        return result;
    }
}
