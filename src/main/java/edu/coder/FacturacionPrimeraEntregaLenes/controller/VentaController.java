package edu.coder.FacturacionPrimeraEntregaLenes.controller;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Venta;
import edu.coder.FacturacionPrimeraEntregaLenes.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService vS;

    @GetMapping
    public List<Venta> listarVentas() {
        return vS.listarVentas();
    }

    @PostMapping
    public void crearVenta(@RequestBody Venta venta) {
        vS.insertarVenta(venta);
    }

    @GetMapping("/{id}")
    public Venta buscarVenta(@PathVariable("id") int id) {
        return vS.buscarVenta(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable("id") int id) {
        vS.eliminarVenta(id);
    }

    @PutMapping
    public void modificarVenta(@RequestBody Venta venta) {
        vS.modificarVenta(venta);
    }

}
