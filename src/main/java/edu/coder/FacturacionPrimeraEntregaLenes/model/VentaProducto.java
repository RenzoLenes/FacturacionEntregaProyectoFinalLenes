package edu.coder.FacturacionPrimeraEntregaLenes.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "VENTAPRODUCTO")
public class VentaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVentaProducto;

    @ManyToOne
    @JoinColumn(name = "idVenta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @Column(name = "CANTIDAD")
    private int cantidad;

    public VentaProducto() {
    }

    public VentaProducto(Venta venta, Producto producto, int cantidad) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return idVentaProducto;
    }

    public void setId(int id) {
        this.idVentaProducto = id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentaProducto that = (VentaProducto) o;
        return idVentaProducto == that.idVentaProducto && cantidad == that.cantidad && Objects.equals(venta, that.venta) && Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVentaProducto, venta, producto, cantidad);
    }

    @Override
    public String toString() {
        return "VentaProducto{" +
                "id=" + idVentaProducto +
                ", venta=" + venta +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
