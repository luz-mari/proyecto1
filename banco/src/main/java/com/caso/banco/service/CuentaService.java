package com.caso.banco.service;

import com.caso.banco.controller.dto.Cuenta;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CuentaService {
    List<Cuenta> listadoCuenta();
    Cuenta registrar (@RequestBody Cuenta a);
}
