package luis.almendros.ecomers.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Amount")
    private Integer amount ;

}
