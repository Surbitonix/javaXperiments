package Exercise.CasaDePapel.src.com.surbitonix97;

public class room {
    private utility roomUtility;
    private furniture roomFurniture;
    private HouseBasics roomHouseBasics;


    public room(utility roomUtility, furniture roomFurniture, HouseBasics roomHouseBasics){
        this.roomUtility=roomUtility;
        this.roomFurniture=roomFurniture;
        this.roomHouseBasics=roomHouseBasics;

    }

    public utility getRoomUtility() {
        return roomUtility;
    }

    public furniture getRoomFurniture() {
        return roomFurniture;
    }

    public HouseBasics getRoomHouseBasics() {
        return roomHouseBasics;
    }
/*public void myRoom(){
        roomFurniture.furnitureItems(1,2,1);
        roomUtility.internetOK();
        roomUtility.turnLightsOn();
        roomUtility.waterRunning();
        roomHouseBasics.getBeams();

    }*/

}
