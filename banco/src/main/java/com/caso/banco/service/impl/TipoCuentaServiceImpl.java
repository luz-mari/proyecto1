package com.caso.banco.service.impl;

import com.caso.banco.controller.dto.TipoCuenta;
import com.caso.banco.service.TipoCuentaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TipoCuentaServiceImpl implements TipoCuentaService {

    @Override
    public List<TipoCuenta> listadotipo_cuenta() {
        TipoCuenta tipo = new TipoCuenta();
        tipo.setId(1);
        tipo.setDescripcion("ahorro");
        List<TipoCuenta> relacion = new ArrayList<>();
        relacion.add(tipo);
        return relacion;
    }

    @Override
    public TipoCuenta registrar(TipoCuenta a) {
        System.out.println(a.getDescripcion());
        System.out.println(a.getId());
        return a;
    }
}
