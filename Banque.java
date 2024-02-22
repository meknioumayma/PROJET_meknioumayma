import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom;
    private List<Compte> listeCompte;
    public Banque(String nom){
        this.nom=nom;
        this.listeCompte=new ArrayList<Compte>();
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;

    }
    public void addClient(Compte c){
        this.listeCompte.add(c);
    }
    public List<Compte> getCompte(){
        return listeCompte;
    }
    // @Override
    // public String toString(){
    //     return "Nom du banque : "+nom+", listeCompte "+listeCompte+"|";
    // }
    
}
