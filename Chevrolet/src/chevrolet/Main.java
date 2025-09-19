package chevrolet;
import javax.swing.JOptionPane;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Cliente> lista_clientes = new ArrayList<>();
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
        ArrayList<Vehiculo> lista_vehiculos = new ArrayList<>();
        String Usuario = "geosoft";
        String Contraseña ="$geosoft$";
        boolean opcion_user = false;
        int Tries=3;
        while (Tries!=0) {
            Tries--;
            String IngresoUsuario = JOptionPane.showInputDialog("Bienvenido a consesionaria Fro:"
                                                                + "\nIngrese el usuario:");
            String IngresoContraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");
            if(IngresoUsuario.equals(Usuario) && IngresoContraseña.equals(Contraseña)){
                 opcion_user=true;
                 break;
             }else if( (IngresoContraseña.equals(Contraseña) != true ||IngresoContraseña.equals(Contraseña)!=true) && Tries !=0){
             
                 JOptionPane.showMessageDialog(null,"Contraseña o usuario incorrecto por favor intentar devuelta. " + Tries + " intento/s restantes.");
            }
            }
            if(opcion_user == false){
                JOptionPane.showMessageDialog(null,"Inicio de sesion fallido.");
            }
        while(opcion_user = true){
            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido! Seleccione una opcion:\n"
                    + "1 - Clientes\n"
                    + "2 - Empleados\n"
                    + "3 - Vehiculos"));
            int opcion_submenu;
            switch(opcion_menu){
                //Clientes
                case 1:
                    JOptionPane.showMessageDialog(null, "Has Seleccionado Clientes");
                    break;
                
                //Empleados
                case 2:
                    JOptionPane.showMessageDialog(null, "Has Seleccionado Empleados");
                    opcion_submenu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                            + "1 - Ingresar empleados\n"
                            + "2 - Mostrar empleados\n"
                            + "3 - Buscar empleados\n"
                            + "4 - Editar empleados\n"
                            + "5 - Eliminar empleados"));
                    switch(opcion_submenu){
                        //Ingresar empleado
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Ingresar empleado");
                            int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI (sin puntos)"));
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                            String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
                            double sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo"));
                            String rol = JOptionPane.showInputDialog("Ingrese el rol:");
                            Empleado empleado_nuevo = new Empleado(dni,nombre, apellido,sueldo,rol);
                            lista_empleados.add(empleado_nuevo);
                            JOptionPane.showMessageDialog(null, "Empleado ingresado con éxito");
                            break;
                        //Mostrar empleados
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar empleados");
                            if (lista_empleados.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay empleados ingresados");
                            } else {
                                for (Empleado empleados_guardados : lista_empleados) {
                                    JOptionPane.showMessageDialog(null,
                                            "DNI: " + empleados_guardados.getDni() +
                                            "\nNombre: " + empleados_guardados.getNombre() +
                                            "\nApellido: " + empleados_guardados.getApellido() +
                                            "\nRol: " + empleados_guardados.getRol() +
                                            "\nSueldo: " + empleados_guardados.getSueldo());
                                }
                            }
                            break;
                        //Buscar empleados
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar empleado");
                            int dni_busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre del ejericio a buscar:"));
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_busqueda){
                                        JOptionPane.showMessageDialog(null,
                                            "DNI: " + empleado_encontrado.getDni() +
                                            "\nNombre: " + empleado_encontrado.getNombre() +
                                            "\nApellido: " + empleado_encontrado.getApellido() +
                                            "\nRol: " + empleado_encontrado.getRol() +
                                            "\nSueldo: " + empleado_encontrado.getSueldo());
                                        break;
                                }else{
                                        JOptionPane.showMessageDialog(null, "No se ha encontrado el empleado.");
                                        }
                            }
                            break;
                        //Editar empleado
                        case 4:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Editar empleado");
                            int dni_a_modificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del empleado a modificar"));
                            boolean dni_modificar = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if (empleado_encontrado.getDni() == dni_a_modificar){
                                    JOptionPane.showMessageDialog(null,
                                                "DNI: " + empleado_encontrado.getDni() +
                                                "\nNombre: " + empleado_encontrado.getNombre() +
                                                "\nApellido: " + empleado_encontrado.getApellido() +
                                                "\nSueldo: " + empleado_encontrado.getSueldo()+
                                                "\nRol: " + empleado_encontrado.getRol());
                                    break;
                                }
                            int nuevo_dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo DNI"));
                            String nuevo_nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                            String nuevo_apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido");
                            String nuevo_rol = JOptionPane.showInputDialog("Ingrese el nuevo rol");
                            double nuevo_sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo sueldo"));
                            empleado_encontrado.setNombre(nuevo_nombre);
                            empleado_encontrado.setApellido(nuevo_apellido);
                            empleado_encontrado.setDni(nuevo_dni);
                            empleado_encontrado.setRol(nuevo_rol);
                            empleado_encontrado.setSueldo(nuevo_sueldo);
                            }
                            break;
                        //Eliminar empleado
                        case 5:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Eliminar empleado");
                            int dni_a_eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI a eliminar:"));
                            boolean dni_eliminar = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_a_eliminar){
                                    lista_empleados.remove(dni_a_eliminar);
                                    dni_eliminar = true;
                                    JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                                    break;
                                }else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado el DNI ingresado");
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                    
                //Vehiculos
                case 3:
                    JOptionPane.showMessageDialog(null, "Has Seleccionado Vehiculos");
                    opcion_submenu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                            + "1 - Ingresar vehiculo\n"
                            + "2 - Mostrar vehiculos\n"
                            + "3 - Buscar vehiculo\n"
                            + "4 - Editar vehiculo\n"
                            + "5 - Eliminar vehiculo"));
                    switch(opcion_submenu){
                        //Ingresar vehiculos
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Ingresar vehiculos");
                            String patente = JOptionPane.showInputDialog("Ingrese la patente del vehiculo");
                            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
                            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
                            String color = JOptionPane.showInputDialog("Ingrese el color del vehiculo");
                            int cantidad_de_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas del vehiculo"));
                            String tipo_de_caja = JOptionPane.showInputDialog("Ingrese el tipo de caja del vehiculo");
                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo"));
                            String estado = JOptionPane.showInputDialog("Ingrese el estado del vehiculo");
                            Vehiculo vehiculo_nuevo =  new Vehiculo(patente,marca,modelo,color,cantidad_de_puertas,tipo_de_caja,precio,estado);
                            lista_vehiculos.add(vehiculo_nuevo);
                            JOptionPane.showMessageDialog(null,"Vehiculo se ha ingresado con exito");
                            break;
                        //Mostrar vehiculos
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Mostrar vehiculos");
                            if (lista_vehiculos.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay vehiculos ingresados");
                            } else {
                                for (Vehiculo vehiculos_guardados : lista_vehiculos) {
                                    JOptionPane.showMessageDialog(null,
                                                    "Patente: " + vehiculos_guardados.getPatente() +
                                                    "\nMarca: " + vehiculos_guardados.getMarca() +
                                                    "\nModelo: " + vehiculos_guardados.getModelo() +
                                                    "\nColor: " + vehiculos_guardados.getColor() +
                                                    "\nCantidad de puertas: " + vehiculos_guardados.getCantidad_de_puertas() +
                                                    "\nTipo de caja: " + vehiculos_guardados.getTipo_de_caja() + 
                                                    "\nPrecio del vehiculo: " + vehiculos_guardados.getPrecio() +
                                                    "\nEstado: " + vehiculos_guardados.getEstado());
                                }
                            }
                            break;
                        //Buscar vehiculo
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Buscar vehiculo");
                            String patente_busqueda = JOptionPane.showInputDialog("Introducir patente del vehiculo a buscar");
                            for (Vehiculo vehiculo_encontrado : lista_vehiculos){
                                if(vehiculo_encontrado.getPatente().equals(patente_busqueda)){
                                    JOptionPane.showMessageDialog(null,
                                                    "Patente: " + vehiculo_encontrado.getPatente() +
                                                    "\nMarca: " + vehiculo_encontrado.getMarca() +
                                                    "\nModelo: " + vehiculo_encontrado.getModelo() +
                                                    "\nColor: " + vehiculo_encontrado.getColor() +
                                                    "\nCantidad de puertas: " + vehiculo_encontrado.getCantidad_de_puertas() +
                                                    "\nTipo de caja: " + vehiculo_encontrado.getTipo_de_caja() + 
                                                    "\nPrecio del vehiculo: " + vehiculo_encontrado.getPrecio() +
                                                    "\nEstado: " + vehiculo_encontrado.getEstado());
                                } 
                            }
                            break;
                        //Editar vehiculos
                        case 4:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Editar vehiculo");
                            String patente_a_modificar = JOptionPane.showInputDialog("Introducir patente del vehiculo que desea modificar");
                            boolean patente_modificar = false;
                            for (Vehiculo vehiculo_encontrado : lista_vehiculos){
                                if(vehiculo_encontrado.getPatente().equals(patente_a_modificar)){
                                    JOptionPane.showMessageDialog(null,
                                                    "Patente: " + vehiculo_encontrado.getPatente() +
                                                    "\nMarca: " + vehiculo_encontrado.getMarca() +
                                                    "\nModelo: " + vehiculo_encontrado.getModelo() +
                                                    "\nColor: " + vehiculo_encontrado.getColor() +
                                                    "\nCantidad de puertas: " + vehiculo_encontrado.getCantidad_de_puertas() +
                                                    "\nTipo de caja: " + vehiculo_encontrado.getTipo_de_caja() + 
                                                    "\nPrecio del vehiculo: " + vehiculo_encontrado.getPrecio() +
                                                    "\nEstado: " + vehiculo_encontrado.getEstado());
                                    break;
                                }
                                String new_patente = JOptionPane.showInputDialog("Ingrese la nueva patente del vehiculo");
                                String new_marca = JOptionPane.showInputDialog("Ingrese la nueva marca del vehiculo");
                                String new_modelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo del vehiculo");
                                String new_color = JOptionPane.showInputDialog("Ingrese el nuevo color del vehiculo");
                                int new_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas del vehiculo"));
                                String new_caja = JOptionPane.showInputDialog("Ingrese el nuevo tipo de caja del vehiculo");
                                double new_precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio del vehiculo"));
                                String new_estado = JOptionPane.showInputDialog("Ingrese el nuevo estado del vehiculo");
                                
                                vehiculo_encontrado.setPatente(new_patente);
                                vehiculo_encontrado.setMarca(new_marca);
                                vehiculo_encontrado.setModelo(new_modelo);
                                vehiculo_encontrado.setColor(new_color);
                                vehiculo_encontrado.setCantidad_de_puertas(new_puertas);
                                vehiculo_encontrado.setTipo_de_caja(new_caja);
                                vehiculo_encontrado.setPrecio(new_precio);
                                vehiculo_encontrado.setEstado(new_estado);
                            }
                            break;
                        //Eliminar vehiculos
                        case 5:
                            JOptionPane.showMessageDialog(null, "Has Seleccionado Eliminar vehiculo");
                            String patente_a_eliminar = JOptionPane.showInputDialog("Ingrese la patente a eliminar:");
                            boolean patente_eliminar = false;
                            for(Vehiculo vehiculo_encontrado : lista_vehiculos){
                                if(vehiculo_encontrado.getPatente().equals(patente_a_eliminar)){
                                    lista_vehiculos.remove(patente_a_eliminar);
                                    patente_eliminar = true;
                                    JOptionPane.showMessageDialog(null,"Vehiculo eliminado exitosamente");
                                    break;
                                }else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado la patente ingresada");
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;

                //default
                default:
                    break;
                
            }
        }
    }
    
}