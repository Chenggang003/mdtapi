package web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.domain.IndividualPurchase;
import web.mapper.IndividualPurchaseMapper;

@Service
public class IndividualPurchaseBO implements IindividualPurchaseBO {
	@Autowired
	private IndividualPurchaseMapper individualPurchaseMapper;

	@Override
	public List<IndividualPurchase> getAll() {
		// TODO Auto-generated method stub
		return individualPurchaseMapper.getAll();
	}

	@Override
	public IndividualPurchase getOne(String id) {
		// TODO Auto-generated method stub
		return individualPurchaseMapper.getOne(id);
	}

	@Override
	public void insert(IndividualPurchase individualPurchase) {
		// TODO Auto-generated method stub
		individualPurchaseMapper.insert(individualPurchase);
	}

	@Override
	public void update(IndividualPurchase individualPurchase) {
		// TODO Auto-generated method stub
		individualPurchaseMapper.update(individualPurchase);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		individualPurchaseMapper.delete(id);
	}

}
