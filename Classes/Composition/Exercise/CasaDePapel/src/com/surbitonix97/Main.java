package Exercise.CasaDePapel.src.com.surbitonix97;

public class Main {

    public static void main(String[] args) {
	    HouseBasics myHouseBasics = new HouseBasics(2,"Cement",8,true,10,5,true);
	    furniture myFurniture = new furniture(3,"KingSize",10,"Vogue",4,"funky");
	    utility myUtility = new utility(true,true,false);
	    room myRoom = new room(myUtility,myFurniture,myHouseBasics);

	    myRoom.getRoomUtility().internetOK();
	    myRoom.getRoomUtility().waterRunning();
	    myRoom.getRoomUtility().turnLightsOn();
		System.out.println(myRoom.getRoomHouseBasics().getBeamType());
		System.out.println(myRoom.getRoomHouseBasics().getBeams());
		System.out.println(myRoom.getRoomHouseBasics().isHasSwimmingPool());
		System.out.println(myRoom.getRoomFurniture().getBeds());
    }
}
