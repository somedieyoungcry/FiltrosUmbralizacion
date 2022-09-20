package Ejecutable;

import Controlador.Controlador;
import Panel.Frame;
import Panel.Inicio;
import CPrincipales.Imagen;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, UnsupportedLookAndFeelException {
        Imagen img = new Imagen();
        Frame vent = new Frame();
        Inicio ini = new Inicio();
        Controlador control;
        control = new Controlador(vent, img);
        control.Iniciar();
        vent.setVisible(true);
        ini.setVisible(true);
        ini.setDefaultCloseOperation(ini.DISPOSE_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
