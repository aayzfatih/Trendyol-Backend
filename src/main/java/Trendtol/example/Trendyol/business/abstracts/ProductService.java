package Trendtol.example.Trendyol.business.abstracts;

import Trendtol.example.Trendyol.business.requests.CreateProductRequest;
import Trendtol.example.Trendyol.business.requests.UpdateProductRequest;
import Trendtol.example.Trendyol.business.responses.GetAllProductsResponses;

import java.util.List;

public interface ProductService {
    List<GetAllProductsResponses>getAll();
    void add(CreateProductRequest createProductRequest);
    void delete(int id);
    void update(UpdateProductRequest updateProductRequest);

}
