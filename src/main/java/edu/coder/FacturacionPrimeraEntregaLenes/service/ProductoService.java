package edu.coder.FacturacionPrimeraEntregaLenes.service;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Producto;
import edu.coder.FacturacionPrimeraEntregaLenes.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository pR;

    public List<Producto> listarProductos() {
        return pR.findAll();
    }

    public Producto buscarProducto(int id) {
        return pR.findById(id).orElse(new Producto());
    }

    public void insertarProducto(Producto producto) {
        pR.save(producto);
    }

    public void eliminarProducto(int id) {
        pR.deleteById(id);
    }

    public void modificarProducto(Producto producto) {
        pR.save(producto);
    }
}
