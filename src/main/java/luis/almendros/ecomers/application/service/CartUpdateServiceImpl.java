package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartUpdateService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CartUpdateServiceImpl implements CartUpdateService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart update(Cart cart) {

        Map<String, Cart> carts = cartRepository.getCarts();
        Cart oldCart = carts.get(cart.getId());
        oldCart.setProducts(cart.getProducts());
        carts.putIfAbsent(cart.getId(), oldCart);
        return oldCart;
    }
}
