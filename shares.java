
/**
 * Constructor class for shares
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class shares{
  private String name; //name
  private int prestige; //prestige of the shares, interacting with the prestige of the company (if ownered), changing by price
  private double price; //price of each share (decided originally by prestige, affecting it afterwards)
  private int total; //total number of shares given for negotiations
  
    public shares(String na, int pres){ //constructor for players' shares
        name = na;
        prestige = pres;
        price = find_price(prestige);
        total = find_total(prestige);
    }
    
    public shares(){ //constructor for starting local shares (not players' shares)
        name = code(5);
        prestige = find_prestige();
        price = find_price(prestige);
        total = find_total(prestige);
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPrestige(){
        return this.prestige;
    }
    
    public double getPrice(){
            return this.price;
    }
    
    public int getTotal(){
            return this.total;
    }
    
    private double find_price(int pos){
        int mult; //multiplier
        double ran; //random number
        
        if(pos>100)mult = 2;
        else mult =1;
        if(pos>200) mult = 3;
        if(pos>300) mult = 4;
        if(pos>400) mult = 5;
        if(pos>500) mult = 6;
        if(pos>600) mult = 7;
        if(pos>700) mult = 8;
        if(pos>900) mult = 10;
        
        ran = 2 + 4* Math.random();
        return mult*ran;
    }
        
    private int find_total(int pos){
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
    
    private int find_prestige(){
        return (int)Math.floor(10*(1 + 99* Math.random()));
    }
    
    private String code(int l){
        String s = ""; //temporary memory for creating name
        char c; //temporary memory for character
        int x; //temporary memory for number
        double r; //random number
        
        for(int i=0;i<l;i++){
            c=getChar();
            s=s+c;
        }
        return s;
    }
    
    private char getChar(){
        char x;
        int a;
        
        a = (int)Math.floor(1 + 25*Math.random());
        
        switch(a){
            case (1):x='A';break;
            case (2):x='B';break;
            case (3):x='C';break;
            case (4):x='D';break;
            case (5):x='E';break;
            case (6):x='F';break;
            case (7):x='G';break;
            case (8):x='H';break;
            case (9):x='I';break;
            case (10):x='J';break;
            case (11):x='K';break;
            case (12):x='L';break;
            case (13):x='M';break;
            case (14):x='N';break;
            case (15):x='O';break;
            case (16):x='P';break;
            case (17):x='Q';break;
            case (18):x='R';break;
            case (19):x='S';break;
            case (20):x='T';break;
            case (21):x='U';break;
            case (22):x='V';break;
            case (23):x='W';break;
            case (24):x='X';break;
            case (25):x='Y';break;
            default  :x='Z';break;
        }
        return x;
    }
    
}
