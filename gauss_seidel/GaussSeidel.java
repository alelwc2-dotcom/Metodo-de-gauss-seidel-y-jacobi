package gauss_seidel;

public class GaussSeidel {
    public static void resolver() {
        int n = Defmatrix.b.length;
        double[] x = new double[n];
        System.arraycopy(Defmatrix.x0, 0, x, 0, n);

        System.out.println("--- MÉTODO DE GAUSS-SEIDEL ---");
        boolean convergido = false;

        for (int k = 1; k <= Defmatrix.maxIteraciones; k++) {
            double[] xAnterior = x.clone();

            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += Defmatrix.A[i][j] * x[j];
                    }
                }
                x[i] = (Defmatrix.b[i] - suma) / Defmatrix.A[i][i];
            }

            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(x[i] - xAnterior[i]));
            }

            System.out.printf("Iteración %d: x1=%.5f, x2=%.5f, x3=%.5f, Error=%.6f\n", 
                    k, x[0], x[1], x[2], error);

            if (error < Defmatrix.tolerancia) {
                System.out.println("Gauss-Seidel convergió en la iteración: " + k + "\n");
                convergido = true;
                break;
            }
        }
        if (!convergido) {
            System.out.println("Gauss-Seidel alcanzó el máximo de iteraciones sin converger.\n");
        }
    }
}
