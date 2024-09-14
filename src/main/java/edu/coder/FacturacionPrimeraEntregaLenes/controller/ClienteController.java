package edu.coder.FacturacionPrimeraEntregaLenes.controller;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Cliente;
import edu.coder.FacturacionPrimeraEntregaLenes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService cS;

    @GetMapping
    public List<Cliente> listarClientes() {
        return cS.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable int id) {
        return cS.buscarCliente(id);
    }

    @PostMapping
    public void crearCliente(@RequestBody Cliente cliente) {
        cS.insertarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable("id") Integer id) {
        cS.eliminarCliente(id);
    }

    @PutMapping
    public void modificarCliente(@RequestBody Cliente cliente) {
        cS.modificarCliente(cliente);
    }
}
