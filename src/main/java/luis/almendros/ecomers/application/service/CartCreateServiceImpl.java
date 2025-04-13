package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartCreateService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartCreateServiceImpl implements CartCreateService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public String create() {

        Cart cart = new Cart();
        cartRepository.getCarts().putIfAbsent(cart.getId(), cart);
        return cart.getId();

    }
}
