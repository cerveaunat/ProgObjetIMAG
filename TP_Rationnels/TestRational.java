public class TestRational
{
    public static void main(String [] args) 
    {
        Rational troisDemies = null;
        troisDemies = new Rational(3,2);

        // Tests question 1 

        System.out.println(troisDemies.toString());

        // Tests question 2 
        
        System.out.println(troisDemies.toString());

        // Tests question 3 et 4

        // Rational denomNul = null; 
        // denomNul = new Rational(4,0);
    

        // System.out.println(denomNul.toString());

        // Tests question 5 

        Rational unTiers = null;
        unTiers = new Rational(1, 3);
        unTiers.mult(troisDemies);
        System.out.println(unTiers.toString());

        // Tests question 6

        Rational unQuart = null;
        unQuart = new Rational(1,4);
        unQuart.add(troisDemies);
        System.out.println(unQuart.toString());

        // Tests question 7

        Rational deuxHuitiemes = null;
        deuxHuitiemes = new Rational(2,8);
        System.out.println(deuxHuitiemes.toString());
    }
}
