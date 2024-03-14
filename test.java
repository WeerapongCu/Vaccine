public class test {
    public static void main(String[] args) {
        Person p = new Person("วันจันทร์ที่ 10 สิงหาคม พ.ศ.2540");
        System.out.println(p.check_match());
    }
}

class Check {
    private String bd = "";
    private String[] splitStr;

    public Check(String bd) {
        this.bd = bd;
        splitStr = bd.split("\\s+");
    }

    public boolean check_match() {
        if(splitStr.length == 4){
            return true;
        }else{
            return false;
        }
    }
}
