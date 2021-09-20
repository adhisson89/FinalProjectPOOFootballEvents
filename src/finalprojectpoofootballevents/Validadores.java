/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

/**
 *
 * @author Adhisson
 */
public class Validadores {
    
    public static boolean validadorCedulaIdentidad(String cedulaIdentidad) {

        byte suma = 0;

        try {
            if (cedulaIdentidad.length() != 10) {
                //System.out.println("La cédula no es válida");
                return false;
            }
            String[] datos = cedulaIdentidad.split("");
            byte verificador = Byte.parseByte(datos[0] + datos[1]);

            if (verificador < 1 || verificador > 24) {
                //System.out.println("La cédula no es válida");
                return false;
            }
            byte[] digitos = new byte[datos.length];

            for (int i = 0; i < digitos.length; i++) {
                digitos[i] = Byte.parseByte(datos[i]);
            }

            if (digitos[2] > 6) {
                return false;
            }

            for (int i = 0; i < digitos.length - 1; i++) {
                if (i % 2 == 0) {
                    verificador = (byte) (digitos[i] * 2);
                    if (verificador > 9) {
                        verificador = (byte) (verificador - 9);
                    }
                } else {
                    verificador = (byte) (digitos[i] * 1);
                }
                suma = (byte) (suma + verificador);
            }

            if ((suma - (suma % 10) + 10 - suma) == digitos[9]) {
                return true;
            }

        } catch (NumberFormatException e) {
            
        }

        return false;
    }
    
    
    public static boolean validadorDigitos(String digitos){
       return digitos.matches("^\\d*.\\d*$");
    }
    
    public static boolean validadorBoletos(String digitos){
       return digitos.matches("^\\d*$");
    }
    
     public static boolean validadorAnio(String digitos){
       return digitos.matches("^\\d{4}$");
    }
    
    public static boolean validadorCorreoElectronico(String correo){
        return correo.matches("^(?!(?:(?:\\x22?\\x5C[\\x00-\\x7E]\\x22?)|(?:\\x22?[^\\x5C\\x22]\\x22?)){255,})(?!(?:(?:\\x22?\\x5C[\\x00-\\x7E]\\x22?)|(?:\\x22?[^\\x5C\\x22]\\x22?)){65,}@)(?:(?:[\\x21\\x23-\\x27\\x2A\\x2B\\x2D\\x2F-\\x39\\x3D\\x3F\\x5E-\\x7E]+)|(?:\\x22(?:[\\x01-\\x08\\x0B\\x0C\\x0E-\\x1F\\x21\\x23-\\x5B\\x5D-\\x7F]|(?:\\x5C[\\x00-\\x7F]))*\\x22))(?:\\.(?:(?:[\\x21\\x23-\\x27\\x2A\\x2B\\x2D\\x2F-\\x39\\x3D\\x3F\\x5E-\\x7E]+)|(?:\\x22(?:[\\x01-\\x08\\x0B\\x0C\\x0E-\\x1F\\x21\\x23-\\x5B\\x5D-\\x7F]|(?:\\x5C[\\x00-\\x7F]))*\\x22)))*@(?:(?:(?!.*[^.]{64,})(?:(?:(?:xn--)?[a-z0-9]+(?:-[a-z0-9]+)*\\.){1,126}){1,}(?:(?:[a-z][a-z0-9]*)|(?:(?:xn--)[a-z0-9]+))(?:-[a-z0-9]+)*)|(?:\\[(?:(?:IPv6:(?:(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){7})|(?:(?!(?:.*[a-f0-9][:\\]]){7,})(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){0,5})?::(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){0,5})?)))|(?:(?:IPv6:(?:(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){5}:)|(?:(?!(?:.*[a-f0-9]:){5,})(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){0,3})?::(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){0,3}:)?)))?(?:(?:25[0-5])|(?:2[0-4][0-9])|(?:1[0-9]{2})|(?:[1-9]?[0-9]))(?:\\.(?:(?:25[0-5])|(?:2[0-4][0-9])|(?:1[0-9]{2})|(?:[1-9]?[0-9]))){3}))\\]))$");
    }
    
    public static boolean validadorHora(String hora){
        return hora.matches("^(20|21|22|23|[01]\\d|\\d)((:[0-5]\\d){1,2})$");
    }
    
    public static boolean validadorFecha(String fecha){
        return fecha.matches("^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$");
    }
    
    public static boolean validadorEdad(String edad){
        return edad.matches("^\\d{1,3}$");
    }
    
}
