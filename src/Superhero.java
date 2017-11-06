public class Superhero extends FictionalCharacter {
    private int goodPower;
    private int respect;

    public Superhero (String name, int goodPower, int respect) {
        super (name) ; //Κλήση του constructor της κλάσης Βάσης
        this.goodPower = goodPower;
        this.respect = respect;
    }

    // Η δύναμη του κάθε ήρωα υπολογίζεται με διαφορετικό τρόπο
    public double computeStrength() {
        return goodPower * respect * Math.random( );
    }

    public String toString() {
        //χρησιμοποιούμε την getName() γιατί η ιδιότητα της κλάσης Βάσης είναι private
        return getName() +" is a superhero that has good power = "+ goodPower+" and respect = "+ respect;
    }
}
