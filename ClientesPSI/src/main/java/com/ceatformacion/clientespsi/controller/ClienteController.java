package com.ceatformacion.clientespsi.controller;

import com.ceatformacion.clientespsi.model.Clientes;
import com.ceatformacion.clientespsi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    //@Autowired se encarga de crear y conectar los objetos necesario
    @Autowired
    private ClienteRepository clienteRepository;


    //LLamar la página princiapl del formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        //Le enviamos un objeto tipo Cliente para que lo reciba ek formulafio, y a partir de alli asi
        model.addAttribute("cliente", new Clientes());
        return "formulario";
    }

    //Quien recibe los datos del formulario -> la siguiente funcion debe ser siempre PostMapping
    @PostMapping("/crud")
    public String leerCliente( @ModelAttribute Clientes clientesForm, Model model){
        clienteRepository.save(clientesForm); //Lo guarda en la BBDD
        return "redirect:/crud";
    }

    @GetMapping("/crud")
    public String mostrarClientes(Model model){
        model.addAttribute("clientesCrud", clienteRepository.findAll());
        return "crud";
    }


    @GetMapping("/editar/{id}")
    public String actualizarCliente(@PathVariable int id, Model model){
        //Debemos enviar los datos del cliente que hemos consultado mediante el {id},
        //Hibernate lo busca y lo almacena en un objeto (Clientes).
        //Se busca en la BBDD y despues se almacenan los datos en un objeto tipo Cliente.
        Clientes cliente = clienteRepository.findById(id).get(); //Busca x el id invitado por la url..
        model.addAttribute("cliente", cliente);
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable int id, Model model){
        clienteRepository.deleteById(id);
        return "redirect:/crud";
    }



}
