package com.caso.banco.controller;

import com.caso.banco.controller.dto.Cliente;
import com.caso.banco.controller.dto.Cuenta;
import com.caso.banco.service.CuentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cuentas")
@RequiredArgsConstructor

public class CuentaController {

    private final CuentaService service;

    @GetMapping
    public List<Cuenta> listadoCuenta(){
        return service.listadoCuenta();
    }

    @PostMapping
    public Cuenta registrar (@RequestBody Cuenta a){

        return service.registrar(a);
    }
    @PutMapping
    public Cuenta actualizar (@RequestBody Cuenta b){
        return service.registrar(b);

    }

}
