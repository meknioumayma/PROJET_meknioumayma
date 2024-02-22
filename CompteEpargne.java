public class CompteEpargne extends Compte {
    private Number benifice;
    public CompteEpargne(String titulaire, double solde,Number benifice) {
        super(titulaire, solde);
        this.benifice=benifice;
    }
    public Number getBenifice() {
        return benifice;
    }
    @Override
    public String toString() {
        return super.toString() + ", benefice est "+benifice; 
    }


    
    
}
