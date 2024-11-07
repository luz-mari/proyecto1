package com.caso.banco.controller;

import com.caso.banco.controller.dto.Cliente;
import com.caso.banco.controller.dto.Cuenta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cuentas")

public class CuentaController {
    @GetMapping
    public List<Cuenta> listadoCuenta(){
        Cuenta cuenta = new Cuenta();
        cuenta.setTipo_cuenta(1);
        cuenta.setNumero_cuenta(123456);
        cuenta.setId_cliente(1);
        cuenta.setSaldo(12);
        List<Cuenta> registro = new ArrayList<>();
        registro.add(cuenta);
        return registro;

    }

}
