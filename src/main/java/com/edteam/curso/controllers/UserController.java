package com.edteam.curso.controllers;

import com.edteam.curso.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    // traer todos los usuarios
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setNombre(" Luis");
        user.setApellido("Ramos");
        list.add(user);
        return list;
    }
    // traer todos los usuarios por id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id){ // el path variable es una notación, id de tipo long
        User user = new User();
        user.setNombre(" Luis");
        user.setApellido("Ramos");
        return user;
    }
    // registrar un usuario
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){ // recibe el cuerpo del formulario que recibe el objeto user
        // TODO: registrarlo en base de datos
        return user;
    }
    // actualizar un usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user){ // el id va dentro del objeto usuario, asique no es necesario pasarlo por separado.
        // TODO: actualizarlo en base de datos
        return user;
    }
    // eliminar un usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        // TODO: Eliminarlo de la base de datos
    }

}
