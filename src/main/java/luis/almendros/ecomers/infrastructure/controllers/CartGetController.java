package luis.almendros.ecomers.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import luis.almendros.ecomers.application.input.CartGetService;
import luis.almendros.ecomers.domain.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/get")
@RequiredArgsConstructor
public class CartGetController {

    @Autowired
    private CartGetService cartGetService;

    @GetMapping
    public ResponseEntity<Cart> get(@RequestBody String id) {
        Cart cart = cartGetService.get(id);
        if (cart == null) {
            return  ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(cart);
        }
    }
}
