package luis.almendros.ecomers.domain.repository;

import luis.almendros.ecomers.domain.models.Cart;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CartRepository {

    private final Map<String, Cart> carts = new ConcurrentHashMap<>();

    public Map<String, Cart> getCarts() {
        cleanCarts();
        return carts;
    }

    private void cleanCarts() {
        for (Map.Entry<String, Cart> entry : carts.entrySet()) {
            if (Duration.between(entry.getValue().getLastUpdated(), Instant.now()).toMinutes() >= 10) {
                carts.remove(entry.getKey());
            }
        }
    }

}
