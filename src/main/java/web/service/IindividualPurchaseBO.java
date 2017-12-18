package web.service;

import java.util.List;

import web.domain.IndividualPurchase;


public interface IindividualPurchaseBO {

	List<IndividualPurchase> getAll();

    IndividualPurchase getOne(String id);

    void insert(IndividualPurchase individualPurchase);

    void update(IndividualPurchase individualPurchase);
    
    void delete(String id);

}
