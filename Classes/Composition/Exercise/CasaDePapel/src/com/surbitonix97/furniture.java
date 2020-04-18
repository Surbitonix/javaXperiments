package Exercise.CasaDePapel.src.com.surbitonix97;

public class furniture {
    private int beds;
    private String bedtype;
    private int chairs;
    private String chairType;
    private int desks;
    private String deskTypes;

    public furniture(int beds, String bedtype, int chairs, String chairType, int desks, String deskTypes){
        this.beds=beds;
        this.bedtype=bedtype;
        this.chairs=chairs;
        this.chairType=chairType;
        this.desks=desks;
        this.deskTypes=deskTypes;

    }

    //using method overload so dont have to input all the fields.
    public void furnitureItems(int beds, int chairs, int desks){
        int bedCount=beds+=beds;
        int chairCount=chairs+=chairs;
        int deskCount=desks+=desks;
        System.out.println("there are "+bedCount+" beds");
        System.out.println("there are "+chairCount+" chairs");
        System.out.println("there are "+deskCount+" desks");

    }

    public void furnitureItems(int beds, String bedtype, int chairs, String chairType, int desks, String deskTypes){
        int bedCount=beds+=beds;
        int chairCount=chairs+=chairs;
        int deskCount=desks+=desks;
        System.out.println("there are "+bedCount+" beds");
        System.out.println("there are "+chairCount+" chairs");
        System.out.println("there are "+deskCount+" desks");

    }

    public int getBeds(){
        return beds;
    }

    public String getBedtype(){
        return bedtype;
    }

    public int getChairs(){
        return chairs;
    }

    public String getChairType(){
        return chairType;
    }

    public int getDesks(){
        return desks;
    }

    public String getDeskTypes(){
        return deskTypes;
    }
}
