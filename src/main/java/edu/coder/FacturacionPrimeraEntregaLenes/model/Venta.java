package edu.coder.FacturacionPrimeraEntregaLenes.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="VENTA")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;

    @ManyToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;

    @Column(name="FECHA")
    private Date fecha;

    @Column(name="MONTOTOTAL")
    private Double montoTotal;


    public Venta() {
    }

    public Venta(Cliente cliente, Date fecha, Double montoTotal) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return idVenta;
    }

    public void setId(int id) {
        this.idVenta = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venta venta = (Venta) o;
        return idVenta == venta.idVenta && Objects.equals(cliente, venta.cliente) && Objects.equals(fecha, venta.fecha) && Objects.equals(montoTotal, venta.montoTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenta, cliente, fecha, montoTotal);
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + idVenta +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", montoTotal=" + montoTotal +
                '}';
    }
}
