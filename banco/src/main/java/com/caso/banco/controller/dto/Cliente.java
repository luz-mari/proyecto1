package com.caso.banco.controller.dto;

import lombok.Data;

@Data
public class Cliente {
    private Integer id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
}
