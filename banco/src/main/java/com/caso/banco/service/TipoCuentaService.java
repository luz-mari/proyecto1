package com.caso.banco.service;

import com.caso.banco.controller.dto.TipoCuenta;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TipoCuentaService {
    List<TipoCuenta> listadotipo_cuenta();
    TipoCuenta registrar (@RequestBody TipoCuenta a);
}
