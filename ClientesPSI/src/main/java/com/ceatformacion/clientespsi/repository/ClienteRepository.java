package com.ceatformacion.clientespsi.repository;

import com.ceatformacion.clientespsi.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Esta interfaz conecta nuestra aplicaión con la base de datos para evitar esccribir manualmente sentencias SQL
* Para indicar a qué clase hace referencia este repositorio se lo tendremos que indicar en <nombreClase> tipoWrapper
* de la clave principal.
* */
@Repository
public interface ClienteRepository extends JpaRepository <Clientes, Integer > {
}
