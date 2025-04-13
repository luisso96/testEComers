package luis.almendros.ecomers.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import luis.almendros.ecomers.application.input.CartDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/delete")
@RequiredArgsConstructor
public class CartDeleteController {

    @Autowired
    private CartDeleteService cartDeleteService;

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody String id) {
        cartDeleteService.delete(id);
        return ResponseEntity.ok("Element deleted successfully.");
    }
}
