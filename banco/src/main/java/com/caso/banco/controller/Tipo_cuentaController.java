package com.caso.banco.controller;

import com.caso.banco.controller.dto.Cuenta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/tipo_cuentas")
public class Tipo_cuentaController {
    @GetMapping
    public List<Tipo_cuenta> listadotipo_cuenta(){
        Tipo_cuenta tipo = new Tipo_cuenta();
        tipo.setId(1);
        tipo.setDescripcion("ahorro");
        List<Tipo_cuenta> relacion = new ArrayList<>();
        relacion.add(tipo);
        return relacion;
    }

}

