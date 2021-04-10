package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateBeforeCheck {
    public static void main(String ar[]) {
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        cal.add(Calendar.DATE, -1);
        cal2.add(Calendar.DATE, 2);
        Date pre1 = cal.getTime();
        Date pre2 = cal2.getTime();

        List<Reserver> res = new ArrayList();
        Reserver r1 = new Reserver();
        Date d = new Date();
        checkbetween(pre1, pre2, d);
        // d.setTime(1222222);
        Reserver r2 = new Reserver(new Date(), d);
        res.add(r1);
        res.add(r2);
    }

    private static boolean checkbetween(Date start, Date end, Date check) {

        boolean flag = false;
        flag = check.after(start) && check.before(end);
        boolean before=start.after(check);
        boolean after=end.before(check);
        System.out.println(" falg="+flag);
return flag;

    }

}


class Reserver{
    Date start;
    Date end;
    Reserver(){}

    Reserver(Date start,Date end){
       this.start=start;
       this.end=end;
    }

}
