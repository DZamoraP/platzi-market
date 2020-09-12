package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto<String, Integer, Double> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCastegoria;

    @Column(name = "codigo_barras");
    private String codigoBarras;

    @Column(name = "precio_venta");
    private Double precioVenta;

    @Column(name = "cantidad_stock");
    private Integer cantidadStock;

    private boolean estado;

    // estos nos permite solamente recuperar y no insertar ni actualizar registros
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;



    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCastegoria() {
        return idCastegoria;
    }

    public void setIdCastegoria(Integer idCastegoria) {
        this.idCastegoria = idCastegoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
