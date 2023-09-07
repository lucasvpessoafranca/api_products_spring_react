package br.com.api.products.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.products.model.ProductModel;
import br.com.api.products.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public Iterable<ProductModel> listar() {
        return pr.findAll();
    }

}
