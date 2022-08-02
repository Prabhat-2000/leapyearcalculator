public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year&gt;=1 &amp;&amp; year&lt;=9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else {
                        return false;
                    }
                }else{
                    return true;
                }
            }else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
