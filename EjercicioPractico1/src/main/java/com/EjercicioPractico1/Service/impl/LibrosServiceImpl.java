
package com.EjercicioPractico1.Service.impl;

import com.EjercicioPractico1.DAO.LibrosDao;
import com.EjercicioPractico1.Domain.Libros;
import com.EjercicioPractico1.Service.LibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class LibrosServiceImpl implements LibrosService{
    
     @Autowired
    private LibrosDao libroDao;
    
    
    @Transactional(readOnly=true)
    @Override
    public List<Libros> getLibros() {
        var lista=libroDao.findAll();
        return lista;
    }
}

    