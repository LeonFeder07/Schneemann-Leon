import GLOOP.*;
public class Europaeer extends Schneemann{

    private GLKugel kugel;
    private GLZylinder zylinder;
    public Europaeer(double pX, double pZ){
        super(pX,pZ);

        

        zylinder = new GLZylinder(0,200,20,  45,5);
        zylinder.drehe(-110,0,0,  0,200,0);
        zylinder.verschiebe(pX,0,pZ);
        zylinder.setzeFarbe(1,0,0);


        kugel = new GLKugel(0,200,30,  30);
        kugel.drehe(-110,0,0,  0,200,0);
        kugel.verschiebe(pX,0,pZ);
        kugel.setzeFarbe(1,0,0);
    }
    
}
