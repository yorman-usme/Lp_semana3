package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de la compra: ");
        double cantidadCompra = scanner.nextDouble();
        
        int puntosAcumulados = (int) (cantidadCompra / 10);
        
        System.out.println("Puntos acumulados: " + puntosAcumulados);

        String nivelFidelizacion;
        
        if (puntosAcumulados > 1000) {
            nivelFidelizacion = "Platino";
        } else if (puntosAcumulados >= 501) {
            nivelFidelizacion = "Oro";
        } else if (puntosAcumulados >= 101) {
            nivelFidelizacion = "Plata";
        } else {
            nivelFidelizacion = "Bronce";
        }
        
        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            System.out.println("¡Felicitaciones! Obtienes un descuento del 10%.");
        }
        
        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("¡Eres un cliente Platino! Recibes un cupón especial para un producto.");
        }
        
        scanner.close();
    }
}