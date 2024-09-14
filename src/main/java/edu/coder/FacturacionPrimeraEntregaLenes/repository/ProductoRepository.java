package edu.coder.FacturacionPrimeraEntregaLenes.repository;

import edu.coder.FacturacionPrimeraEntregaLenes.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
