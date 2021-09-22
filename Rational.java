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

    public String toString() {
        // String stringToRational = this.num + "/" + this.denom;
        // return stringToRational;

        return new String(this.num + "/" + this.denom);
    }
}


