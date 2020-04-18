package Exercise.CasaDePapel.src.com.surbitonix97;

public class utility {

    private boolean hasElectricity;
    private boolean hasWater;
    private boolean hasInternet;

    public utility(boolean hasElectricity, boolean hasInternet, boolean hasWater){
        this.hasElectricity=hasElectricity;
        this.hasInternet=hasInternet;
        this.hasWater=hasWater;

    }

    public void turnLightsOn(){
        if (hasElectricity)
        {
            System.out.println("Lights turned on");
        }
        else
            {
            System.out.println("there is no electricity.\nligths are off");
            }
    }

    public void internetOK(){
        if (hasInternet)
        {
            System.out.println("Internet is available");
        }
        else
            {
            System.out.println("there is no internet");
            }
    }

    public void waterRunning(){
        if (hasWater)
        {
            System.out.println("water is running");
        }
        else
            {
            System.out.println("there is no water");
            }
    }





}
