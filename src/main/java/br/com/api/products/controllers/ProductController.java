package br.com.api.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.products.model.ProductModel;
import br.com.api.products.services.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/listAll")
    public Iterable<ProductModel> listAll() {
        return ps.listAll();
    }

    @PostMapping("/register")

    public ResponseEntity<?> register(@RequestBody ProductModel pm) {
        return ps.register(pm);

    }
}
