/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_darielsevilla;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JColorChooser;

/**
 *
 * @author HP
 */
public class Lab2P2_DarielSevilla {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        JOptionPane.showMessageDialog(null, "Laboratorio 2");
        User usuario = new User("Admin", 27, "admin", "admin123");
        ArrayList<User> userList = new ArrayList();
        ArrayList lista = new ArrayList();
        userList.add(usuario);
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
                    if (usuario != null) {
                        int men = 0;
                        do {
                            System.out.println("\n\n1-Crear Casa/edificio/solar\n"
                                    + "2-Listar casas/edificios/solares\n"
                                    + "3-Modificar casas/edificios/solares\n"
                                    + "4-Borrar casas/edificios/solares\n"
                                    + "5-Comprar casa/edificio/solares\n"
                                    + "\nElija opcion: ");
                            men = lea.nextInt();
                        } while (men < 1 || men > 5);

                        int opcion = 0;
                        int op2 = 0;
                        if (men != 2) {
                            do {
                                System.out.println("\n"
                                        + "1-casa\n"
                                        + "2-edificio\n"
                                        + "3-solar\n"
                                        + "Ingrese opcion:");
                                opcion = lea.nextInt();
                            } while (opcion < 1 || opcion > 3);
                        } else {
                            do {
                                System.out.println("\n"
                                        + "1-casas\n"
                                        + "2-edificios\n"
                                        + "3-solares\n"
                                        + "4-todos\n"
                                        + "Ingrese opcion:");
                                op2 = lea.nextInt();
                            } while (op2 < 1 || op2 > 4);
                        }
                        if (men == 1 && checkAdmin(usuario)) {
                            if (opcion == 1) {

                                System.out.println("Ingrese numero de casa:");
                                int numero = lea.nextInt();
                                System.out.println("Ingrese numero de bloque:");
                                int bloque = lea.nextInt();
                                System.out.println("Ingrese ancho:");
                                int ancho = lea.nextInt();
                                System.out.println("Ingrese largo:");
                                int largo = lea.nextInt();
                                System.out.println("Numero de baños:");
                                int ban = lea.nextInt();
                                System.out.println("Numero de Cuartos:");
                                int cuar = lea.nextInt();

                                Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);

                                Casa nueva = new Casa(numero, bloque, color, ancho, largo, ban, cuar);
                                lista.add(nueva);
                            } else if (opcion == 2) {
                                System.out.println("Ingrese numero de pisos:");
                                int pisos = lea.nextInt();
                                System.out.println("Ingrese cantidad de locales:");
                                int locales = lea.nextInt();
                                
                                System.out.println("Ingrese direccion por referencia");
                                lea.nextLine();
                                String referencia = lea.nextLine();
                                Edificio nuevo = new Edificio(pisos, locales, referencia);
                                lista.add(nuevo);
                            } else if (opcion == 3) {
                                System.out.println("Ingrese ancho:");
                                int ancho = lea.nextInt();
                                System.out.println("Ingrese largo:");
                                int largo = lea.nextInt();
                                Solar nuevo = new Solar(ancho, largo);
                                lista.add(nuevo);
                            }
                        } else if(men == 1) {
                            System.out.println("Necesita ingresar con un usuario credenciales de administrador");
                        }
                        if (men == 2 && usuario != null) {
                            int num = 1;
                            if (op2 == 1) {
                                int casa = 1;
                                for (Object object : lista) {
                                    if (object instanceof Casa) {
                                        System.out.println("Casa " + num);
                                        System.out.println(object);
                                        num++;
                                    }
                                }
                            } else if (op2 == 2) {
                                for (Object object : lista) {
                                    if (object instanceof Edificio) {
                                        System.out.println("Edificio " + num);
                                        System.out.println(object);
                                        num++;
                                    }
                                }
                            } else if (op2 == 3) {
                                for (Object object : lista) {
                                    if (object instanceof Edificio) {
                                        System.out.println("Solar " + num);
                                        System.out.println(object);
                                        num++;
                                    }
                                }
                            } else if(op2 == 4){
                                for (Object object : lista) {
                                    System.out.println("Inmueble " + num);
                                    System.out.println(object);
                                    num++;
                                }
                            }
                        } else if (men == 2 && usuario == null) {
                            System.out.println("No ha ingresado a un usuario");
                        }

