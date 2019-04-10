package backend.objetos;

import backend.*;
import backend.analizadores.*;
import gui.ventanas.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author jonyasus
 */
public class ManejadorServidor extends Observable implements Runnable {

    private int puerto;

    public ManejadorServidor(int puerto) {
        this.puerto = puerto;
    }

    public void capturarErrores(ErrorJ error) {
        String errorStr = "";
        errorStr += "Error encontrado en: \nFila: " + error.getLinea() + "\nColumna: " + error.getColumna() + "\nDescripción: " + error.getDescripcion() + "\nVerifica que ----> " + error.getLexema() + " <---- sea correcto.";
    }

    public void accionTerminada(String accion) {
        String accionStr = "";
        accionStr = "Accion: " + accion + " se ha analizado correctamente. Errores detectados: 0";
    }

    @Override
    public void run() {
    }

}
