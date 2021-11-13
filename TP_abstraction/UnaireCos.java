public class UnaireCos extends ExpUnaire {

    public UnaireCos(ExpAbstraite operateur) {
        super(operateur);
    }

    public String toStringInfixe() {
        return "cos(" + super.operateur + ")"; 
    }
    
}
