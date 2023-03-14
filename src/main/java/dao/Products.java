package dao;

import java.util.List;
import models.Product;

public interface Products {
    List<Product> all();
    void insert(Product product);
}
