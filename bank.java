
/**
 * Class Constructor for banks.
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class bank{
  private String name; //name
  private int ID; //Bank ID
  private int key; //Key amount for accounts
  private double[] pers; //stadard bank multipliers for "personalization" (interest,max loan,min insurance)
  private int[][] accounts; //player accounts [ID][type] (max types=2)
  private int freq; //frequency of payments [every freq turns] (0=player choice for each loan) (at least 9) (1/3 rounded up for automatic interest payments)
  private int base; //base score for calculating score relevant multipliers
  
    public bank(String na, int I, int pn){ //I is for ID, pn for player number
        name = na;
        ID = I;
        key = get_key();
        freq = get_freq();
        base = get_base();
        
        accounts = new int[pn][2];
        for(int i=0;i<accounts.length;i++){
            accounts[i][0]=0;
            accounts[i][1]=0;
        }
        
        pers = new double[3];
        pers[0] = find_interest();
        pers[1] = find_maxl();
        pers[2] = find_mini(pers[0]);
    }
    
/*  
*   Constructor for player banks
*   public bank(){ //na for name, I is for ID, pn for player number
*       
*   }
* 
*/
    private int get_key(){
        int x=(int)Math.round(Math.random()*10);
        
        switch(x){
            case(1): return 7000;
            case(2): return 8000;
            case(3): return 9000;
            case(4): return 10000;
            case(5): return 11000;
            case(6): return 10000;
            case(7): return 9000;
            case(8): return 8000;
            case(9): return 7000;
            default: return 6000;
        }
    }
    
    private int get_freq(){
        int x=(int)Math.round(Math.random()*10);
        switch(x){
            case(2): return 10;
            case(4): return 20;
            case(6): return 30;
            case(7): return 40;
            case(8): return 60;
            default: return 0;
        }
    }
    
    private int get_base(){
        int x=(int)Math.round(Math.random()*10);
        
        switch(x){
            case(2): return 6000;
            case(3): return 7000;
            case(4): return 10000;
            case(5): return 4000;
            case(6): return 6000;
            case(7): return 7000;
            case(8): return 8000;
            default: return 5000;
        }
    }
    
    private double find_interest(){
        return 2+(Math.random()*3);
    }
    
    private double find_maxl(){
        return 0.8*(Math.random()*0.4);
    }
    
    private double find_mini(double i){ //according to i retruns from 0,4 to 2,4
        return (((20/i)-2)+(Math.random()*4))/5;
    }
}
