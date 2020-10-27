package Controlador;

import Modelo.LoginModelo;
import Vista.LoginVista;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginControlador implements ActionListener {

    private LoginVista view;
    private LoginModelo model;

    public LoginControlador(LoginVista view, LoginModelo model) {
        this.view = view;
        this.model = model;

        this.view.Entrar.addActionListener(this);

    }

    public void iniciar() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimen = view.getSize();
        view.setLocation(
                (pantalla.width - dimen.width) / 2,
                (pantalla.height - dimen.height) / 2);
        view.setVisible(true);
    }

    public void cerrar() {
        view.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setUsuario(view.User.getText());
        model.setContraseña(view.Password.getText());
        model.BuscarUsuario();
        if (model.BuscarUsuario() == false) {
            

            JOptionPane.showMessageDialog(null, "El Usuario o Contraseña son Incorrectos", "Acceso Denegado",1);
            view.dispose();
        }

    }

}
