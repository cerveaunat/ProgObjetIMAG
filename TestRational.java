public class TestRational
{
    public static void main(String [] args) 
    {
        Rational troisDemies = null;
        troisDemies = new Rational();
        troisDemies.num = 3;
        troisDemies.setDenom(2);

        // Tests question 1 

        System.out.println(troisDemies.toString());

        // Tests question 2 
        
        System.out.println(troisDemies.toString());

        // Tests question 3

        Rational denomNul = null; 
        denomNul = new Rational();
        denomNul.num = 4;
        denomNul.setDenom(0);

        System.out.println(denomNul.toString());
    }
}
