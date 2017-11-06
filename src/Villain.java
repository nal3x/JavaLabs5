public class Villain extends FictionalCharacter {
    private int evilPower;
    private int narcissism;

public Villain(String name, int evilPower, int narcissism) {
    super (name) ;
    this.evilPower = evilPower;
    this.narcissism = narcissism;
}

// Η δύναμη του κάθε ήρωα υπολογίζεται με διαφορετικό τρόπο
public double computeStrength() {
    return evilPower * narcissism * Math.random( ) * 0.9;
}

public String toString() {
    //χρησιμοποιούμε την getName() γιατί η ιδιότητα της κλάσης Βάσης είναι private
    return super.getName() + " is a villain that has evil power = "+
    evilPower+" and narcissism = "+narcissism;
}
}
