package Bitlab.tenth_lesson;

public class Exercise2 {
    public static void main(String[] args) {
        SphereGold sphere1 = new SphereGold(3);
        SphereGold sphere2 = new SphereGold(12);
        SphereGold sphere3 = new SphereGold();

        CubeGold cube1 = new CubeGold(5);
        CubeGold cube2 = new CubeGold(10);
        CubeGold cube3 = new CubeGold();

        GoldShape[] shapes = {sphere1,sphere2,sphere3,cube1,cube2,cube3};

        for (GoldShape  shape: shapes) {
            System.out.println(shape.getPrice());
        }
    }
}
