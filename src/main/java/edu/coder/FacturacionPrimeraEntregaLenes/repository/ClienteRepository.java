package edu.coder.FacturacionPrimeraEntregaLenes.repository;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
