abstract class observation {
    private int time;

    protected observation(int tm){
        time = tm;
    }

    public int getTime(){
        return time;
    }


    abstract public boolean critical();
    abstract public String data();

}

class temperature extends observation {

    private double celsiusValue;

    public boolean critical(){
        // perhaps use patient specific numbers to detect if it strays from baseline
        if(celsiusValue >= 38 || celsiusValue <= 35){
            return true;
        } else {
            return false;
        }

    }

    public String data(){
        return "Temp: " + celsiusValue + "C";
    }

    public temperature(double cval, int tm){
        super(tm);
        celsiusValue = cval;
    }



}