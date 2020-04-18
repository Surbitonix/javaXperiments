package Exercise.CasaDePapel.src.com.surbitonix97;

public class HouseBasics extends House {
    private int floors;
    private String beamType;
    private int beams;
    private boolean hasGarden;
    private int windows;
    private int rooms;
    private boolean hasSwimmingPool;

    public HouseBasics(int floors, String beamType, int beams, boolean hasGarden, int windows, int rooms, boolean hasSwimmingPool){
        super("Californiana","BitchHouse",2000);
        this.floors=floors;
        this.beams=beams;
        this.beamType=beamType;
        this.hasGarden=hasGarden;
        this.windows=windows;
        this.rooms=rooms;
        this.hasSwimmingPool=hasSwimmingPool;

    }

    public int getFloors(){
        return  floors;
    }

    public String getBeamType(){
        return beamType;
    }

    public int getBeams(){
        return beams;
    }

    public boolean isHasGarden(){
        return hasGarden;
    }

    public int getWindows(){
        return windows;
    }

    private  int getRooms(){
        return rooms;
    }

    public boolean isHasSwimmingPool(){
        return hasSwimmingPool;
    }



}
