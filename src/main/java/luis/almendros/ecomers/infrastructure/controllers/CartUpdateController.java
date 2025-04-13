package luis.almendros.ecomers.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import luis.almendros.ecomers.application.input.CartUpdateService;
import luis.almendros.ecomers.domain.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart/update")
@RequiredArgsConstructor
public class CartUpdateController {

    @Autowired
    private CartUpdateService cartUpdateService;

    @PatchMapping
    public ResponseEntity<String> update(@RequestBody Cart cart) {
        cartUpdateService.update(cart);
        return ResponseEntity.ok("Cart updated successfully.");
    }
}
