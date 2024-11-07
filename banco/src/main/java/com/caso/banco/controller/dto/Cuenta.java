package com.caso.banco.controller.dto;

import lombok.Data;

@Data
public class Cuenta {
    private Integer numero_cuenta;
    private Integer id_cliente;
    private Integer tipo_cuenta;
    private double saldo;

}
