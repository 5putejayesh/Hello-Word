package src.dao;

import src.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDao {

    private CustomerDAO customerDAO=new CustomerDAO();
    private ProductDao productDao=new ProductDao();

    public List<Order> getOrders(){
        List<Order> orderList=new ArrayList<>();
        orderList.add(new Order(1,"Deliverd",
                LocalDate.of(2022,02,01),
                LocalDate.of(2022,02,05),
                productDao.getAllProducts().stream().filter(p->p.getCategory().equalsIgnoreCase("Books"))
                        .collect(Collectors.toList()),
                customerDAO.getAllCustomers().get(0)));
        return orderList;
    }
}
