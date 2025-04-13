package luis.almendros.ecomers.application.service;

import luis.almendros.ecomers.application.input.CartDeleteService;
import luis.almendros.ecomers.domain.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDeleteServiceImpl implements CartDeleteService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public void delete(String id) {
        cartRepository.getCarts().remove(id);
    }
}
