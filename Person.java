

public class Person {

    private String gender;
    private String[] splitStr;
    private String start = "8 สิงหาคม พ.ศ.2564";
    private String end = "31 สิงหาคม พ.ศ.2564";

    public Person(String gender, String date_of_birth) {
        this.gender = gender;
        this.splitStr = date_of_birth.split(" ");

        for (int i = 0; i < splitStr.length; i++) {
            System.out.println(splitStr[i]);
        }
    }

    public int get_year() {
        return Integer.parseInt(splitStr[3].substring(4));// Year
    }

    public String get_month() {
        return splitStr[2]; // Month
    }

    public int get_day() {
        return Integer.parseInt(splitStr[1]); // day
    }

    public int get_numberMonth() {
        switch (get_month()) {
            case "มกราคม": return 1;
            case "กุมภาพันธ์": return 2;
            case "มีนาคม": return 3;
            case "เมษายน": return 4;
            case "พฤษภาคม": return 5;
            case "มิถุนายน": return 6;
            case "กรกฎาคม": return 7;
            case "สิงหาคม": return 8;
            case "กันยายน": return 9;
            case "ตุลาคม": return 10;
            case "พฤศจิกายน": return 11;
            case "ธันวาคม": return 12;
            default: return 0;
        }
    }

    public int get_age(){
        if (get_year() < 2499){
            return 2564 - get_year();
        }else if (get_year() == 2499 && get_numberMonth() <= 8){
            return 65;
        }else if (get_year() == 2499 && get_numberMonth() > 8){
            return 64;
        }else if(get_year() > 2499 && get_year() < 2562){
            return 2564 - get_year();
        }else if (get_year() >= 2562 && get_year() < 2564 ){
            return 2564 - get_year();
        }else{
            return 0;
        }
    }

    public boolean check_string(){
        if(splitStr.length == 4 && get_day() > 0 && get_day() < 32){
            return true;
        }else{
            System.out.println(splitStr.length);
            return false;
        }
    }

    public String eligible_flag() {
        if (check_string() == true) {
            if(get_age() >= 65){
                return "1";
            }else if (get_age() == 64){
                start = "วันที่ " + get_day() + " " + get_month() + " พ.ศ." + get_year();
                return "2";
            }else if (get_age() >= 0 && get_age() <= 2) {
                return "3";
            }else if (get_age() == 0 && get_numberMonth() <= 2){
                start = "วันที่ " + get_day() + " " + get_numberMonth()+6 + " พ.ศ.2564 - 31 สิงหาคม พ.ศ.2564";
                return "4";
            }else if (get_age() == 0 && get_numberMonth() > 2){
                return "5";
            }else {
                return "0";
            }
        }else {
            return "5";//"ไม่สามารถเข้ารับบริการได้"
        }
    }
}