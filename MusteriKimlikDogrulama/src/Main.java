import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {



        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, " ", "", "", LocalDateTime.of(0, 0, 0, 0, 0)));


    }
}