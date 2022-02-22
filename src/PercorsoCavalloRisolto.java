public class PercorsoCavalloRisolto {

    public static void main(String[] args) {
        
        Percorso p = new Percorso();
        if(p.risolvi(0,0,1)) {
            System.out.println("Soluzione trovata");
        } else {
            System.out.println("Soluzione non trovata");
        }
        
    }
    
}