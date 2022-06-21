package com.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @GetMapping
    public Usuario getUsuario() {
        return Usuario.builder()
                .nome("Rafael")
                .email("rpaesdacosta@gmail.com")
                .idade(28)
                .build();
    }
}
