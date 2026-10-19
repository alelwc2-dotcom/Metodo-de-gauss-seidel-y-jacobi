public class Defmatrix {
    // Sistema de ecuaciones:
    // 5x +  y +  z = 7
    //   x + 2y + 5z = 8
    //   x + 4y +  z = 6

    public static double[][] A = {
        {5.0, 1.0, 1.0},
        {1.0, 2.0, 5.0},
        {1.0, 4.0, 1.0}
    };

    public static double[] b = {7.0, 8.0, 6.0};
    public static double[] x0 = {0.0, 0.0, 0.0};
    public static double tolerancia = 0.0001;
    public static int maxIteraciones = 100;
}
