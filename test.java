import java.util.Locale;

public class test {
    public static void main(String[] args) {
        Locale thai = new Locale("th", "TH");
        Locale.setDefault(thai);
        String input = "1 มกราคม 2540";
        String[] splitStr = input.split("\\s+");
        for(int i = 0; i < splitStr.length; i++) {
            System.out.println(splitStr[i]);
        }
    }
}
