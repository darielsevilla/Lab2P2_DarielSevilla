/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_darielsevilla;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Lab2P2_DarielSevilla {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;

        User usuario = new User("Admin", 27, "admin", "admin123");
        ArrayList<User> userList = new ArrayList();

        String test;
        do {

            System.out.print("Menu de opciones:\n"
                    + "1-Registo de inmueble\n"
                    + "2-Manejo de Estados\n"
                    + "3-Log in/Sign up\n"
                    + "4-Salida\n\n"
                    + "Ingrese opcion: ");

            test = lea.next();

            if (checkInt(test)) {
                op = Integer.parseInt(test);
            }

            switch (op) {
                case 1:
                    if (checkAdmin(usuario)) {
                        int men = 0;
                        do {
                            System.out.println("\n\n1-Crear Casa/edificio/solar\n"
                                    + "2-Listar casas/edificios/solares\n"
                                    + "3-Modificar casas/edificios/solares\n"
                                    + "4-Borrar casas/edificios/solares\n"
                                    + "5-Eliminar casa/edificio/solares\n"
                                    + "\nElija opcion: ");
                                    men = lea.nextInt();
                        } while (men < 1 || men > 5);
                        
                        int opcion = 0;
                        do {
                            System.out.println("Cual desea crear?\n"
                                    + "1-casa\n"
                                    + "2-edificio\n"
                                    + "3-solar\n");
                        } while (!(opcion > 1) || !(opcion < 3));

                        if (op == 3) {

                        }

                    } else {
                        System.out.println("No tiene credenciales de administrador");
                    }

            }

        } while (op != 0);

    }

    public static boolean checkInt(String check) {
        try {
            Integer.parseInt(check);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkAdmin(User user) {
        if (user.getUsername() == "admin" && user.getPassword() == "admin123") {
            return true;
        } else {
            return false;
        }
    }
}
