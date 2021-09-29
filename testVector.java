public class testVector {
    
    public static void main (String[] args)
    {
        Vector v = new Vector(2);
        Rational a = new Rational(2, 3);
        v.Set(a,0);
        System.out.println(v.toString());
        Rational b = new Rational(3, 2);
        a.mult(b);
        System.out.println(v.toString());

        Vector v0 = new Vector(2);
        Rational c = new Rational(1, 2);
        v.Set(c,0);
        v.Set(c, 1);
        v.get(0);
        Rational d = new Rational(1, 3);
        c.mult(d);
        System.out.println(v.toString());

    }
}
