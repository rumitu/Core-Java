
public class Time {
	private long hour;
    private long minute;
    private long second;
    
    private long day;
    private long mount;
    private long year;
    

    public Time(long newHour, long newMinute, long newSecond, long newDay, long newMount, long newYear) {
    	hour=newHour;
        minute= newMinute;
        second=newSecond;        
        day= newDay;
        mount= newMount;
        year = newYear;
        
    }

     public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

   public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append(hour);
       sb.append(":");
       sb.append(minute);
       sb.append(":");
       sb.append(second);
       sb.append(" ");
       sb.append(day);
       sb.append(".");
       if(mount>10){
    	   sb.append(mount);
       }else{
    	   sb.append("0");
    	   sb.append(mount);
       }
       sb.append(".");
       sb.append(year);
       
       return sb.toString();
   }
   
}
