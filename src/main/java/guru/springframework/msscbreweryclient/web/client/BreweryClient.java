package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;

import java.net.URI;
import java.util.UUID;

public interface BreweryClient {
    BeerDto getBeerById(UUID uuid);

    URI saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID uuid, BeerDto beerDto);

    void deleteBeer(UUID uuid);

    CustomerDto getCustomerById(UUID uuid);

    URI saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID uuid, CustomerDto customerDto);

    void deleteCustomer(UUID uuid);
}
