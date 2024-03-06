class Person {
    private String gender;
    private String Date_of_Birth; //DD-MM-YYYY
    private String[] splitStr;
    Person(String gender, String Date_of_Birth) {
        this.gender = gender;
        this.Date_of_Birth = Date_of_Birth;
        splitStr = Date_of_Birth.split("\\s+");
    }

    public int get_year() {
        return Integer.parseInt(splitStr[2]);
    }

    public int get_month() {
        return Integer.parseInt(splitStr[1]);
    }

    public int get_numberMonth() {
        if (splitStr[1].equals("มกราคม")) {
            return 1;
        } else if (splitStr[1].equals("กุมภาพันธ์")) {
            return 2;
        } else if (splitStr[1].equals("มีนาคม")) {
            return 3;
        } else if (splitStr[1].equals("เมษายน")) {
            return 4;
        } else if (splitStr[1].equals("พฤษภาคม")) {
            return 5;
        } else if (splitStr[1].equals("มิถุนายน")) {
            return 6;
        } else if (splitStr[1].equals("กรกฎาคม")) {
            return 7;
        } else if (splitStr[1].equals("สิงหาคม")) {
            return 8;
        } else if (splitStr[1].equals("กันยายน")) {
            return 9;
        } else if (splitStr[1].equals("ตุลาคม")) {
            return 10;
        } else if (splitStr[1].equals("พฤศจิกายน")) {
            return 11;
        } else if (splitStr[1].equals("ธันวาคม")) {
            return 12;
        } else {
            return 0;
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
        }      
        else if (get_year() >= 2562 && get_year() < 2564 ){
            return 2564 - get_year();
        }else if (get_year() == 2564){
            return get_numberMonth();
        }else{
            return 0;
        }
    }

    public String check_Input() {
        //split String with spacebar
        splitStr = Date_of_Birth.split("\\s+");

        if (get_numberMonth()<6 && get_year() < 2564) {
            
        }

        return splitStr[1];
    }
}

class Vaccine {
    public static void main(String[] args) {
        Person person = new Person("Male", "1 กันยายน 2564");
        System.out.println(person.get_age());
    }   
}
