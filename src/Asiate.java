import GLOOP.*;
public class Asiate extends Schneemann{

    private GLKugel kugel;
    private GLZylinder zylinder;
    public Asiate(double pX, double pZ){
        super(pX,pZ);

        

        zylinder = new GLZylinder(0,200,20,  70,5);
        zylinder.drehe(-110,0,0,  0,200,0);
        zylinder.setzeFarbe(0,0,0);
        zylinder.verschiebe(pX,0,pZ);


        kugel = new GLKugel(0,200,30,  30);
        kugel.drehe(-110,0,0,  0,200,0);
        kugel.setzeFarbe(1,1,1);
        kugel.verschiebe(pX,0,pZ);

    }

}
