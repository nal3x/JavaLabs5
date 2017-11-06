import java.util.*;

public class PolyMorph {
    
    public static void main(String[] args) {
    
// Χρησιμοποιούμε ArrayList διότι δεν γνωρίζουμε πόσους ήρως θα δημιουργήσουμε
// Προσέξτε ότι η λίστα είναι τύπου FictionalCharacters για να αποθηκεύει
// οποιοδήποτε αντικείμενο τύπου FictionalCharacters ή παράγωγου

        ArrayList<FictionalCharacter> characters = new ArrayList <>();
        populateCharacters (characters);
        
// Εκτελείται η κατάλληλη toString για κάθε διαφορετικό αντικείμενο 
// που εμπεριέχεται στην ArrayList (πολυμορφισμός)
        
// Η Java υλοποιεί αυτό που καλούμε ως dynamic binding 
// Η μέθοδος που θα εκτελεστεί καθορίζεται κατά την ώρα της εκτέλεσης του
// προγράμματος
        for (FictionalCharacter character : characters) {
            System.out.println(character);
        }
}
    
public static void populateCharacters (ArrayList<FictionalCharacter> characters) {
    while (true) {
        printMenu();
        
        int choice = getIntValue("Enter your choice:");
        switch( choice ){
        case 1 :
            characters.add(new Superhero(getStringValue ("Name: "),
          getIntValue ("Good Power[1-10]: "), getIntValue ("Respect:[1-10]: ")));
            break;
        case 2 :
            characters.add(new Villain(getStringValue ("Name: "),
     getIntValue ( "Evil Power[1-10]: "), getIntValue ("Narcissism [1-10]: ")));
            break;
        case 3 : return;
    }
    }
}
   
public static void printMenu ( ) {
    System.out.println("1. Enter Superhero");
    System.out.println ("2. Enter Villain");
    System.out.println ("3. Finish Entering");
}


// Ορίζουμε τις 2 ακόλουθες μεθόδους γιατί διαβάζουμε συχνά δεδομένα 
// από τον χρήστη

public static int getIntValue (String prompt) {
int choice;
Scanner keyboard = new Scanner (System.in);
System.out.print(prompt);
choice = keyboard.nextInt();
return choice;
}


public static String getStringValue ( String prompt ) {
String choice ;
Scanner keyboard = new Scanner (System.in );
System.out.print(prompt);
choice = keyboard.next();
return choice;
	}
}

