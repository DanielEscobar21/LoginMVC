package Controlador;

import Modelo.RegistroModelo;
import Vista.RegistroVista;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroControlador implements ActionListener {

    private RegistroVista view;
    private RegistroModelo model;

    public RegistroControlador(RegistroVista view, RegistroModelo model) {
        this.view = view;
        this.model = model;
        this.view.Guardar.addActionListener(this);

    }

    public void iniciar() {
        view.setVisible(true);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimen = view.getSize();
        view.setLocation(
                (pantalla.width - dimen.width) / 2,
                (pantalla.height - dimen.height) / 2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setRegNombre(view.Nombre.getText());
        model.setRegUsuario(view.RegUs.getText());
        model.setRegPassword1(view.RegPass.getText());
        model.setRegPassword2(view.RegPass2.getText());
        model.Escritor();
        view.dispose();
        

    }
}
