package local.poc.blockchain.customers.management.registration.persistence.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import local.poc.blockchain.customers.management.registration.persistence.model.Country.Ref;

public class CountryRepositoryImpl
implements CountryRepositoryCustom {
	
	@Override
	public List<Long> refValues() {
		return Stream.of(Ref.values()).map(x -> x.getValue()).collect(Collectors.toList());
	}

}