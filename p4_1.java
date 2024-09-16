public class p4_1 {
    public static void main(String[] args) {

    }

    int day;
    String month;
    int year;

    void set_date(int d, String s, int y) {
        day = d;
        month = s;
        year = y;

    }

    void get_date() {
        System.out.println(day, month, year);
    }
}
