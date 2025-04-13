package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartCreateService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CartCreateServiceImplTest {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartCreateService service;

    @Test
    void create() {
        String id = service.create();
        Cart cart = cartRepository.getCarts().get(id);
        assertNotNull(cart);
    }
}