/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card test1 = new Card( "King", "Diamond", 13 );
        Card test1Copy = new Card( "King", "Diamond", 13 );
        Card test2 = new Card( "Queen", "Clubs", 12 );
        Card test3 = new Card( "Jack", "Spade", 11 );

        System.out.println( test1 );
        System.out.println( test2 );
        System.out.println( test3 );

        System.out.println( test1.matches( test1Copy ) );

    }
}