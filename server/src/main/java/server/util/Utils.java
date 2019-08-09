package server.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    private static final ThreadLocal<DatatypeFactory> threadDTF = new ThreadLocal<>();

    public static String dateToXmlDate(int date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(date * 1000L));
        cal.add(Calendar.HOUR_OF_DAY, -8);

        XMLGregorianCalendar dateType = getDTF().newXMLGregorianCalendar();
        dateType.setTimezone(0);
        dateType.setYear(cal.get(Calendar.YEAR));
        //由于Calendar.MONTH取值范围为0~11,需要加1
        dateType.setMonth(cal.get(Calendar.MONTH) + 1);
        dateType.setDay(cal.get(Calendar.DAY_OF_MONTH));
        dateType.setHour(cal.get(Calendar.HOUR_OF_DAY));
        dateType.setMinute(cal.get(Calendar.MINUTE));
        dateType.setSecond(cal.get(Calendar.SECOND));
        return dateType.toString();
    }

    public static DatatypeFactory getDTF() {
        DatatypeFactory dtf = threadDTF.get();
        if (dtf == null) {
            try {
                dtf = DatatypeFactory.newInstance();
            } catch (Exception e) {
            }
            threadDTF.set(dtf);
        }
        return dtf;
    }

}
