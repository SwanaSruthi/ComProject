package net.apmoller.athena.microservices.CurrencyProject.reository;

import net.apmoller.athena.microservices.CurrencyProject.model.CurrencyConversion;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CurrencyRepository extends ReactiveMongoRepository<CurrencyConversion,String>
{
}
