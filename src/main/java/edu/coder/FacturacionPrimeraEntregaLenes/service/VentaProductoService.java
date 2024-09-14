package edu.coder.FacturacionPrimeraEntregaLenes.service;

import edu.coder.FacturacionPrimeraEntregaLenes.model.VentaProducto;
import edu.coder.FacturacionPrimeraEntregaLenes.repository.VentaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaProductoService {

    @Autowired
    private VentaProductoRepository vpR;

    public List<VentaProducto> listarVentaProducto() {
        return vpR.findAll();
    }

    public VentaProducto buscarVentaProducto(int id) {
        return vpR.findById(id).orElse(new VentaProducto());
    }

    public void insertarVentaProducto(VentaProducto v) {
        vpR.save(v);
    }

    public void eliminarVentaProducto(int id) {
        vpR.deleteById(id);
    }

    public void modificarVentaProducto(VentaProducto v) {
        vpR.save(v);
    }
}
