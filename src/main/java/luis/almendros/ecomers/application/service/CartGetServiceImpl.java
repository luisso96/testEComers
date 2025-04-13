package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartGetService;
import luis.almendros.ecomers.domain.models.Cart;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartGetServiceImpl implements CartGetService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart get(String id) {
        return cartRepository.getCarts().get(id);
    }
}
