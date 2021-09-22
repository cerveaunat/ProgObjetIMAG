// TP numéro 1, création d'une classe "Rationnal"
// Date 9/9/21
// author cerveaun 


class Rational 
{
    public int num;
    private int denom;
    public int getDenom() {return this.denom ;}
    public void setDenom(int denom)
    {
        if (denom == 0)
        {
            throw new IllegalArgumentException("Dénominateur nul !");
        }
        this.denom = denom;
    }

    public String toString() 
    {
        // String stringToRational = this.num + "/" + this.denom;
        // return stringToRational;

        return new String(this.num + "/" + this.denom);
    }

    public Rational(int num2, int denom){
        num = num2;
        setDenom(denom);
        int pgcdFixe = pgcd(denom,num); 
        num = num/pgcdFixe;
        setDenom(denom/pgcdFixe);
    }

    private int pgcd(int a, int b)
    {
        if (b==0)
        {
            return a;
        }
        return pgcd(b, a%b);
    }

    public void mult(Rational b)
    {
        int numB = b.num;
        int denomB = b.getDenom();
        this.num *= numB;
        this.denom *= denomB;
    }

    public void add(Rational b)
    {   int numB = b.num;
        int denomB = b.getDenom();
        this.num = this.num*denomB + this.denom*numB;
        this.denom *= denomB;
    }


}


