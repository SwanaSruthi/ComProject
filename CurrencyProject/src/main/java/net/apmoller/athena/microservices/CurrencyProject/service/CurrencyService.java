package net.apmoller.athena.microservices.CurrencyProject.service;

import net.apmoller.athena.microservices.CurrencyProject.Utils.AppUtils;
import net.apmoller.athena.microservices.CurrencyProject.dto.CurrencyConversionDto;
import net.apmoller.athena.microservices.CurrencyProject.model.CurrencyCode;
import net.apmoller.athena.microservices.CurrencyProject.model.CurrencyConversion;
import net.apmoller.athena.microservices.CurrencyProject.reository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CurrencyService
{
    @Autowired
    private CurrencyRepository currencyRepository;
    private CurrencyConversion currencyConversion;
    public Flux<CurrencyConversionDto> getProducts()
    {
        return currencyRepository.findAll()
                .map(AppUtils::currencyConversionEntityToDto);
    }

    public Mono<CurrencyConversionDto> getProduct(String id)
    {
        final Mono<CurrencyConversionDto> user;
        user = currencyRepository.findById(id).map(AppUtils::currencyConversionEntityToDto);
        return user;
    }

    public Mono<CurrencyConversionDto> saveProduct(Mono<CurrencyConversionDto> productDtoMono)
    {
        Mono<CurrencyConversionDto> map = productDtoMono.map(AppUtils::currencyConversionDtoToEntity)
                .flatMap(currencyRepository::insert)
                .map(AppUtils::currencyConversionEntityToDto);
        return map;
    }

    public Mono<CurrencyConversionDto> updateProduct(Mono<CurrencyConversionDto> currencyConversionDtoMono,String id){
        return currencyRepository.findById(id)
                .flatMap(p->currencyConversionDtoMono.map(AppUtils::currencyConversionDtoToEntity).doOnNext(e->e.setId(id)))
                .flatMap(currencyRepository::save)
                .map(AppUtils::currencyConversionEntityToDto);
    }
    public Mono<Void> deleteProduct(String id)
    {
        return currencyRepository.deleteById(id);
    }
}
