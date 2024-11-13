package com.caso.banco.service;

import com.caso.banco.controller.dto.Cliente;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClienteService {
    List<Cliente> listadeCliente();
    Cliente registrar(@RequestBody Cliente a);
}
