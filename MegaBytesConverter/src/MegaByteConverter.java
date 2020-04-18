public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int megabyteConversion = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+megabyteConversion+" MB and " + remainingKB + " KB");

        }
    }
}
