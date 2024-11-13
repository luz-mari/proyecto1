package com.caso.banco.service.impl;

import com.caso.banco.controller.dto.Cuenta;
import com.caso.banco.service.CuentaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CuentasServiceImpl implements CuentaService {


    @Override
    public List<Cuenta> listadoCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setTipo_cuenta(1);
        cuenta.setNumero_cuenta(123456);
        cuenta.setId_cliente(1);
        cuenta.setSaldo(12);
        List<Cuenta> registro = new ArrayList<>();
        registro.add(cuenta);
        return registro;
    }

    @Override
    public Cuenta registrar(Cuenta a) {
        System.out.println(a.getNumero_cuenta());
        System.out.println(a.getSaldo());
        System.out.println(a.getTipo_cuenta());
        System.out.println(a.getId_cliente());
        return a;

    }
}
