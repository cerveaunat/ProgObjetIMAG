import java.util.LinkedList;

class Animal 
{
    private String nom;
    private int poids;
    private Regime regime;

    public Animal(String nom, int poids, Regime regime)
    {
        this.nom = nom;
        if (poids < 0)
        {
            throw new IllegalArgumentException("Poids négatif");
        }
        else 
        {
            this.poids = poids;
        }
    }

    public String getNom() {return this.nom;}
    public int getPoids() {return this.poids;}
    public Regime getRegime() {return this.regime;}

    public void crier()
    {System.out.println(this.nom + " crie...");}

    public String toString()
    {
        return new String(this.nom + "pèse" + this.poids);
    }
    
}

class Canard extends Animal
{
    private String couleurPlumes;

    public Canard(String nom, int poids, String couleurPlumes)
    {
        super(nom, poids);
        this.couleurPlumes = couleurPlumes;
    }

    public String getCouleurPlumes()
    {
        return this.couleurPlumes;
    }

    @Override
    public void crier()
    {
        System.out.println(this.getNom() + " crie ... Ce canard de " + this.getPoids() +" kg aux belles plumes " + this.couleurPlumes + " cancane !");
    }

    @Override
    public String toString()
    {
        return new String(this.getNom() + "est un canard aux plumes " + this.couleurPlumes + " qui pèse" + this.getPoids());
    }
}

class Vache extends Animal 
{
    private int nombreTaches;
    public Vache(String nom, int poids, int nombreTaches)
    {
        super(nom,poids);
        this.nombreTaches = nombreTaches;
    }

    public int getNombreTaches() {return this.nombreTaches;}

    @Override
    public void crier()
    {
        System.out.println(this.getNom() + ", la vache à " + this.nombreTaches + " taches qui tachent, crie... il meugle");
    }

    @Override
    public String toString()
    {
        return new String(this.getNom() + "est une vache à " + this.nombreTaches + "taches, qui pèse " + this.getPoids() + " kilos");
    }
}


class Regime
{
    private String typeRegime;
    private int prixAuKilo;

    public Regime (String typeRegime, int prixAuKilo)
    {
        this.typeRegime = typeRegime;
        this.prixAuKilo = prixAuKilo;
    }

    public String getRegime() {return this.typeRegime;}
    public int getPrixAuKilo() {return this.prixAuKilo;}

    public String toString()
    {
        return new String("Régime : " + this.typeRegime + "\n Prix au kilo : " + this.prixAuKilo);
    }
}


class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void crier() {
        System.out.println("*** 1, 2, 3 crions:");
        for (Animal a : animaux) {
            a.crier();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Le zoo " + nom + " contient " + getNbAnimaux() + " animaux:");
        sb.append(animaux.toString());
        return sb.toString();

        // alternative:
        // return "le zoo " + nom + "contient:" + animaux; 
    }
}
