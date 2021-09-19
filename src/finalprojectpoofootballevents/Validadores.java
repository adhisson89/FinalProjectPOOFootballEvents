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
    
}
