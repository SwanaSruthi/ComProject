package net.apmoller.athena.microservices.CurrencyProject.Utils;

import net.apmoller.athena.microservices.CurrencyProject.dto.CurrencyCodeDto;
import net.apmoller.athena.microservices.CurrencyProject.dto.CurrencyConversionDto;
import net.apmoller.athena.microservices.CurrencyProject.dto.RoundingOffDto;
import net.apmoller.athena.microservices.CurrencyProject.model.CurrencyCode;
import net.apmoller.athena.microservices.CurrencyProject.model.CurrencyConversion;
import net.apmoller.athena.microservices.CurrencyProject.model.RoundingOff;
import org.springframework.beans.BeanUtils;

public class AppUtils
{
    public static CurrencyCodeDto currencyCodeEntityToDto(CurrencyCode currencyCode)
    {
        CurrencyCodeDto currencyCodeDto=new CurrencyCodeDto();
        BeanUtils.copyProperties(currencyCode,currencyCodeDto); // Source,Destination ,Copying product components to productDto
        return currencyCodeDto;
    }
    public static CurrencyCode currencyCodeDtoToEntity(CurrencyCodeDto currencyCodeDto)
    {
        CurrencyCode currencyCode = new CurrencyCode();
        BeanUtils.copyProperties(currencyCodeDto,currencyCode);
        return currencyCode;
    }

    public static CurrencyConversionDto currencyConversionEntityToDto(CurrencyConversion currencyConversion)
    {
        CurrencyConversionDto currencyConversionDto=new CurrencyConversionDto();
        BeanUtils.copyProperties(currencyConversion,currencyConversionDto); // Source,Destination ,Copying product components to productDto
        return currencyConversionDto;
    }
    public static CurrencyConversion currencyConversionDtoToEntity(CurrencyConversionDto currencyConversionDto)
    {
        CurrencyConversion currencyConversion = new CurrencyConversion();
        BeanUtils.copyProperties(currencyConversionDto,currencyConversion);
        return currencyConversion;
    }

    public static RoundingOffDto roundingOffEntityToDto(RoundingOff roundingOff)
    {
        RoundingOffDto roundingOffDto =new RoundingOffDto();
        BeanUtils.copyProperties(roundingOff,roundingOffDto); // Source,Destination ,Copying product components to productDto
        return roundingOffDto;
    }
    public static RoundingOff roundingOffDtoToEntity(RoundingOffDto roundingOffDto)
    {
        RoundingOff roundingOff= new RoundingOff();
        BeanUtils.copyProperties(roundingOffDto,roundingOff);
        return roundingOff;
    }
}
