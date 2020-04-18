public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        int maxTempCheck = summer ? 45 : 35;
        return (temperature >= 25) && (temperature <= maxTempCheck);

    }
}
