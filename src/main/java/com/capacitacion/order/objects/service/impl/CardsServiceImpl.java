package com.capacitacion.order.objects.service.impl;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import com.capacitacion.order.objects.models.BrandCardsTypeFilter;
import com.capacitacion.order.objects.models.BrandDetailsCardsType;
import com.capacitacion.order.objects.models.CardsTypeEntryProtocol;
import com.capacitacion.order.objects.service.CardsService;

public class CardsServiceImpl implements CardsService {

	@Override
	public BrandCardsTypeFilter getCardsType(CardsTypeEntryProtocol entryProtocol,
			BrandCardsTypeFilter brandCardsTypeVisaFilter, BrandCardsTypeFilter brandCardsTypeMasterFilter) {

		BrandCardsTypeFilter brandCardsTypeFilterResponse = new BrandCardsTypeFilter();

		brandCardsTypeFilterResponse = fetchBrandCardTypeFilter(entryProtocol, brandCardsTypeVisaFilter, brandCardsTypeMasterFilter);

		return brandCardsTypeFilterResponse;
	}

	private BrandCardsTypeFilter fetchBrandCardTypeFilter(CardsTypeEntryProtocol entryProtocol,
			BrandCardsTypeFilter brandCardsTypeVisaFilter, BrandCardsTypeFilter brandCardsTypeMasterFilter) {

		String cardBrand = entryProtocol.getCardBrand();

		BrandCardsTypeFilter brandCardsTypeFilterAux = new BrandCardsTypeFilter();

		if (cardBrand.equalsIgnoreCase(brandCardsTypeVisaFilter.getBrand())) {

			brandCardsTypeFilterAux = fetchCardTypeFilter(entryProtocol.getCardDetails(), brandCardsTypeVisaFilter);
			brandCardsTypeFilterAux.setBrand(brandCardsTypeVisaFilter.getBrand());

		} else {

			if (cardBrand.equalsIgnoreCase(brandCardsTypeMasterFilter.getBrand())) {

				brandCardsTypeFilterAux = fetchCardTypeFilter(entryProtocol.getCardDetails(),
						brandCardsTypeMasterFilter);
				brandCardsTypeFilterAux.setBrand(brandCardsTypeMasterFilter.getBrand());
			} else {
				throw new InvalidParameterException("No existe el tipo de tarjeta que introdujo. \nPor favor comuniquese al : 111111");
			}
		}

		return brandCardsTypeFilterAux;

	}

	private BrandCardsTypeFilter fetchCardTypeFilter(String cardDetails, BrandCardsTypeFilter brandCardsTypeFilter) {

		List<BrandDetailsCardsType> arrayCardsType = brandCardsTypeFilter.getCardsTypeBrandDetails();
		List<BrandDetailsCardsType> arrayCardsTypeResponse = new ArrayList<>();
		Integer order = null;

		for (BrandDetailsCardsType iterableAux : arrayCardsType) {

			if (iterableAux.getBrandDetails().equalsIgnoreCase(cardDetails)) {
				order = iterableAux.getOrder();
			}
		}

		if (order == null) {
			throw new InvalidParameterException("No existe la categoria de tarjeta que introdujo. \nPor favor comuniquese al : 111111");
		}

		for (BrandDetailsCardsType iterableAux : arrayCardsType) {

			if (order <= iterableAux.getOrder()) {
				arrayCardsTypeResponse.add(iterableAux);
			}
		}

		BrandCardsTypeFilter brandCardTypeFilterResponse = new BrandCardsTypeFilter();
		brandCardTypeFilterResponse.setCardsTypeBrandDetails(arrayCardsTypeResponse);
		return brandCardTypeFilterResponse;
	}

}
