import cr.ac.ucenfotec.tareauno.entidades.*;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static final Scanner input = new Scanner(System.in);
    private static final PrintStream output = new PrintStream(System.out);
    private static final Cita[] ARREGLO_DE_CITAS = new Cita[10];
    private static final Dueno[] ARREGLO_DE_DUENOS = new Dueno[10];
    private static final Mascota[] ARREGLO_DE_MASCOTAS = new Mascota[10];
    private static final Reservacion[] ARREGLO_DE_RESERVACIONES = new Reservacion[10];
    private static final Usuario[] ARREGLO_DE_USUARIOS = new Usuario[10];
    private static int nextPosicion = 0;

    public static void main(String[] args) {
        int cedula = 0;
        int opcion = 0;

        Dueno inicialDueno = new Dueno("Sin Nombre", 11111111, 87103251 ,"Sin@Registro.com");
        Arrays.fill(ARREGLO_DE_DUENOS, inicialDueno);
        Mascota inicialMascota = new Mascota("Sin Nombre", inicialDueno, true ,1, 3, "No Determinada");
        Arrays.fill(ARREGLO_DE_MASCOTAS, inicialMascota);
        Cita inicialCita = new Cita("No Determinada", "No Determinada", "No Determinada", inicialMascota);
        Arrays.fill(ARREGLO_DE_CITAS, inicialCita);
        Reservacion inicialReservacion = new Reservacion("No Determinada", "No Determinada", inicialMascota);
        Arrays.fill(ARREGLO_DE_RESERVACIONES, inicialReservacion);
        Usuario inicialUsuario = new Usuario("Sin Nombre", 11111111, 87103251 ,"Sin@Registro.com", true, "Doctor@-Secretari@");
        Arrays.fill(ARREGLO_DE_USUARIOS, inicialUsuario);

        do {
            cedula = menuBienvenida();
            boolean inicio = procesarBienvenida(cedula);
            if (inicio == true) {
                menuRegistroUsuario(cedula);
            }
        } while (opcion != 0);

        do {
            menuPrincipal();
            opcion = input.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 9) ;
    }

    private static int menuBienvenida() {
        int ced = 0;
        output.println("***Bienvenido a Veterinaria MOKA***");
        output.println("Ingresa tu numero de cedula: ");
        ced = input.nextInt();
        return ced;
    }

    private static boolean procesarBienvenida(int cedula) {

        int registro;
        boolean nuevo = false;

        for (int i = 0; i < ARREGLO_DE_USUARIOS.length; i++) {
            if (ARREGLO_DE_USUARIOS[i].getCedula() == cedula) {
                output.println("Un placer tenerte de vuelta " + ARREGLO_DE_USUARIOS[i].getNombre() + ".");
                nuevo = false;
                return nuevo;
            }
        }
        output.println("No contamos con tu cedula en registro, desearias registrarte?");
        output.println("1 (Si) o 2 (No)");
        registro = input.nextInt();
        if (registro == 1) {
            nuevo = true;
            return nuevo;
        } else {
            output.println("Entendido, siempre a tu servicio.");
            output.println("Te esperamos pronto!");
            System.exit(0);
        }
        return nuevo;
    }

    private static void menuRegistroUsuario(int cedula) {

        int confirmacion = 0;
        output.println("Gracias por querer ser parte de nuestra familia en Veterinaria MOKA");
        output.println("Por favor valida e ingresa los siguientes datos: ");
        output.println("Cedula ingresada inicialmente " + cedula);
        output.println("Deseas confirmar (1) o modificar (2)?");
        confirmacion = input.nextInt();
        if (confirmacion == 2) {
            output.println("Ingresa el numero de cedula correcto: ");
            cedula = input.nextInt();
        }
        output.println("Indica tu nombre (minimo un apellido): ");
        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine();
        output.println("Numero de telefono: ");
        int telefono = input.nextInt();
        output.println("Correo electronico: ");
        String correo = input.next();
        output.println("Rol: ");
        String rol = input.next();
        boolean estado = true;
        Usuario nuevo = new Usuario(nombre, cedula, telefono, correo, estado, rol);
        ARREGLO_DE_USUARIOS[nextPosicion++] = nuevo;
        output.println(ARREGLO_DE_USUARIOS[--nextPosicion] + " te haz registrado con exito!");
    }

    private static void menuPrincipal() {
        output.println("1. Registrar Mascota");
        output.println("2. Listar Mascotas");
        output.println("3. Registrar Usuario");
        output.println("4. Listar Usuarios");
        output.println("5. Solicitar Cita");
        output.println("6. Listar Citas");
        output.println("7. Realizar Reservacion");
        output.println("8. Listar Reservaciones");
        output.println("9. Salir");
        output.println("Ingrese su opcion -> ");
    }

    private static void procesarOpcion(int opcion) {

        Scanner in = new Scanner(System.in);
        switch (opcion) {
            case 1:
                output.println("Nombre de la mascota:");
                String nombre = in.nextLine();
                output.println("Dueno:");
                String duenoMascota = in.nextLine();
                Dueno duenoMascotaDos = ARREGLO_DE_DUENOS[0];
                for (int i = 0; i < ARREGLO_DE_DUENOS.length; i++) {
                    if (ARREGLO_DE_DUENOS[i].getNombre().equals(duenoMascota)) {
                        duenoMascotaDos = ARREGLO_DE_DUENOS[i];
                    }
                }
                output.println("Foto 1 (Si) o 2 (No):");
                int z = input.nextInt();
                boolean foto;
                if (z == 1) {
                    foto = true;
                } else {
                    foto = false;
                }
                output.println("Edad:");
                int edad = input.nextInt();
                output.println("Ranking:");
                int ranking = input.nextInt();
                output.println("Observaciones:");
                String observaciones = in.nextLine();
                Mascota nueva = new Mascota(nombre, duenoMascotaDos, foto, edad, ranking, observaciones);
                ARREGLO_DE_MASCOTAS[nextPosicion++] = nueva;
                break;
            case 2:
                for (int i = 0; i < ARREGLO_DE_MASCOTAS.length; i++) {
                    output.println("#" + (i + 1) + "" + ARREGLO_DE_MASCOTAS[i]);
                }
                break;
            case 3:
                output.println("Nombre del Usuario:");
                String nombreUsuario = in.nextLine();
                output.println("Cedula:");
                int cedula = input.nextInt();
                output.println("Telefono:");
                int telefono = input.nextInt();
                output.println("Correo:");
                String correo = in.nextLine();
                output.println("Foto 1 (Si) o 2 (No):");
                int n = input.nextInt();
                boolean estado;
                if (n == 1) {
                    estado = true;
                } else {
                    estado = false;
                }
                output.println("Rol:");
                String rol = in.nextLine();
                Usuario nuevo = new Usuario(nombreUsuario, cedula, telefono, correo, estado, rol);
                ARREGLO_DE_USUARIOS[nextPosicion++] = nuevo;
                break;
            case 4:
                for (int i = 0; i < ARREGLO_DE_USUARIOS.length; i++) {
                    output.println("#" + (i + 1) + "" + ARREGLO_DE_USUARIOS[i]);
                }
                break;
            case 5:
                output.println("Fecha: ");
                String fecha = in.nextLine();
                output.println("Hora: ");
                String hora = in.nextLine();
                output.println("Observaciones");
                String observacionesCita = in.nextLine();
                output.println("Mascota: ");
                String mascotaCita = in.nextLine();
                Mascota mascotaCitaDos = ARREGLO_DE_MASCOTAS[0];
                for (int i = 0; i < ARREGLO_DE_MASCOTAS.length; i++) {
                    if (ARREGLO_DE_MASCOTAS[i].getNombre().equals(mascotaCita)) {
                        mascotaCitaDos = ARREGLO_DE_MASCOTAS[i];
                    }
                }
                Cita nuevaCita = new Cita(fecha, hora, observacionesCita, mascotaCitaDos);
                ARREGLO_DE_CITAS[nextPosicion++] = nuevaCita;
                break;
            case 6:
                for (int i = 0; i < ARREGLO_DE_CITAS.length; i++) {
                    output.println("#" + (i + 1) + "" + ARREGLO_DE_CITAS[i]);
                }
                break;
            case 7:
                //  public Reservacion(String entrada, String salida, Mascota mascota) {
                output.println("Entrada: ");
                String entrada = in.nextLine();
                output.println("Salida: ");
                String salida = in.nextLine();
                output.println("Mascota: ");
                String mascotaReservacion = in.nextLine();
                Mascota mascotaReservacionDos = ARREGLO_DE_MASCOTAS[0];
                for (int i = 0; i < ARREGLO_DE_MASCOTAS.length; i++) {
                    if (ARREGLO_DE_MASCOTAS[i].getNombre().equals(mascotaReservacion)) {
                        mascotaCitaDos = ARREGLO_DE_MASCOTAS[i];
                    }
                }
                Reservacion nuevaReservacion = new Reservacion(entrada, salida, mascotaReservacionDos);
                ARREGLO_DE_RESERVACIONES[nextPosicion++] = nuevaReservacion;
                break;
            case 8:
                for (int i = 0; i < ARREGLO_DE_RESERVACIONES.length; i++) {
                    output.println("#" + (i + 1) + "" + ARREGLO_DE_RESERVACIONES[i]);
                }
                break;
            case 9:
                break;
            default:
                output.println("Opcion Desconocida!");
        }
    }
}


