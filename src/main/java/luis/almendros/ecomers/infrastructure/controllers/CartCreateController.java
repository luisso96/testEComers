package luis.almendros.ecomers.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import luis.almendros.ecomers.application.input.CartCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/create")
@RequiredArgsConstructor
public class CartCreateController {

    @Autowired
    private CartCreateService cartCreateService;

    @PostMapping
    public ResponseEntity<String> create() {
        String id = cartCreateService.create();
        return ResponseEntity.ok(id);
    }
}
