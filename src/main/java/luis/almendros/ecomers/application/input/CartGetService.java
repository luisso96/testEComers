package luis.almendros.ecomers.application.input;

import luis.almendros.ecomers.domain.models.Cart;

public interface CartGetService {

    Cart get(String id);
}
