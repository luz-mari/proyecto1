package com.caso.banco.service.impl;

import com.caso.banco.controller.dto.Cliente;
import com.caso.banco.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClientesServiceImpl implements ClienteService {

    @Override
    public List<Cliente> listadeCliente() {
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

    @Override
    public Cliente registrar(Cliente a) {
        a.setId_cliente(1);
        System.out.println(a.getNombre());
        System.out.println(a.getApellido());
        System.out.println(a.getDni());
        System.out.println(a.getEmail());
        System.out.println(a.getId_cliente());
        return a;
    }

    @Override
    public Cliente actualizar(Cliente b) {
        return null;
    }
}
