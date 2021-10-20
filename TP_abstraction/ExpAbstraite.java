class ExpAbstraite 
{
    private String expression;

    public ExpAbstraite(String expression)
    {
        this.expression = expression;
    }

    public String toStringInfixe()
    {
        return "(" + this.expression + ")";
    }
}

class ExpBinaire extends ExpAbstraite
{
    private String expression;

    public ExpBinaire(String expression)
    {
        this.expression = expression;
    }
}

class ExpUnaire extends ExpAbstraite
{

}

class Constante
{

}

class Variable 
{

}

class UnaireCos extends ExpUnaire
{

}

class UnaireSin extends ExpUnaire
{

}

class BinairePlus extends ExpBinaire
{

}

class BinaireMult extends ExpBinaire
{

}