
/**
 * Class constructor of the clock of world game of Enterprizes (Date & Time)
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class Clock{
    private CyclicCounter date; //for the date (DD: DD/MM/YYYY)
    private CyclicCounter month; //for the month (MM: DD/MM/YYYY)
    private CyclicCounter year; //for the year (YYYY: DD/MM/YYYY)
    private CyclicCounter hours; //for the hour
    private CyclicCounter minutes; //for the minutes
    private static int games = 1; //counter for how many times the years have been reseted
    
    public Clock(){
       date = new CyclicCounter(30);
       date.setCounter(1);
       month = new CyclicCounter(12);
       month.setCounter(1);
       year = new CyclicCounter(99999);
       year.setCounter(1990);
       
       hours = new CyclicCounter(23);
       hours.setCounter(9);
       minutes = new CyclicCounter(59);
       minutes.setCounter(0);
    }
    
    public int getDate(){
        return date.getCounter();
    }
    
    public int getMonth(){
        return month.getCounter();
    }
    
    public int getYear(){
        return year.getCounter();
    }
    
    public int getHours(){
        return hours.getCounter();
    }
    
    public int getMinutes(){
        return minutes.getCounter();
    }
    
    public void tick(){
        if(minutes.getCounter()<minutes.getLimit())minutes.increace();
        else{
            minutes.reset();
            if(hours.getCounter()<hours.getLimit())hours.increace();
            else{
                hours.reset();
                if(date.getCounter()<date.getLimit())date.increace();
                else{
                    date.reset();
                    date.increace();
                    if(month.getCounter()<month.getLimit()){
                        month.increace();
                        if(month.getCounter()==1 || month.getCounter()==3 || month.getCounter()==5 || month.getCounter()==7 || month.getCounter()==8 || month.getCounter()==10 || month.getCounter()==12) date.setLimit(31);
                        else if(month.getCounter()==2){
                            if(year.getCounter()%4==0) date.setLimit(29);
                            else date.setLimit(28);
                        }
                    }
                    else{
                        month.reset();
                        month.increace();
                        if(year.getCounter()<year.getLimit())year.increace();
                        else{
                            year.setCounter(1990);
                            games++;
                        }
                    }
                }
            }
        }
    }
}
