package br.com.api.products.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String rota() {

        return "API FUNCIONANDO";
    }
}
