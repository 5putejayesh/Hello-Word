package src;

import src.dao.OrderDao;
import src.model.Product;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8App {

    private static OrderDao orderDao=new OrderDao();
    public static void main(String[] args) {

        List<Product> products = orderDao.getOrders().stream()
                .filter(o -> o.getCustomer().getTier() == 1)
                .flatMap(o -> o.getProducts().stream()
                        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                ).collect(Collectors.toList());
    }
}
