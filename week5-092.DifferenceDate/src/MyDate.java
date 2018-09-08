import java.lang.Math;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        
        MyDate later;
        MyDate first;
        
        if (earlier(comparedDate)) {
            later = comparedDate;
            first = new MyDate(day, month, year);
        } else {
            later = new MyDate(day, month, year);
            first = comparedDate;
        }
        
        
        int fullYear = 0;
        if (
            first.month > later.month ||
            (first.month - later.month == 0 && first.day > later.day)
           ) {

            fullYear = 1;
        }
        return later.year - first.year - fullYear; 
    }
    
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
