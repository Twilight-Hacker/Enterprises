
/**
 * Constructor class for street lists (one (and only) list for each city)
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class StreetList{
    private StreetNode first; //pointer to the first street of the list
    private StreetNode last; //pointer to the last street of the list
    private StreetNode a; //street creation variant;
    
    public StreetList(int s, int c, int d){ //c:country ID, d:city ID
        first = null;
        last = null;
        
        String name;
        
        for(int i=0;i<s;i++){
            name = code(7);
            a = new StreetNode(name, i ,c , d);
            AddStreet(a);
        }
    }
    
    public boolean isEmpty(){
        return this.first == null;
    }
    
    public int getNextPosition(){
        return (this.last.getPosition()+1);
    }
    
    public void AddStreet(StreetNode Street){
        if(this.isEmpty()) first = Street;
        else{
            this.last.next = Street;
            this.last = Street;
            this.last.left = GetStreet(((int)(Math.round(Math.random()*100))));
            this.last.right = GetStreet(((int)(Math.round(Math.random()*100))));
        }
    }
    
    public StreetNode GetStreet(int position){
        StreetNode current = first;
        
        while(current != null){
            if(current.getPosition() == position) return current;
            else current = current.next;
        }
        
        return null;
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
