package com.caso.banco.controller;

import com.caso.banco.controller.dto.TipoCuenta;
import com.caso.banco.service.CuentaService;
import com.caso.banco.service.TipoCuentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/tipo_cuentas")
@RequiredArgsConstructor
public class TipoCuentaController {
    private final TipoCuentaService service;

    @GetMapping
    public List<TipoCuenta> listadotipo_cuenta(){

        return service.listadotipo_cuenta() ;
    }

    @PostMapping
    public TipoCuenta registrar (@RequestBody TipoCuenta a){

        return service.registrar(a);
    }

}

