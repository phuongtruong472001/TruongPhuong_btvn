
package bai2;

import java.util.Scanner;
public class Date {
    private int day;
    private int month;
    private int year;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        this.day = scanner.nextInt();
        this.month = scanner.nextInt();
        this.year = scanner.nextInt();
    }
    
    @Override
    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
