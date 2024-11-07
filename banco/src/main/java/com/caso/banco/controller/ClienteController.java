package com.caso.banco.controller;

import com.caso.banco.controller.dto.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
 @GetMapping
    public List<Cliente> listadeCliente(){
     Cliente cliente = new Cliente();
     cliente.setId_cliente(1);
     cliente.setDni("123456");
     cliente.setApellido("Martinez");
     cliente.setEmail("martin@hotmail.com");
     cliente.setNombre("Maria");
     List<Cliente> listado = new ArrayList<>();
     listado.add(cliente);
     return listado;
 }
}
