package authentication.authentication.modules.product.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

  @Id
  @GeneratedValue
  private UUID id;
  private String name;

  private String description;

  private String sku;

}
