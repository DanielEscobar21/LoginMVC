
import Controlador.LoginControlador;
import Modelo.LoginModelo;
import Vista.LoginVista;

    
public class exe {

    public static void main(String[] args) {
        
        LoginModelo mod = new LoginModelo();
        LoginVista view = new LoginVista();
        
        LoginControlador crt = new LoginControlador(view,mod );
        crt.iniciar();
    }
    
}
    