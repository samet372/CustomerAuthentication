package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisEntegrasyonu.WEMKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        WEMKPSPublicSoap client = new WEMKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
    }
}
