
package com.EjercicioPractico1.DAO;


import com.EjercicioPractico1.Domain.Libros;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibrosDao  extends JpaRepository <Libros,Long> {
    
}
