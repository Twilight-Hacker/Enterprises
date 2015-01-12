
/**
 * Constructor class for Stock Exchanges
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class stoexchange{
    private int level; //level of the country's market
    private int total; //number of total shares in this market
    private shares[] Shares;
    
    public stoexchange(int p){
        level = find_level(p);
        total = find_total(level);
        
        shares a;
        Shares = new shares[4*total];
        for(int i=0;i<total;i++){
            a = new shares();
            Shares[i]=a;
        }
        
    }
    
    public void addShares(shares a){
        int i=0;
        while(this.Shares[i]!=null) i++;
        this.Shares[i] = a;
    }
    
    private int find_level(int power){
        int x;
        
        if(power>500)x=3;
        else x=1;
        if(power>1000)x=4;
        if(power>1500)x=5;
        if(power>2000)x=6;
        if(power>2500)x=8;
        if(power>3000)x=10;
        if(power>3500)x=11;
        if(power>4000)x=13;
        if(power>4500)x=15;
        
        return (int)(x+(Math.random()*5));
    }
    
    private int find_total(int power){
        int x;
        
        if(power>500)x=3;
        else x=2;
        if(power>1000)x=4;
        if(power>1500)x=5;
        if(power>2000)x=6;
        if(power>2500)x=8;
        if(power>3000)x=10;
        if(power>3500)x=11;
        if(power>4000)x=13;
        if(power>4500)x=15;
        
        return (int)(10*Math.ceil(x+(Math.random()*5)));
    }
}
