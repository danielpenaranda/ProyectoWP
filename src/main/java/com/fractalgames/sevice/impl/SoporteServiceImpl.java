package com.fractalgames.sevice.impl;

import com.fractalgames.dao.SoporteDao;
import com.fractalgames.domain.Soporte;
import com.fractalgames.sevice.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoporteServiceImpl implements SoporteService {

    private final SoporteDao soporteDao;

    @Autowired
    public SoporteServiceImpl(SoporteDao soporteDao) {
        this.soporteDao = soporteDao;
    }

    @Override
    public Soporte guardarSolicitud(Soporte soporte) {
        return soporteDao.save(soporte);
    }
}
