/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = { 10, 10, 9.1, 7, 6.1, 4, 8 };
        String[] estudiantes = { "Kimberly Gonzalez", "Mark Hogan",
                "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
                "Juan Vasquez" };
        String[] promediosCualitativos = new String[7];
        double promedior;
        String mensajefinal = " ";

        for (int i = 0; i < promedios.length; i++) {
            promedior = promedios[i];
            if (promedior >= 0 && promedior <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else {
                if (promedior >= 6 && promedior <= 8.9) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    if (promedior >= 9 && promedior <= 10) {
                        promediosCualitativos[i] = "Sobresaliente";
                    }
                }
            }
            mensajefinal = String.format("%s %s: %.2f promedio cualitativo %s\n",mensajefinal,estudiantes[i],promedios[i],promediosCualitativos[i]);
        }
        System.out.printf("%s",mensajefinal);
    }
}
