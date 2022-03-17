package authentication.authentication.modules.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import authentication.authentication.modules.product.entities.Product;
import authentication.authentication.modules.product.services.ListProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ListProductService listProductService;

  @GetMapping
  public List<Product> list() {
    return listProductService.listAll();
  }

}
