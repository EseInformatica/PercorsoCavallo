class Percorso {

    private int[][] scacchiera;
    private int[] mRighe;
    private int[] mColonne;
    private int mosse;
    final public int RIGHE = 5;
    final public int COLONNE = RIGHE;

    public Percorso() {
        scacchiera = new int[RIGHE][COLONNE];
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                scacchiera[i][j] = 0;
            }
        }
        mRighe   = new int[]{-2, -1, 1, 2,  2,  1, -1, -2};
        mColonne = new int[]{ 1,  2, 2, 1, -1, -2, -2, -1};
    }

    public boolean risolvi(int rig, int col, int nCav) {
        if (nCav == RIGHE * COLONNE) {
            scacchiera[rig][col] = nCav;
            return true;
        }
        for (int i = 0; i < mRighe.length; i++) {
            if (isValida(rig, col, mRighe[i], mColonne[i])) {
                scacchiera[rig][col] = nCav;
                stampa();
                if (risolvi(rig + mRighe[i], col + mColonne[i], nCav + 1)) {
                    stampa();
                    return true;
                }
                
                // Backtracking
                scacchiera[rig][col] = 0;
                stampa();
            }
        }
        return false;
    }

    private boolean isValida(int r, int c, int mr, int mc) {
        int cRig = r + mr, cCol = c + mc;
        return !(cRig < 0 || cCol < 0 || cRig > RIGHE - 1 || cCol > COLONNE - 1 || scacchiera[cRig][cCol] != 0);
    }

    private void stampa() {
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.printf("%3d ", scacchiera[i][j]);
            }
            System.out.println();
        }
        System.out.println("Mosse: " + mosse++);
        System.out.println();
        System.out.println();
    }
    
}