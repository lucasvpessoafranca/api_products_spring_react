package br.com.api.products.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.products.model.ProductModel;
import br.com.api.products.model.ResponseModel;
import br.com.api.products.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    @Autowired
    ResponseModel rm;

    public Iterable<ProductModel> listAll() {
        return pr.findAll();
    }

    public ResponseEntity<?> register(ProductModel pm) {
        if (pm.getName().equals("")) {
            rm.setMessage("O nome do produto é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);

        } else if (pm.getBrand().equals("")) {
            rm.setMessage("O nome da marca é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        } else {

            return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.CREATED);

        }
    }

}
