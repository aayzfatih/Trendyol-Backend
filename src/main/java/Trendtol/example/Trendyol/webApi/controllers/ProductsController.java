package Trendtol.example.Trendyol.webApi.controllers;

import Trendtol.example.Trendyol.business.abstracts.ProductService;
import Trendtol.example.Trendyol.business.requests.CreateProductRequest;
import Trendtol.example.Trendyol.business.requests.UpdateProductRequest;
import Trendtol.example.Trendyol.business.responses.GetAllProductsResponses;
import jakarta.persistence.Access;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@AllArgsConstructor
@CrossOrigin
class ProductsController {
    private ProductService productService;
    @GetMapping
    public List<GetAllProductsResponses>getAllProductsResponses(){
        return this.productService.getAll();
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody()  @Valid()CreateProductRequest createProductRequest){
        this.productService.add(createProductRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.productService.delete(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody UpdateProductRequest updateProductRequest){
        this.productService.update(updateProductRequest);
    }
}
