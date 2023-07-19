package Trendtol.example.Trendyol.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponses {
    private int id;
    private String productName;
    private String quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
}
