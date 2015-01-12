
/**
 * Constructor class for players
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class player{
    private int ID; //player ID
    private String Name; //player Name
    public GPS GPS; //player GPS
    public central Central; //player Central Company
    private int[] location; //player location: int(3)[ 0=country ID, 1=City num (in country array), 2=Street position ]
    private int score; //player score
    
    public player(int i, String n){
        ID = i;
        Name = n;
        GPS = new GPS();
        location = new int[3];
        Central = new central(); //creating central company
        score = 500 + (int)(Math.round(Math.random()*200)-100); //initial score 400 to 600
        location[0]=0;
        location[1]=0;
        location[2]=0;
    }
}
