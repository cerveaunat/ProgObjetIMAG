import java.util.Set;

public interface Graphe 
{
    private Set<Sommet> setSommets;

    

    public void ajouteSommet(String label)
    {
        Sommet sommet = new Sommet(label);
        this.setSommets.add(Sommet);
    }


    public void ajouteArc(String labelDepart, String labelArrivee)
    {
        for(Sommet sommet: this.setSommets)
        {
            if (sommet.etiquette == labelDepart)
            {
                sommet.successors.add(labelArrivee);
            }
        }
    }

}
