// TP numéro 2, création d'une classe "Vector", un tableau de rationnels
// Date 22/9/21
// author cerveaun 

public class Vector {
    
    private Rational[] tabRationnels;

    public Vector(int lgth)
    {
        tabRationnels = new Rational[lgth];
        for (int i = 0; i<lgth;i++)
        {
            tabRationnels[i] = new Rational(0, 1);
        }
    }

    public void Set(Rational rational, int i)
    {
        if (i>= tabRationnels.length)
        {
            throw new IllegalArgumentException("Indice invalide !");
        }
        tabRationnels[i] = rational;
    }

    public Rational get(int i)
    {
        if (i>= tabRationnels.length)
        {
            throw new IllegalArgumentException("Indice invalide !");
        }

        return tabRationnels[i];
    }

    public void mult(Rational r)
    {
        for (int i = 0; i< tabRationnels.length; i++)
        {
            tabRationnels[i].mult(r);
        }
    }

    public int length()
    {
        return tabRationnels.length;
    }

    public void add(Vector v)
    {
        if (tabRationnels.length != v.length())
        {
            throw new IllegalArgumentException("Longueurs invalides !");
        }
        for (int i = 0; i< tabRationnels.length; i++)
        {
            tabRationnels[i].add(v.get(i));
        }
    }

    @Override
    public String toString ()
    {
        String stringTab = "(";
        for (int i = 0; i < tabRationnels.length - 1;i++)
        {
            stringTab += (tabRationnels[i].toString() + ", ");
        }
        stringTab += tabRationnels[tabRationnels.length -1].toString() + ")";
        return stringTab;
    }
}
