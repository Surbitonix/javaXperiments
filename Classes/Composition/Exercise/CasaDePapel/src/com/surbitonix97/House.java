package Exercise.CasaDePapel.src.com.surbitonix97;

public class House {
    private String type;
    private String name;
    private int size;

    public House(String type, String name, int size){
        this.type=type;
        this.name =name;
        this.size=size;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }
}
