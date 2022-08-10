public class Main {

    public static void main(String[] args) {
        // Динамическая диспетчеризация методов
        Cube cube1 = new Cube();
        cube1.draw();
        Sphere sphere1 = new Sphere();
        sphere1.draw();
        Pyramid pyramid1 = new Pyramid();
        pyramid1.draw();

        System.out.println();

        DrawObj[] drawObjs = new DrawObj[3];
        drawObjs[0] = cube1;
        drawObjs[1] = sphere1;
        drawObjs[2] = pyramid1;
        for (int i = 0; i < drawObjs.length; i++) {
            drawObjs[i].draw();
        }


    }

}
