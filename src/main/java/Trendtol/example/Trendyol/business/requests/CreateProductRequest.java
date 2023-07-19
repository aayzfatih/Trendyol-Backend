package Trendtol.example.Trendyol.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
    @NotNull
    @NotEmpty
    @NotBlank
    private String productName;
    @NotNull
    @NotEmpty
    @NotBlank
    private String quantityPerUnit;
    @NotNull
    @NotEmpty
    @NotBlank
    private double unitPrice;
    @NotNull
    @NotEmpty
    @NotBlank
    private int unitsInStock;

}
