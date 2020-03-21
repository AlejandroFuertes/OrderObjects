package com.capacitacion.order.objects.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capacitacion.order.objects.models.BrandCardsTypeFilter;
import com.capacitacion.order.objects.models.BrandDetailsCardsType;
import com.capacitacion.order.objects.models.CardsTypeEntryProtocol;
import com.capacitacion.order.objects.service.CardsService;
import com.capacitacion.order.objects.service.impl.CardsServiceImpl;

public class CardsTypeController {


	public static void main(String[] args) {
		
		CardsService cardsService = new CardsServiceImpl();

		BrandCardsTypeFilter brandDetailsCardsTypeListVisaEntry = cardsTypeEntryVisaFilter();
		BrandCardsTypeFilter brandDetailsCardsTypeListMasterEntry = cardsTypeEntryMasterFilter();

		System.out.println("Ingrese una marca de tarjeta Visa/Master :");
		String entradaTarjeta = null;
		Scanner entradaScanner = new Scanner(System.in);
		entradaTarjeta = entradaScanner.nextLine();
		
		System.out.println("Ingrese una categoria de tarjeta :");
		String entradaCategoria = null;
		Scanner inScanner = new Scanner(System.in);
		entradaCategoria = inScanner.nextLine();

		CardsTypeEntryProtocol entryProtocol = new CardsTypeEntryProtocol();
		entryProtocol.setCardBrand(entradaTarjeta);
		entryProtocol.setCardDetails(entradaCategoria);
		
		entradaScanner.close();
		inScanner.close();

		BrandCardsTypeFilter response = cardsService.getCardsType(entryProtocol, brandDetailsCardsTypeListVisaEntry,
				brandDetailsCardsTypeListMasterEntry);

	}

	private static BrandCardsTypeFilter cardsTypeEntryVisaFilter() {
		BrandCardsTypeFilter brandCardsTypeFilterVisa = new BrandCardsTypeFilter();
		List<BrandDetailsCardsType> brandDetailsCardsTypeListVisa = new ArrayList<>();

		BrandDetailsCardsType brandDetailsCardsTypeVisa1 = new BrandDetailsCardsType();
		brandDetailsCardsTypeVisa1.setOrder(1);
		brandDetailsCardsTypeVisa1.setBrandDetails("Regional");

		brandDetailsCardsTypeListVisa.add(brandDetailsCardsTypeVisa1);

		BrandDetailsCardsType brandDetailsCardsTypeVisa2 = new BrandDetailsCardsType();
		brandDetailsCardsTypeVisa2.setOrder(2);
		brandDetailsCardsTypeVisa2.setBrandDetails("Internacional");

		brandDetailsCardsTypeListVisa.add(brandDetailsCardsTypeVisa2);

		BrandDetailsCardsType brandDetailsCardsTypeVisa3 = new BrandDetailsCardsType();
		brandDetailsCardsTypeVisa3.setOrder(3);
		brandDetailsCardsTypeVisa3.setBrandDetails("Oro");

		brandDetailsCardsTypeListVisa.add(brandDetailsCardsTypeVisa3);

		BrandDetailsCardsType brandDetailsCardsTypeVisa4 = new BrandDetailsCardsType();
		brandDetailsCardsTypeVisa4.setOrder(4);
		brandDetailsCardsTypeVisa4.setBrandDetails("Platinum");

		brandDetailsCardsTypeListVisa.add(brandDetailsCardsTypeVisa4);

		brandCardsTypeFilterVisa.setBrand("Visa");
		brandCardsTypeFilterVisa.setCardsTypeBrandDetails(brandDetailsCardsTypeListVisa);

		return brandCardsTypeFilterVisa;
	}

	private static BrandCardsTypeFilter cardsTypeEntryMasterFilter() {
		BrandCardsTypeFilter brandCardsTypeFilterMaster = new BrandCardsTypeFilter();
		List<BrandDetailsCardsType> brandDetailsCardsTypeListMaster = new ArrayList<>();

		BrandDetailsCardsType brandDetailsCardsTypeMaster1 = new BrandDetailsCardsType();
		brandDetailsCardsTypeMaster1.setOrder(1);
		brandDetailsCardsTypeMaster1.setBrandDetails("Regional");

		brandDetailsCardsTypeListMaster.add(brandDetailsCardsTypeMaster1);

		BrandDetailsCardsType brandDetailsCardsTypeMaster2 = new BrandDetailsCardsType();
		brandDetailsCardsTypeMaster2.setOrder(2);
		brandDetailsCardsTypeMaster2.setBrandDetails("Internacional");

		brandDetailsCardsTypeListMaster.add(brandDetailsCardsTypeMaster2);

		BrandDetailsCardsType brandDetailsCardsTypeMaster3 = new BrandDetailsCardsType();
		brandDetailsCardsTypeMaster3.setOrder(3);
		brandDetailsCardsTypeMaster3.setBrandDetails("Oro");

		brandDetailsCardsTypeListMaster.add(brandDetailsCardsTypeMaster3);

		BrandDetailsCardsType brandDetailsCardsTypeMaster4 = new BrandDetailsCardsType();
		brandDetailsCardsTypeMaster4.setOrder(4);
		brandDetailsCardsTypeMaster4.setBrandDetails("Black");

		brandDetailsCardsTypeListMaster.add(brandDetailsCardsTypeMaster4);

		brandCardsTypeFilterMaster.setBrand("Master");
		brandCardsTypeFilterMaster.setCardsTypeBrandDetails(brandDetailsCardsTypeListMaster);

		return brandCardsTypeFilterMaster;
	}

}
