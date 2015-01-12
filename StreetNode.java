
/**
 * Constructor class for streets (each one in a list, there is one (and only) list for each city)
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class StreetNode{
  private String name; //Name of the street (7 letters)
  private int price; //price to buy the street
  private int position; //position on the map
  private int rent; //basic rent
  private int level; //level of quality (multiplier for rent). 1 = basic
  private boolean mort; //yes if mortaged, no if not
  private boolean loan; //yes if used as loan insurance, no if not
  private int owner; //owner's ID number, state = -1.
  private int cost; //Upgrade cost
  private boolean used; //if the street is used by an enterprize (aka if it has a building)
  private int Country; //Country ID (within world)
  private int city; //City ID (within country)
  private int prestige; //street score
  private int length; //street length, to cross (first you choose direction (straight,left,right) and then you cross the street to the one you choose) (l=5(5)30)
  public StreetNode next; //pointer to the next street
  public StreetNode left; //pointer to the left street
  public StreetNode right; //pointer to the right street
  
    public StreetNode(String N, int pos, int cou, int ci){
        name = N;
        position = pos;
        prestige = find_pres(position);
        price = find_price(prestige);
        rent = find_rent(prestige);
        level = 1;
        mort = false;
        loan = false;
        owner = -1;
        cost = find_cost(rent, price, prestige);
        used = false;
        Country = cou;
        city = ci;
        next = null;
        left = null;
        right = null;
        length = find_length();
    }
    
    public StreetNode(String N, int pos, int pre, int pri, int re, int ow, int co, StreetNode le, StreetNode ri, int len, int cou, int ci){
        name = N;
        position = pos;
        prestige = pre;
        price = pri;
        rent = re;
        level = 1;
        mort = false;
        loan = false;
        owner = ow;
        cost = co;
        used = false;
        Country = cou;
        city = ci;
        next = null;
        left = le;
        right = ri;
        length = len;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String N){
        this.name = N;
    }
    
    public int getPosition(){
        return this.position;
    }
    
    public int getPrestige(){
        return this.prestige;
    }
    
    public void changePrestige(int value){
        this.prestige = this.prestige + value;
        if(this.prestige<0)this.prestige = 0;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(int newPrice){
        this.price = newPrice;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public void incLevel(){
        this.level++;
    }
    
    public void decLevel(){
        this.level--;
    }
    
    public boolean isMortaged(){
        return (this.mort == true);
    }
    
    public void mortage(){
        this.mort = true;
    }
    
    public void unmortage(){
        this.mort = false;
    }
    
    public boolean isLoan(){
        return (this.loan == true);
    }
    
    public void loan(){
        this.loan = true;
    }
    
    public void unloan(){
        this.loan = false;
    }
    
    public boolean isOwned(){
        return (this.owner != -1);
    }
    
    public int getOwner(){
        return this.owner;
    }
    
    public void setOwner(int newOwner){
        this.owner = newOwner;
    }
    
    public boolean isUsed(){
        return (this.used==true);
    }
    
    public void use(){
        this.used = true;
    }
    
    public void unuse(){
        this.used = false;
    }
    
    public int getCityID(){
        return this.city;
    }
    
    public int getCountryID(){
        return this.Country;
    }
    
    public int getLength(){
        return this.length;
    }
    
    private int find_length(){
        return 6* ((int)(Math.ceil(Math.random()*5)));
    }
    
    private int find_pres(int pos){
        int mult; //multiplier
        double ran; //random number
        
        if(pos>5)mult = 2;
        else mult =1;
        if(pos>10) mult = 3;
        if(pos>15) mult = 4;
        if(pos>20) mult = 5;
        if(pos>25) mult = 6;
        if(pos>30) mult = 7;
        if(pos>35) mult = 8;
        if(pos>40) mult = 10;
        
        ran = 1 + 4* Math.random();
        return (int)Math.floor(100*mult*ran);
    }    
    
    private int find_price(int pos){
        int mult; //multiplier
        double ran; //random number
        
        if(pos>500)mult = 2;
        else mult =1;
        if(pos>1000) mult = 3;
        if(pos>1500) mult = 4;
        if(pos>2000) mult = 5;
        if(pos>2500) mult = 6;
        if(pos>3000) mult = 7;
        if(pos>3500) mult = 8;
        if(pos>4000) mult = 10;
        
        ran = 1 + 4* Math.random();
        return (int)Math.floor(100*mult*ran);
    }
    
    private int find_rent(int pos){
        int mult; //multiplier
        double ran; //random number
        
        if(pos>500)mult = 2;
        else mult =1;
        if(pos>1000) mult = 3;
        if(pos>1500) mult = 4;
        if(pos>2000) mult = 5;
        if(pos>2500) mult = 6;
        if(pos>3000) mult = 7;
        if(pos>3500) mult = 8;
        if(pos>4000) mult = 10;
        
        ran = 1 + 9*Math.random();
        return (int)Math.floor(10*mult*ran);
    }
    
    private int find_cost(int rent, int price, int pos){
        int mult; //multiplier
        
        if(pos>500)mult = 2;
        else mult =1;
        if(pos>1000) mult = 3;
        if(pos>1500) mult = 4;
        if(pos>2000) mult = 5;
        if(pos>2500) mult = 6;
        if(pos>3000) mult = 7;
        if(pos>3500) mult = 8;
        if(pos>4000) mult = 10;
        
        return (int)Math.round((price/rent)*mult);
    }
}
