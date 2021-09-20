/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Adhisson
 * https://es.stackoverflow.com/questions/355908/c%C3%B3mo-puedo-a%C3%B1adir-datos-a-un-fichero-de-objetos-binario-sin-sobrescribir-los-da
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    
    /* Para saber si el archivo existe o no. */
    private static boolean isExist;
    
    public MiObjectOutputStream(String path) throws IOException {
        /* Invocamos al constructor de la clase ObjectOutputStream */
        super(createFile(path));
    }

    private static FileOutputStream createFile(String path) throws IOException {
        /* Si el archivo existe.. */
        if (new File(path).exists()) {
            isExist = true;
        }
        return new FileOutputStream(path, true);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        /* Si el archivo no existe.. */
        if (!isExist) {
            super.writeStreamHeader();
        }
    }
}
