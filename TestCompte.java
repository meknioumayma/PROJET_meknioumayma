public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("salah", 500);
        // System.out.println(c1);

        // c1.crediter(200);
        // System.out.println(c1);
        // c1.dediter(100);
        // System.out.println(c1);
        // CompteEpargne ep1 = new CompteEpargne("asma",500,0.5);
        // System.out.println(ep1);
        // try{
        //     ep1.dediter(850);
        //     System.out.println(ep1);
        // }
        // catch(SoldeException s){
        //     System.out.println(s);

        // }
        Banque stb=new Banque("STB");
        stb.addClient(new Compte("oumayma", 500));
        stb.addClient(new CompteEpargne("hyba",8000,0.05));
        for(Compte c :stb.getCompte()){
            System.out.println(c);
        }
        
    }
}
