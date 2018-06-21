package com.appventas.Controller;
import com.appelectrodomestico.model.Rol;
import com.appelectrodomestico.model.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class LoginController implements Initializable {
    private static EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNI_NAME = "ElektraPU";
    @FXML private TextField txtLogin;
    @FXML private PasswordField txtPassword;
    @Override 
    public void initialize(URL location, ResourceBundle resources) {
   
    }

    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }
    
    public void login() {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityMgr = getEntityManager();
        entityMgr.getTransaction().begin();
        if(entityMgr.CreateQuery("select u from Usuario u where u.producto and u.categoria = :categoria")
                .setParameter("producto", txtProducto.getText()))
    }
    
}
