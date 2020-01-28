package com.capacitacion.order.objects.controller;

import java.util.ArrayList;
import java.util.List;

import com.capacitacion.order.objects.models.BrandCardsTypeFilter;
import com.capacitacion.order.objects.models.BrandDetailsCardsType;

public class CardsTypeController {

	public static void main(String[] args) {
		
		
		BrandCardsTypeFilter brandDetailsCardsTypeListEntry = cardsTypeEntryFilter();
		
		System.out.println("Ingrese una marca de tarjeta Visa/Master :");
		
		System.out.println("Ingrese una categoria de tarjeta :");
		
		
	}

	private static BrandCardsTypeFilter cardsTypeEntryFilter() {
		BrandCardsTypeFilter brandCardsTypeFilter = new BrandCardsTypeFilter();
		List<BrandDetailsCardsType> brandDetailsCardsTypeList = new ArrayList<>();
		
		BrandDetailsCardsType brandDetailsCardsType1 = new BrandDetailsCardsType();
		brandDetailsCardsType1.setOrder(1);
		brandDetailsCardsType1.setBrandDetails("Regional");
		
		brandDetailsCardsTypeList.add(brandDetailsCardsType1);
		
		BrandDetailsCardsType brandDetailsCardsType2 = new BrandDetailsCardsType();
		brandDetailsCardsType2.setOrder(2);
		brandDetailsCardsType2.setBrandDetails("Internacional");
		
		brandDetailsCardsTypeList.add(brandDetailsCardsType2);
		
		BrandDetailsCardsType brandDetailsCardsType3 = new BrandDetailsCardsType();
		brandDetailsCardsType3.setOrder(3);
		brandDetailsCardsType3.setBrandDetails("Oro");
		
		brandDetailsCardsTypeList.add(brandDetailsCardsType3);
		
		BrandDetailsCardsType brandDetailsCardsType4 = new BrandDetailsCardsType();
		brandDetailsCardsType4.setOrder(4);
		brandDetailsCardsType4.setBrandDetails("Platinum");
		
		brandDetailsCardsTypeList.add(brandDetailsCardsType4);
		
		brandCardsTypeFilter.setBrand("Visa");
		brandCardsTypeFilter.setCardsTypeBrandDetails(brandDetailsCardsTypeList);
		
		return brandCardsTypeFilter;
	}

}
