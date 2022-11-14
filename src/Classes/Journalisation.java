package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {
    private String log ;


    public Journalisation(String log) {
        this.log = log;
    }

    public void ajouterLog(String log) {
       Date date = new Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       this.log += dateFormat.format(date) + " : " + log + "\n";
    }

    public String afficherLog() {
        return this.log;
    }

}
