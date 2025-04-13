package luis.almendros.ecomers.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Cart {

    @JsonProperty("Id")
    private String id = UUID.randomUUID().toString();;
    @JsonProperty("Products")
    private List<Product> products;
    @JsonProperty("LastUpdate")
    @Setter
    private Instant lastUpdated;

    public Cart() {
        this.products = new ArrayList<>();
        update();
    }

    public Cart(List<Product> products) {
        this.products = products;
        update();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        update();
    }


    private void update() {
        this.lastUpdated = Instant.now();
    }

}
