package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DaysBetween {
    public static void main(String ar[]) throws Exception {
        //24-May-2017, change this to your desired Start Date
        LocalDate dateBefore = LocalDate.of(2021, Month.JANUARY, 13);
        //29-July-2017, change this to your desired End Date
        LocalDate dateAfter = LocalDate.of(2021, Month.APRIL, 13);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
    }
}
