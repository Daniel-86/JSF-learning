package daniel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * User: daniel
 * Date: 5/05/15
 */
@ManagedBean
@RequestScoped
public class RegistrationBean {
    private String saludo;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String email;

    public RegistrationBean() {
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