                        if (men == 3 && checkAdmin(usuario)) {
                            int pos = 0;
                            do {
                                System.out.println("Que objeto de la lista desea modiicar:");
                                pos = lea.nextInt();
                            } while (pos > lista.size() || pos < 1);
                            Object tempo = lista.get(pos - 1);
                            int modificar = 0;
                            System.out.println(lista.get(pos-1) instanceof Casa);
                            if (lista.get(pos-1) instanceof Casa) {
                                System.out.println("Que desea modificar?");
                                System.out.println("1-numero\n"
                                        + "2-bloque\n"
                                        + "3-color\n"
                                        + "4-ancho\n"
                                        + "5-largo\n"
                                        + "6-numero de baños\n"
                                        + "7-numero de cuartos\n"
                                        + "Elija opcion:");
                                modificar = lea.nextInt();

                                if (modificar == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setNumero(newVal);
                                } else if (modificar == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setBloque(newVal);
                                } else if (modificar == 3) {
                                    Color nuevo = JColorChooser.showDialog(null, "Ingrse color nuevo", ((Casa) tempo).getColor());
                                    ((Casa) tempo).setColor(nuevo);
                                } else if (modificar == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setAncho(newVal);
                                } else if (modificar == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setLargo(newVal);
                                } else if (modificar == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setNumb(newVal);
                                } else if (modificar == 7) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = lea.nextInt();
                                    ((Casa) tempo).setCuartos(newVal);
                                }
                            } else if (lista.get(pos-1) instanceof Edificio) {
                                System.out.println("Que desea modificar?");
                                System.out.println("1-Numero de pisos\n"
                                        + "2-Cantidad de locales\n"
                                        + "Elija opcion:");
                                modificar = lea.nextInt();

                                System.out.println("Ingrese nuevo valor:");
                                int newVal = lea.nextInt();

                                if (modificar == 1) {
                                    ((Edificio) tempo).setPisos(newVal);
                                } else {
                                    ((Edificio) tempo).setLocal(newVal);
                                }
                            } else if (lista.get(pos-1) instanceof Solar) {
                                System.out.println("1-Ancho\n"
                                        + "2-Largo\n"
                                        + "Elija opcion:");
                                modificar = lea.nextInt();

                                System.out.println("Ingrese nuevo valor:");
                                int newVal = lea.nextInt();

                                if (modificar == 1) {
                                    ((Solar) tempo).setAncho(newVal);
                                } else {
                                    ((Solar) tempo).setLargo(newVal);
                                }
                            }
                        } else if (men == 3) {
                            System.out.println("Necesita ingresar con un usuario credenciales de administrador");
                        }

                        if (men == 4 && checkAdmin(usuario)) {
                            int p = 0;
                            do {
                                System.out.println("Posicion del inmueble que desea borrar (empezando desde 1):");
                                p = lea.nextInt();
                            } while (p < 0 || p > lista.size());

                            lista.remove(p - 1);
                        } else if (men == 4) {
                            System.out.println("Necesita ingresar con un usuario credenciales de administrador");
                        }
                        if (men == 5 && usuario != null) {
                            int p = 0;
                            do {
                                System.out.println("Posicion del inmueble que desea comprar (empezando desde 1):");
                                p = lea.nextInt();
                            } while (p < 0 || p > lista.size());

                            if (lista.get(p - 1) instanceof Casa) {
                                ((Casa) lista.get(p - 1)).setOwner(usuario.getNombre());
                            } else if (lista.get(p - 1) instanceof Edificio) {
                                ((Edificio) lista.get(p - 1)).setOwner(usuario.getNombre());
                            } else {
                                ((Solar) lista.get(p - 1)).setOwner(usuario.getNombre());
                            }

                        } else if (men == 5) {
                            System.out.println("Necesita ingresar con un usuario.");
                        }

                    } else {
                        System.out.println("No tiene usuario");
                    }
                    break;
                case 2:
                    if (usuario != null) {
                        if (checkAdmin(usuario)) {
                            int p = 0;
                            do {
                                System.out.println("Posicion del inmueble cuyo estado cambiara (empezando desde 1):");
                                p = lea.nextInt();
                            } while (p < 1 || p > lista.size());

                            Object t = lista.get(p - 1);
                            String[] estados = {"En espera de construccion", "En construccion", "Lista", "En espera de demolicion", "Demolida"};
                            int i = 0;
                            for (String estado : estados) {
                                System.out.println( i+1 + "-" + estados[i] + "\n");
                                i++;
                            }
                            
                            System.out.println("Ingrese posicion de estado:");
                            int x = lea.nextInt();
                            if (lista.get(p - 1) instanceof Casa) {
                                ((Casa) t).setEstado(x-1);
                            } else if (lista.get(p-1) instanceof Edificio) {
                                ((Edificio) t).setEstado(x-1);
                            } else if (lista.get(p-1) instanceof Solar) {
                                System.out.println("No se puede cambiar el estado de un solar");
                            }else{
                                System.out.println("fracaso");
                            }
                        }else{
                            System.out.println("Necesita perfil de administradar");
                        }
                    }else{
                        System.out.println("Necesita ingresa a un usuario");
                    }
                    break;
                case 3:
                    System.out.println("1-log in\n"
                            + "2-log out\n"
                            + "3-sign up\n"
                            + "ingrese opcion:");
                    int opcion = lea.nextInt();
                    if (opcion == 1 && usuario == null) {
                        System.out.println("Ingrese username: ");
                        String username = lea.next();
                        System.out.println("Ingrese password: ");
                        String password = lea.next();
                        boolean truth = false;
                        for (User user : userList) {
                            System.out.println("llego");
                            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                                truth = true;
                                usuario = user;
                            }
                        }

                        if (truth == true) {
                            System.out.println("Ingreso al nuevo usuario");
                        } else {
                            System.out.println("El usuario no esta en la lista");
                        }

                    } else if (usuario != null && opcion == 1) {
                        System.out.println("Ya esta logged in");
                    }

                    if (opcion == 2 && usuario != null) {
                        usuario = null;
                        System.out.println("Cerro sesion");
                    } else if (opcion == 2 && usuario == null) {
                        System.out.println("No ha ingresado sesion");
                    }

                    if (opcion == 3) {
                        System.out.println("Ingrese nuevo nombre:");
                        String nombre = lea.next();
                        System.out.println("Ingrese nuevo usuario:");
                        String user = lea.next();
                        System.out.println("Ingrese edad:");
                        int edad = lea.nextInt();
                        System.out.println("Ingrese password:");
                        String password = lea.next();

                        User temporal = new User(nombre, edad, user, password);
                        userList.add(temporal);
                    }
                    break;

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
