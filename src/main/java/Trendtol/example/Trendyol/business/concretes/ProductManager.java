package Trendtol.example.Trendyol.business.concretes;

import Trendtol.example.Trendyol.business.abstracts.ProductService;
import Trendtol.example.Trendyol.business.requests.CreateProductRequest;
import Trendtol.example.Trendyol.business.requests.UpdateProductRequest;
import Trendtol.example.Trendyol.business.responses.GetAllProductsResponses;
import Trendtol.example.Trendyol.core.utilities.mappers.ModelMapperService;
import Trendtol.example.Trendyol.dataAccess.abstracts.ProductRepository;
import Trendtol.example.Trendyol.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductRepository productRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllProductsResponses> getAll() {
      List<Product>products=this.productRepository.findAll();
      List<GetAllProductsResponses>getAllProductsResponses=products.stream().map(product -> this.modelMapperService.forResponse().map(product, GetAllProductsResponses.class)).collect(Collectors.toList());
      return  getAllProductsResponses;
    }

    @Override
    public void add(CreateProductRequest createProductRequest) {
        Product product=this.modelMapperService.forRequest().map(createProductRequest,Product.class);
        this.productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public void update(UpdateProductRequest updateProductRequest) {
        Product product=this.modelMapperService.forRequest().map(updateProductRequest,Product.class);
        this.productRepository.save(product);
    }
}
