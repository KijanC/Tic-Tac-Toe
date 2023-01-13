
public class TTT {

    public static void main(String[] args) throws InterruptedException {
        Engine e = new Engine();

        String Spielfeld = "";

        // Spieler erstellen
        float ActivePlayerfl = 10;
        int ActivePlayerit = 10;


        // Felder Konfigurieren
        String Faa = "1";
        String Fab = "2";
        String Fac = "3";
        String Fba = "4";
        String Fbb = "5";
        String Fbc = "6";
        String Fca = "7";
        String Fcb = "8";
        String Fcc = "9";
        
        boolean Ende = false;


        
        while (true) {
            // Überprüft ob die aktive Spieler*in schon einen Zug getan hat
            int pressed = 0;


            // Linen des Spielfeldes erstellen
            String Line1 = "    |" + Faa + "|" + Fab + "|" + Fac + "|" + "\n";
            String Line2 = "    |" + Fba + "|" + Fbb + "|" + Fbc + "|" + "\n";
            String Line3 = "    |" + Fca + "|" + Fcb + "|" + Fcc + "|" + "\n";
            Spielfeld = Line1 + Line2 + Line3;
            e.setText(Spielfeld);

  
            if (e.tastatur.letzteTaste.equals("1") && Faa == "1" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Faa = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("2") && Fab == "2" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fab = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("3") && Fac == "3" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fac = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("4") && Fba == "4" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fba = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("5") && Fbb == "5" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fbb = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("6") && Fbc == "6" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fbc = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("7") && Fca == "7" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fca = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("8") && Fcb == "8" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fcb = "X";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("9") && Fcc == "9" && pressed == 0 && ActivePlayerfl / 2 == ActivePlayerit / 2) {
                Fcc = "X";
                pressed = 1;
            }
            



            if (e.tastatur.letzteTaste.equals("1") && Faa == "1" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Faa = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("2") && Fab == "2" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fab = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("3") && Fac == "3" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fac = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("4") && Fba == "4" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fba = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("5") && Fbb == "5" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fbb = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("6") && Fbc == "6" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fbc = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("7") && Fca == "7" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fca = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("8") && Fcb == "8" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fcb = "O";
                pressed = 1;
            }
            if (e.tastatur.letzteTaste.equals("9") && Fcc == "9" && pressed == 0 && ActivePlayerfl / 2 != ActivePlayerit / 2) {
                Fcc = "O";
                pressed = 1;
            }
            

            if (pressed == 1){
                //  Spielende bei Erlangen von drei "XXX" oder "OOO" in der wagerechten
                if (Faa == "X" && Fab == "X" && Fac == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Faa == "O" && Fab == "O" && Fac == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }

                if (Fba == "X" && Fbb == "X" && Fbc == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Fba == "O" && Fbb == "O" && Fbc == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }

                if (Fca == "X" && Fcb == "X" && Fcc == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Fca == "O" && Fcb == "O" && Fcc == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }


                //  Spielende bei Erlangen von drei "XXX" oder "OOO" in der diagonalen
                // Diagonal links
                if (Faa == "X" && Fbb == "X" && Fcc == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Faa == "O" && Fbb == "O" && Fcc == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }

                // Digonal rechts
                if (Fac == "X" && Fbb == "X" && Fca == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Fac == "O" && Fbb == "O" && Fca == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }


                //  Spielende bei Erlangen von drei "XXX" oder "OOO" in der sekrechten
                // in der 1. Reihe
                if (Faa == "X" && Fba == "X" && Fca == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Faa == "O" && Fba == "O" && Fca == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }


                // in der 2. Reihe
                if (Fab == "X" && Fbb == "X" && Fcb == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                Ende = true;
                }
                if (Fab == "O" && Fbb == "O" && Fcb == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }

                // in der 3. Reihe
                if (Fac == "X" && Fbc == "X" && Fcc == "X"){
                
                    Spielfeld = "Spieler 1 hat gewonnen";
                
                    Ende = true;
                }
                if (Fac == "O" && Fbc == "O" && Fcc == "O"){
                
                    Spielfeld = "Spieler 2 hat gewonnen";
                
                    Ende = true;
                }

                // Schauen ob unendschieden ist indem jedes Feld gefüllt ist jedoch keine der Sieges BEdingungen erfüllt ist
                if (Faa != "1" && Fab != "2" && Fac != "3" && Fba != "4" && Fbb != "5" && Fbc != "6" && Fca != "7" && Fcb != "8" && Fcc != "9"){
                    Spielfeld = "Unendschieden!";
                    e.setText(Spielfeld);
                    Thread.sleep(900);
                    break;
                }

                ActivePlayerfl += 1;
                ActivePlayerit += 1;
                
                Thread.sleep(90);
                if (Ende == true){
                    Spielfeld = "Ende";
                    e.setText(Spielfeld);
                    Thread.sleep(900);
                    break;
                }
            }
        }
    }
}