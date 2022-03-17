package authentication.authentication.modules.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.authentication.modules.product.ProductRepository;
import authentication.authentication.modules.product.entities.Product;

@Service
public class ListProductService {

  @Autowired
  ProductRepository productRepository;

  public List<Product> listAll() {
    return productRepository.findAll();
  }
}
