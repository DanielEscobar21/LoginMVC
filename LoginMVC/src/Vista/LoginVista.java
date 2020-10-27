package Vista;

import Controlador.RegistroControlador;
import Modelo.RegistroModelo;
import java.awt.*;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class LoginVista extends JFrame {

    public final JButton Entrar;
    public final JLabel ImagenLogin;
    public final JSeparator Linea1;
    public final JSeparator Linea2;
    public final JPasswordField Password;
    public final JLabel PasswordE;
    public final JLabel PasswordI;
    public final JTextField User;
    public final JLabel UserE;
    public final JLabel UserI;
    public final JPanel Panel;
    public final JButton NuevoUser;
    public final JButton Cerrar;

    public LoginVista() {
        super("Inicia Sesión para Continuar");
        Panel = new JPanel();
        UserE = new JLabel("NOMBRE DE USUARIO:");
        PasswordE = new JLabel("CONTRASEÑA:");
        ImagenLogin = new JLabel();
        User = new JTextField();
        Linea2 = new JSeparator();
        Linea1 = new JSeparator();
        Password = new JPasswordField();
        UserI = new JLabel();
        PasswordI = new JLabel();
        Entrar = new JButton();
        NuevoUser = new JButton("Registrar nuevo Usuario");
        Cerrar = new JButton();

        setIconImage(new ImageIcon("src/images/icons8_User_96px_2.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new AbsoluteLayout());

        Panel.setBackground(new Color(255, 255, 255));
        Panel.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        Panel.setForeground(new Color(255, 255, 255));
        Panel.setLayout(new AbsoluteLayout());

        Cerrar.setIcon(new ImageIcon("src/image/icons8_Multiply_32px.png"));
        Cerrar.setBorder(null);
        Cerrar.setBorderPainted(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel.add(Cerrar, new AbsoluteConstraints(250, 10, -1, -1));

        UserE.setBackground(new Color(238, 112, 82));
        UserE.setFont(new Font("Century Gothic", 1, 18));
        UserE.setForeground(new Color(238, 112, 82));
        Panel.add(UserE, new AbsoluteConstraints(40, 210, -1, -1));

        PasswordE.setBackground(new Color(238, 112, 82));
        PasswordE.setFont(new Font("Century Gothic", 1, 18));
        PasswordE.setForeground(new Color(238, 112, 82));
        Panel.add(PasswordE, new AbsoluteConstraints(40, 310, -1, -1));

        ImagenLogin.setIcon(new ImageIcon("src/image/icons8_User_96px_2.png"));
        Panel.add(ImagenLogin, new AbsoluteConstraints(90, 100, -1, -1));

        User.setBackground(new Color(255, 255, 255));
        User.setFont(new Font("Dialog", 0, 14));
        User.setForeground(new Color(153, 153, 153));
        User.setBorder(null);
        Panel.add(User, new AbsoluteConstraints(50, 230, 190, 30));
        Panel.add(Linea2, new AbsoluteConstraints(50, 360, 200, 10));
        Panel.add(Linea1, new AbsoluteConstraints(50, 260, 200, 10));

        Password.setBackground(new Color(255, 255, 255));
        Password.setBorder(null);
        Panel.add(Password, new AbsoluteConstraints(50, 330, 190, 30));

        UserI.setIcon(new ImageIcon("src/image/icons8_customer_32px_1.png"));
        Panel.add(UserI, new AbsoluteConstraints(10, 230, -1, -1));

        PasswordI.setIcon(new ImageIcon("src/image/icons8_Key_32px.png"));
        Panel.add(PasswordI, new AbsoluteConstraints(10, 330, -1, -1));

        Entrar.setIcon(new ImageIcon("src/image/Enter_OFF.png"));
        Entrar.setBorder(null);
        Entrar.setBorderPainted(false);
        Entrar.setContentAreaFilled(false);
        Entrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Entrar.setRolloverIcon(new ImageIcon("src/image/Enter_ON.png"));
        Entrar.setRolloverSelectedIcon(new ImageIcon("src/image/Enter_ON.png"));
        Entrar.setSelectedIcon(new ImageIcon("src/image/Enter_ON.png"));
        Entrar.setSelected(true);
        Panel.add(Entrar, new AbsoluteConstraints(70, 400, -1, -1));

        NuevoUser.setBackground(new Color(238, 112, 82));
        NuevoUser.setForeground(new Color(238, 112, 82));
        NuevoUser.setBorder(null);
        NuevoUser.setBorderPainted(false);
        NuevoUser.setContentAreaFilled(false);
        NuevoUser.setIcon(new ImageIcon("src/image/icons10_RegisterSmall.png"));
        NuevoUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel.add(NuevoUser, new AbsoluteConstraints(50, 470, -1, -1));

        getContentPane().add(Panel, new AbsoluteConstraints(0, 0, 290, 580));
        this.pack();

        NuevoUser.addActionListener(
                (e) -> {
                    this.dispose();
                    RegistroModelo mod = new RegistroModelo();
                    RegistroVista view = new RegistroVista();
                    RegistroControlador crt = new RegistroControlador(view, mod);
                    crt.iniciar();
                }
        );

        Cerrar.addActionListener(
                (e) -> {
                    this.dispose();
                }
        );

    }

}
