package novi;

public class Novi {
    public static void main(String[] args) {
        String nama_saya = nama(13) + nama(14) + nama(21) + nama(8) + nama(27) +
                nama(13) + nama(8) + nama(17) + nama(12) + nama(0) + nama(24) +
                nama(20) + nama(13) + nama(8) + nama(19) + nama(0);
        System.out.println(nama_saya);
    }
    
    public static String nama(int index){
        String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
        String letter = abjad.substring(index, index + 1);
        return letter;
    }
}
