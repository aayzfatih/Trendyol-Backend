package Trendtol.example.Trendyol.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private int id;
    private String productName;
    private String quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
}
