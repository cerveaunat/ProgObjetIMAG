

public class TestZoo {
    public static void main(String[] args)
    {
        Zoo Ensimag = new Zoo("Ensimag");
        
        Animal Catherine = new Canard("Catherine", 50, "bordeaux");
        Animal Julie = new Vache("Julie", 7, 17);
        Animal SaharBenoit = new Canard("Sahar Benoit", 100, "bleu clair");
        Animal Nicolas = new Vache("Nicolas", 45, 45);
        Animal Sebastien = new Animal("Sébastien", 58);
        Animal Sylvain = new Canard("Sylvain", 550, "vert colza");

        Ensimag.ajouteAnimal(Catherine);
        Ensimag.ajouteAnimal(Julie);
        Ensimag.ajouteAnimal(SaharBenoit);
        Ensimag.ajouteAnimal(Nicolas);
        Ensimag.ajouteAnimal(Sebastien);
        Ensimag.ajouteAnimal(Sylvain);

        Ensimag.crier();
    }
}
