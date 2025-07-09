package com.ceatformacion.empleados.controller;


import com.ceatformacion.empleados.modell.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class EmpleadoControler {
    private static final ArrayList<Empleado> empleados = new ArrayList<>();
    @GetMapping("/") //Llama al archivo que esta función nombra, con lo indicado em el paréntesis que le sigue
    public String llamarIndex(Model model){
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("puestos", Empleado.Puesto.values());
        return "index"; //llama al archivo de la visto con nombre index, y muestralo....
    }


    @GetMapping("/empleados/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado, Model model){
        //Agregar ese empleado a una colección
        empleados.add(empleado);
        model.addAttribute("empleado", empleado);
        return ("crud");
    }





}
