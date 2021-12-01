import java.util.Set;

public class Sommet {

    public String etiquette; 

    public Set<Sommet> successors;

    public Sommet(String etiquette) {this.etiquette = etiquette;}

    @Override
    public int hashCode(){return this.etiquette.hashCode();}

    @Override
    public boolean equals(Object other)
    {
        return (other instanceof Sommet) && ((Sommet)other).etiquette.equals(this.etiquette);
    }

}
