
/**
 * Class constructor of the world game of Enterprizes
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class world{
    private int size; //Number of countries (1-40)
    public static country[] CountryArray; //Object array for countries
    public static player[] Players; //Object array for players
    public static Clock clock; //World Clock
    
    public world(int s, int pn, String[] PlNames){
        size = s;
        String Name; //Country name
        int si; //country size
        int level; //advancement level
        
        CountryArray = new country[size]; //creating country array
        Players = new player[pn];
        
        clock = new Clock(); //create world clock
        
        for(int i=0;i<size;i++){
            Name = code(2);
            si = (int)Math.floor(1 + 4*Math.random());
            level = (int)Math.floor(1 + 9*Math.random());
            country a = new country(Name,si,level,i);
            CountryArray[i]=a;
        }
        
        for(int i=0;i<pn;i++){
            player b = new player(i, PlNames[i]);
            Players[i] = b;
        }
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
