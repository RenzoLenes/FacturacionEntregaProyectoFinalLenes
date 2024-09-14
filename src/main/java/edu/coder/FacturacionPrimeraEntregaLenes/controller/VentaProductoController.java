package edu.coder.FacturacionPrimeraEntregaLenes.controller;

import edu.coder.FacturacionPrimeraEntregaLenes.model.VentaProducto;
import edu.coder.FacturacionPrimeraEntregaLenes.service.VentaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VentaProductos")
public class VentaProductoController {

    @Autowired
    private VentaProductoService vpS;

    @GetMapping
    public List<VentaProducto> listarVentaProductos() {
        return vpS.listarVentaProducto();
    }

    @PostMapping
    public void crearVentaProducto(@RequestBody VentaProducto vp) {
        vpS.insertarVentaProducto(vp);
    }

    @GetMapping("/{id}")
    public VentaProducto buscarVentaProducto(@PathVariable("id") int id) {
        return vpS.buscarVentaProducto(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarVentaProducto(@PathVariable("id") int id) {
        vpS.eliminarVentaProducto(id);
    }

    @PutMapping
    public void modificarVentaProducto(@RequestBody VentaProducto vp) {
        vpS.modificarVentaProducto(vp);
    }
}

