
/**
 * Class Constructor for cities.
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class City{
    private String Name; //City Name
    private int size; //City size (number of streets)
    private int ID; //City ID
    private int Country; //Country ID
    private double base; //base multiplier for prizes on this city, based on country level
    public StreetList Streets;
    
    public City(String n, int s, int l, int c, int i){
        Name = n;
        Country = c;
        ID = i;
        size = s;
        base = find_base(l);
        
        Streets = new StreetList(size , Country, ID);
    }
    
    public int getCountryID(){
        return this.Country;
    }
    
    public int getID(){
        return this.ID;
    }
    
    private double find_base(int a){
        double x;
        
        switch(a){
            case (1):x=Math.random();break;
            case (2):x=(2*Math.random());break;
            case (3):x=(1 + 3*Math.random());break;
            case (4):x=(1 + 5*Math.random());break;
            case (5):x=(2 + 5*Math.random());break;
            case (6):x=(1 + 8*Math.random());break;
            case (7):x=(1 + 9*Math.random());break;
            case (8):x=(2 + 8*Math.random());break;
            case (9):x=(2 + 11*Math.random());break;
            default:x=(3 + 12*Math.random());break;
        }
        return x;
    }
}
