/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percorsocavallorisolto;

/**
 *
 * @author leand
 */
public class PercorsoCavalloRisolto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Percorso p = new Percorso();
        if(p.risolvi(0,0,1)) {
            System.out.println("Soluzione trovata");
        } else {
            System.out.println("Soluzione non trovata");
        }
        
    }
    
}