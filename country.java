
/**
 * Constructor class for Countries
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class country{
    private String Name; //Country name
    private int ID; //Country ID
    private int size; //Number of cities
    private int level; //Advancement level
    private int power; //Power of the country
    private int time; //Country time difference with central time
    private int population; //Country population
    public City[] Cities; //Array of cities
    
    public country(String n, int s, int l, int c){
        Name = n;
        ID = c;
        size = s;
        level = l;
        time = (int) Math.round(Math.random()*24) - 12; //random time difference with central time (-12 to +12)
        population = (int) Math.round(Math.random()*10) + (2*size); //random population, in millions (2 to 20)
        
        power = find_pow(size, level);
        
        currency currency = new currency(Name, power); //creating country currency
        stoexchange StockExchange = new stoexchange(power); //creating country stock exchange
        
        City a;
        Cities = new City[size]; //creating cities array
        String na; //city name
        int si; //City size (number of streets)
        
        for(int i=0;i<size;i++){
            na = code(6);
            si = (int)Math.floor(1 + 99*Math.random());
            a = new City(na,si,level,ID,i);
            Cities[i] = a;
        }
        
    }
    
    public int getID(){
        return this.ID;
    }
    
    private int find_pow(int s, int l){
        int x;
        switch(l){
            case(1):x=1;break;
            case(2):x=2;break;
            case(3):x=3;break;
            case(4):x=5;break;
            case(5):x=6;break;
            case(6):x=8;break;
            case(7):x=10;break;
            case(8):x=12;break;
            case(9):x=15;break;
            default:x=20;break;
        }
        
        x=x*s;
        
        return (int)((10*x)*Math.ceil(Math.random()*5));
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
