package com.caso.banco.controller;

import com.caso.banco.controller.dto.Cliente;
import com.caso.banco.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

 @GetMapping
 public List<Cliente> listadeCliente(){

     return service.listadeCliente();
 }

 @PostMapping
    public Cliente registrar(@RequestBody Cliente a){

     return service.registrar(a);
 }

}
