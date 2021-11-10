public abstract class ExpUnaire extends ExpAbstraite
{
    ExpAbstraite operateur;

    public ExpUnaire(ExpAbstraite operateur)
    {
        this.operateur = operateur;
    }
    
}
