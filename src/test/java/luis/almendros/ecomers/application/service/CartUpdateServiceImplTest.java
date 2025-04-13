package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartUpdateService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.models.Product;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CartUpdateServiceImplTest {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartUpdateService service;

    private final Cart cart = new Cart();
    private final List<Product> products = new ArrayList<>();

    @BeforeEach
    void setUp() {
        cartRepository.getCarts().put(cart.getId(), cart);
        products.add(new Product(1, "Hat", 2));
    }

    @Test
    void update() {
        assertEquals(cart, cartRepository.getCarts().get(cart.getId()));
        cart.setProducts(products);
        service.update(cart);
        assertEquals(cart, cartRepository.getCarts().get(cart.getId()));
    }
}