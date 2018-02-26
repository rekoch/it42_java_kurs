public class Sudoku {
    private final Feld[][] feld;

    public Sudoku() {
        feld = new Feld[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                feld[i][j] = new Feld();
            }
        }
    }

    public void setzeInitialWert(int x, int y, int wert) {
        Feld f = feld[x][y];
        f.setWert(wert);
        f.setInitialGesetzt();
    }

    public void setzeWert(int x, int y, Integer wert) {
        Feld f = feld[x][y];
        if (f.isInitialGesetzt()) {
            System.out.println("Das Feld (" + x + "," + y + ") enthaelt einen Startwert und darf deshalb nicht mehr gesetzt werden!");
        } else {
            f.setWert(wert);
        }
    }

    public boolean istFertigAusgefuellt() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Feld f = feld[i][j];
                if (f.isLeer()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean istKonfliktFrei() {
        // --> Implementation ist nicht so wichtig
        for (int i = 0; i < 9; i++) {
            Feld[] zeile = new Feld[]{
                    feld[i][0],
                    feld[i][1],
                    feld[i][2],
                    feld[i][3],
                    feld[i][4],
                    feld[i][5],
                    feld[i][6],
                    feld[i][7],
                    feld[i][8]
            };
            if (hatDoppelteWerte(zeile)) {
                return false;
            }
            Feld[] spalte = new Feld[]{
                    feld[0][i],
                    feld[1][i],
                    feld[2][i],
                    feld[3][i],
                    feld[4][i],
                    feld[5][i],
                    feld[6][i],
                    feld[7][i],
                    feld[8][i]
            };
            if (hatDoppelteWerte(spalte)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                Feld[] block = new Feld[]{
                        feld[i + 0][j + 0],
                        feld[i + 0][j + 1],
                        feld[i + 0][j + 2],
                        feld[i + 1][j + 0],
                        feld[i + 1][j + 1],
                        feld[i + 1][j + 2],
                        feld[i + 2][j + 0],
                        feld[i + 2][j + 1],
                        feld[i + 2][j + 2],
                };
                if (hatDoppelteWerte(block)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean istGeloest() {
        return istFertigAusgefuellt() && istKonfliktFrei();
    }

    private boolean hatDoppelteWerte(Feld[] feldGruppe) {
        // pruefe, ob zwei Felder, die gesetzt sind, dieselben sind
        for (int i = 0; i < feldGruppe.length; i++) {
            for (int j = 0; j < feldGruppe.length; j++) {
                Feld f1 = feldGruppe[i];
                Feld f2 = feldGruppe[j];
                if (i == j || f1.isLeer() || f2.isLeer()) {
                    continue;
                }
                if (f1.getWert().equals(f2.getWert())) {
                    return true;
                }
            }
        }
        return false;
    }


    public void zeigen() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Feld f = feld[i][j];
                System.out.print(f);
            }
            System.out.println();
        }
    }
}
