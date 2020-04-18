public class Main {

    public static void main(String[] args) {
        boolean case1 = PlayingCat.isCatPlaying(true,10);
        System.out.println(case1);

        boolean case2 = PlayingCat.isCatPlaying(false,36);
        System.out.println(case2);

        boolean case3 = PlayingCat.isCatPlaying(false,35);
        System.out.println(case3);
    }
}
