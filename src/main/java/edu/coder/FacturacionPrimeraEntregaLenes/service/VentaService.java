package edu.coder.FacturacionPrimeraEntregaLenes.service;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Venta;
import edu.coder.FacturacionPrimeraEntregaLenes.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository vR;

    public List<Venta> listarVentas(){
        return vR.findAll();
    }

    public Venta buscarVenta(int id){
        return vR.findById(id).orElse(new Venta());
    }

    public Venta insertarVenta(Venta v){
        return vR.save(v);
    }

    public Venta modificarVenta(Venta v){
        return vR.save(v);
    }

    public void eliminarVenta(int id){
        vR.deleteById(id);
    }
}
