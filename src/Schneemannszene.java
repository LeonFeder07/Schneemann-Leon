import GLOOP.*;
public class Schneemannszene {
    private GLKamera kamera;
    private GLLicht  licht;  
    private GLHimmel himmel;
    private GLBoden  boden;

    private Schneemann schneemann;
    private Europaeer europaeer;
    private Ureinwohner   ureinwohner ;
    private Asiate asiate;

    public Schneemannszene(){
        kamera = new GLSchwenkkamera(800,600);
        kamera.setzePosition(-600,400,800);
        licht  = new GLLicht();  
        boden  = new GLBoden("src/img/Schnee.jpg");
        himmel = new GLHimmel("src/img/Himmel.jpg");

        schneemann = new Schneemann(0,0);
        europaeer = new Europaeer(300,0);
        ureinwohner   = new Ureinwohner(-300,0);
        asiate = new Asiate (0,300);

        
    }
}
