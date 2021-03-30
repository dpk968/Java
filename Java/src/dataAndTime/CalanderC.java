package dataAndTime;
import java.util.Calendar;
class Result {

    public static String findDay(int month, int day, int year) {
        
        String[] allWeekName = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        int p = c.get(Calendar.DAY_OF_WEEK);        
        return allWeekName[p-1];

    }

}

public class CalanderC {
    public static void main(String[] args){
    	
    	System.out.println(Result.findDay(03,30,2021));
        
    }
}
