class Temperature extends Observation {

    private double celsiusValue;

    public boolean critical(){
        // perhaps use patient specific numbers to detect if it strays from baseline
        if (celsiusValue >= 38 || celsiusValue <= 35) {
            return true;
        } else {
            return false;
        }

    }

    public String data(){
        return "Temp: " + celsiusValue + "C";
    }

    public Temperature(double cval, int tm){
        super(tm);
        celsiusValue = cval;
    }



}