package authentication.authentication.modules.product;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.authentication.modules.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
