public class BinaireMult extends ExpBinaire {

    

    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    @Override
    public String toStringInfixe() {
        return "(" + super.opGauche + " * " + super.opDroit + ")";
    }
    
}