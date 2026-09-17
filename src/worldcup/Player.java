package worldcup;

/**
 * Class to define the player
 */
public class Player extends Person {
    String position;

    public void passBall(){
        System.out.println("The player passes the ball");
    }
    
    public String getPosition() {
		return position;
	}
    
    public void setPosition(String position){
       this.position = position;
    }
}