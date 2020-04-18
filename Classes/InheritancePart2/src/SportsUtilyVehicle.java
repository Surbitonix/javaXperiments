public class SportsUtilyVehicle extends Car {
    private String designType;
    private int height;
    private int weight;
    private boolean offRoad;
    private boolean Xover;

    public SportsUtilyVehicle(String designType,int height,int weight,boolean offRoad, boolean Xover){
        super(4,1,"diesel",4,4,2,8,6,"red");
    }

    public String getDesignType() {
        return designType;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public boolean isXover() {
        return Xover;
    }
}
