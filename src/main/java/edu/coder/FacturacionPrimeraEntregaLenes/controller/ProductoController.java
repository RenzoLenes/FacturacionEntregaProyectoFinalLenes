package edu.coder.FacturacionPrimeraEntregaLenes.controller;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Producto;
import edu.coder.FacturacionPrimeraEntregaLenes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService pS;

    @GetMapping
    public List<Producto> listarProductos() {
        return pS.listarProductos();
    }

    @PostMapping
    public void crearProducto(@RequestBody Producto producto) {
        pS.insertarProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable("id") int id) {
        return pS.buscarProducto(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") int id) {
        pS.eliminarProducto(id);
    }

    @PutMapping
    public void modificarProducto(@RequestBody Producto producto) {
        pS.modificarProducto(producto);
    }
}
