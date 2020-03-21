package com.capacitacion.order.objects.service;

import com.capacitacion.order.objects.models.BrandCardsTypeFilter;
import com.capacitacion.order.objects.models.CardsTypeEntryProtocol;

public interface CardsService {

	public BrandCardsTypeFilter getCardsType(CardsTypeEntryProtocol entryProtocol,
			BrandCardsTypeFilter brandCardsTypeVisaFilter, BrandCardsTypeFilter brandCardsTypeMasterFilter);

}
