package Bitlab.tenth_lesson;

public class Exercise3 {
    public static void main(String[] args) {
        FerrariEngine engine = new FerrariEngine();
        FerrariEngine engine1 = new FerrariEngine(4.5,8,35);
        FerrariEngine engine2 = new FerrariEngine(4.7,12,45);
        FerrariEngine engine3 = new FerrariEngine(3.5,12,42);
        FerrariEngine engine4 = new FerrariEngine(6.5, 8, 65);

        RenaultEngine renaultEngine = new RenaultEngine();
        RenaultEngine renaultEngine1 = new RenaultEngine(3.5,4,42,1.6);
        RenaultEngine renaultEngine2 = new RenaultEngine(1.6,4,38,1.8);
        RenaultEngine renaultEngine3 = new RenaultEngine(2.4,4,40,3.2);
        RenaultEngine renaultEngine4 = new RenaultEngine(4.5,4,42,4.7);

        Engine[] engines = {engine,engine1,engine2,engine3,engine4,renaultEngine,renaultEngine1,renaultEngine2,renaultEngine3,renaultEngine4};

        int ferrariCounter = 0;
        int renaultCounter = 0;
        for (Engine eng: engines) {
            if(eng instanceof FerrariEngine){
                System.out.println(ferrariCounter + ") Ferrari Car engine's max speed: " + eng.getMaxSpeed());
                ferrariCounter++;
            }else if(eng instanceof RenaultEngine){
                System.out.println(renaultCounter + ") Renault Car engine's max speed: " + eng.getMaxSpeed());
                renaultCounter++;
            }
        }
    }
}
