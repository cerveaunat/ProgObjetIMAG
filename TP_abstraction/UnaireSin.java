public class UnaireSin extends ExpUnaire {

    public UnaireSin(ExpAbstraite operateur) {
        super(operateur);
    }

    @Override
    public String toStringInfixe() {
        return "sin(" + super.operateur + ")"; 
    }
    
}
