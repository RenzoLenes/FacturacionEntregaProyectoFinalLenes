package edu.coder.FacturacionPrimeraEntregaLenes.service;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Cliente;
import edu.coder.FacturacionPrimeraEntregaLenes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository cR;

    public List<Cliente> listarClientes() {
       return cR.findAll();
    }

    public Cliente buscarCliente(int id) {
        return cR.findById(id).orElse(new Cliente());
    }

    public void insertarCliente(Cliente cliente){
        cR.save(cliente);
    }

    public void eliminarCliente(int id) {
        cR.deleteById(id);
    }

    public void modificarCliente(Cliente cliente) {
        cR.save(cliente);
    }
}
