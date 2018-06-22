package com.appventas.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Set;
import javafx.beans.property.IntegerProperty;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    private final IntegerProperty codigo;
    private final StringProperty nombre;
    private final StringProperty descripcion;
    private Set<Productos> productos;
    public Categoria () {
        this.codigo = new SimpleIntegerProperty();
        this.nombre = new SimpleStringProperty();
        this.descripcion = new SimpleStringProperty();
        
    }    
    public Categoria(int codigo, String nombre, String descripcion) {
        this.codigo = new SimpleIntegerProperty(codigo);
        this.nombre = new SimpleStringProperty(nombre);
        this.descripcion = new SimpleStringProperty(descripcion);
        
    }
    
    public IntegerProperty codigo(){
        return this.codigo;
    }
       
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_Categoria")
    public int getCodigo() {
        return this.codigo.get();
    }

    public void setCodigo(int codigo) {
        this.codigo.set(codigo);
    }
    
    
    @Column(name="nombre")
    public String getNombre() {
        return this.nombre.get();
    }
    
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    public StringProperty nombre(){
        return nombre;
    }

    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion.get();
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public StringProperty descripcion(){
        return descripcion;
    }
    
    @OneToMany(mappedBy = "categoria")
    public Set<Productos> getProductos() {
        return productos;
    }
    
    public void setProductos(Set<Productos> productos) {
        this.productos = productos;
    }
}