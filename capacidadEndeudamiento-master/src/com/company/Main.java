package com.company;

import clases.CapacidadEndedudamiento;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);

        int ingMesuales;
        System.out.println("Ingrese sus ingresos mensuales");

        String entrada = "SI";
        while (entrada.equals("SI")) {
            System.out.println("Ingrese sus gastos fijos");
            System.out.println("Ingrese sus gastos variable");
            //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
            // CapacidadEndedudamiento()
            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
            //Utiliza el metodo is numeric para vada entrada de ser necesarios
        }
    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        Double.parseDouble(value);

    }
}
