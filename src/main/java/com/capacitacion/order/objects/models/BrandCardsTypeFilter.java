package com.capacitacion.order.objects.models;

import java.util.List;

public class BrandCardsTypeFilter {

	private String brand;
	private List<BrandDetailsCardsType> cardsTypeBrandDetails;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<BrandDetailsCardsType> getCardsTypeBrandDetails() {
		return cardsTypeBrandDetails;
	}
	public void setCardsTypeBrandDetails(List<BrandDetailsCardsType> cardsTypeBrandDetails) {
		this.cardsTypeBrandDetails = cardsTypeBrandDetails;
	}
	
	
}
