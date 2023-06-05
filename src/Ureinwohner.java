import GLOOP.*;
public class Ureinwohner extends Schneemann{

    private GLKugel kugel;
    private GLTorus torus;
    public Ureinwohner(double pX, double pZ){
        super(pX,pZ);



        torus = new GLTorus(0,220,0, 30,5);
        torus.drehe(90,0,0);

        torus.verschiebe(pX,0,pZ);
        

        kugel = new GLKugel(0,240,-30, 30);
        kugel.skaliere(0.2,1,0.1);
        kugel.setzeFarbe(0,1,0);
        kugel.setzeFarbe(1,0,0);
        kugel.verschiebe(pX,0,pZ);
    }
    
}
