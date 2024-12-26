package assignments;

enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30),
    JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
    private final int days;
    Month(int days) { this.days = days; }
    public int getDays() { return days; }
}

public class DaysOfYear {
	
    public static void main(String[] args) {
        getDaysOfYear(Month.MAR, 15);
		getDaysOfYear(Month.DEC, 31);
		getDaysOfYear(Month.FEB, 30);
		getDaysOfYear(Month.JUN, 31);
		getDaysOfYear(Month.JAN, 0);
    }

    static void getDaysOfYear(Month month, int noofdays) {
        int days = 0;
        if (noofdays <= 0 || noofdays > month.getDays()) {
            System.out.printf("%d of %s is an invalid date\n", noofdays, month);
            return;
        }
        else {
            for (Month m : Month.values()) {
                if (m == month) {
                    days += noofdays;
                    break;
                }
                days += m.getDays();
            }
            System.out.println("Total Days = " + days);    
        }
    }
    
}