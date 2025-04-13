package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartDeleteService;
import luis.almendros.ecomers.application.input.CartGetService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartDeleteServiceImplTest {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartDeleteService service;

    private final Cart cart = new Cart();

    @BeforeEach
    void setUp() {
        cartRepository.getCarts().put(cart.getId(), cart);
    }

    @Test
    void delete() {
        Cart cartExist = cartRepository.getCarts().get(cart.getId());
        assertEquals(cart, cartExist);
        service.delete(cart.getId());
        cartExist = cartRepository.getCarts().get(cart.getId());
        assertNull(cartExist);
    }
}