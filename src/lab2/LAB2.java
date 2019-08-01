/*
 * Mario Tunchez
 * 5090-18-1890
 */
package lab2;

import java.util.Scanner;

public class LAB2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int op, x = 0;

        do {
            do {
                System.out.println("MENU\n1. QUE ES JAVA(IDE)\n2. VARIABLES-OPERADORES\n3. CONDICIONALES"
                        + "\n4. CICLOS\n5. ARREGLOS\n6. FUNCIONES\n7. FINALIZAR");
                System.out.print("\nEliga su opcion: ");
                op = entrada.nextInt();
                System.out.println(" ");

                switch (op) {
                    case 1:
                        System.out.println("Un entorno de desarrollo integrado o entorno de desarrollo interactivo, en inglés Integrated Development Environment \n"
                                + "(IDE), es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo \n"
                                + "de software.\n"
                                + "\n"
                                + "Normalmente, un IDE consiste de un editor de código fuente, herramientas de construcción automáticas y un depurador. La mayoría \n"
                                + "de los IDE tienen auto-completado inteligente de código (IntelliSense). Algunos IDE contienen un compilador, un intérprete, o ambos, \n"
                                + "tales como NetBeans y Eclipse; otros no, tales como SharpDevelop y Lazarus.\n");
                        break;
                    case 2:
                        int a,
                         b,
                         sum,
                         rest,
                         mult;
                        double div;

                        System.out.println("OPERADORES\n\nPara esta parte ingrese 2 numeros enteros en el rango\n"
                                + "de 1 a 100 de lo contrario seran igualados a cero.\n");
                        System.out.print("Ingrese un numero entero: ");
                        a = entrada.nextInt();
                        if (a < 1 || a > 100) {
                            a = 0;
                        }
                        System.out.print("Ingrese otro numero entero: ");
                        b = entrada.nextInt();
                        if (b < 1 || b > 100) {
                            b = 0;
                        }

                        sum = a + b;
                        rest = a - b;
                        mult = a * b;
                        div = a / b;

                        System.out.println("\nSuma: " + sum + "\nResta: " + rest + "\nMultiplicacion: " + mult + "\nDivision: " + div + "\n");

                        break;
                    case 3:
                        boolean bnd = false;
                        String name;
                        int nota;

                        System.out.println("CONDICIONALES\nPara esta parte debera ingresar un nombre y una nota entera y de acuerdo\n"
                                + "a esa nota se mostrara si esta o no esta exonerado del examen.\n");

                        System.out.print("Ingrese un nombre: ");
                        entrada.nextLine();
                        name = entrada.nextLine();
                        System.out.print("Ingrese un nota: ");
                        nota = entrada.nextInt();

                        if (nota >= 1 && nota <= 50) {
                            System.out.println("\nLa nota de " + name + " fue de " + nota + " y es baja.");
                        }
                        if (nota > 50 && nota < 90) {
                            System.out.println("\nLa nota de " + name + " fue de " + nota + " y es buena.");
                        }
                        if (nota >= 90 && nota <= 100) {
                            bnd = true;
                            System.out.println("\nLa nota de " + name + " fue de " + nota + " y es excelente.");
                        }
                        if (bnd == true) {
                            System.out.println("Y esta exonerado del examen.\n");
                        } else {
                            System.out.println("Pero no esta exonerado del examen.\n");
                        }
                        break;
                    case 4:
                        int n,
                         i;
                        String[] names = new String[10];

                        System.out.println("CICLOS\nPara esta parte debera ingresar cuantos nombres desea ingresar\n"
                                + "en el listado y luego se los mostrara.\n");

                        do {
                            System.out.print("Cuantos nombres desea guardar(MAX 10)? ");
                            n = entrada.nextInt();
                            if (n > 10 || n < 1) {
                                System.out.println("Error, intente nuevamente\n");
                            }
                        } while (n > 10 || n < 1);
                        System.out.println(" ");
                        entrada.nextLine();
                        for (i = 0; i < n; i++) {
                            System.out.print("Ingrese el nombre: ");
                            names[i] = entrada.nextLine();
                        }

                        System.out.println("\nNO.\tNOMBRE\n");
                        for (i = 0; i < n; i++) {
                            System.out.println((i + 1) + "\t" + names[i]);
                        }
                        System.out.println(" ");
                        break;
                    case 5:
                        String[] nom = new String[5];
                        int[] edad = new int[5];
                        int[] tel = new int[5];
                        String[] mail = new String[5];

                        System.out.println("ARREGLOS\nPara esta parte debera ingresar cuantos amigos desea guardar\n"
                                + "en la agenda y luego se los mostrara.\n");

                        do {
                            System.out.print("Cuantos amigos desea guardar(MAX 5)? ");
                            n = entrada.nextInt();
                            if (n > 5 || n < 1) {
                                System.out.println("Error, intente nuevamente\n");
                            }
                        } while (n > 5 || n < 1);
                        System.out.println(" ");
                        for (i = 0; i < n; i++) {
                            System.out.print("Ingrese nombre de amigo: ");
                            nom[i] = entrada.next();
                            System.out.print("Ingrese su edad: ");
                            edad[i] = entrada.nextInt();
                            System.out.print("Ingrese su telefono: ");
                            tel[i] = entrada.nextInt();
                            System.out.print("Ingrese su correo electronico: ");
                            mail[i] = entrada.next();
                            System.out.println("   ");
                        }
                        System.out.println("NO.\tNOMBRE\t\tEDAD\tTELEFONO\tCORREO\n");
                        for (i = 0; i < n; i++) {
                            System.out.println((i + 1) + "\t" + nom[i] + "\t\t" + edad[i] + "\t" + tel[i] + "\t\t" + mail[i]);
                        }
                        System.out.println(" ");

                        break;
                    case 6:
                        final int limite = 10;
                        int[] A = new int[limite];
                        int[] B = new int[limite];

                        for (i = 0; i < A.length; i++) {
                            A[i] = (int) Math.floor(Math.random() * (1 - 100 + 1) + 100);
                        }
                        System.arraycopy(A, 0, B, 0, limite);

                        System.out.println("FUNCIONES\nEn esta parte se llena un vector de 10 casillas con numeros random\n"
                                + "y luego se los mostrara ordenados ascendentemente.\n");

                        Burbuja(B);
                        mostrar(B);
                        break;
                    case 7:
                        System.out.println("Finalizando programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion invalida\n");
                }
            } while (op < 1 || op > 7);
        } while (x == 0);
    }

    public static void Burbuja(int matrix[]) {
        int i, j, temp;

        for (i = 1; i < 10; i++) {
            for (j = 0; j < 10 - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrar(int matrix[]) {
        int i;

        for (i = 0; i < matrix.length; i++) {
            System.out.println((i + 1) + ". " + matrix[i]);
        }
        System.out.println(" ");
    }

}
