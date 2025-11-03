public class App {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        enemy enemy1 = new enemy(3,2);
        enemy1.attack();

        

        //create a fire and an ice wizard and call all functions

        wizard fire_wizard = new wizard(10,10,"Fire");
        fire_wizard.attack();
        fire_wizard.damageType();
        wizard ice_wizard = new wizard(10,10, "Ice");
        ice_wizard.attack();
        ice_wizard.damageType();

        //create a goblin and call its functions

        goblin goblin1 = new goblin(20,10);
        goblin1.attack();

    }
}


public class enemy {
    int health;
    int damage;

    public enemy(int h, int d){
        health = h;
        damage = d;
    }

    public void attack(){
        System.out.println("the enemy attacks");
    }
}

public class goblin extends enemy{
    int damage;
    int health;

    public goblin(int d, int h){
        super(h, d);
        damage = d;
        health = h;
    }
    @Override
    public void attack() {
        System.out.println("The goblin gobbles!");
    }
}
         
    
public class wizard extends enemy{
    String type;
    public wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"

        if (type.equalsIgnoreCase("fire")){
            System.out.println("This wizard shoots a fireball");
        } else if (type.equalsIgnoreCase("ice")){
            System.out.println("This wizard shoots an iceball");  //if the type is 'ice', then print "this wizard shoots an iceball"
        }
       
    }
}



