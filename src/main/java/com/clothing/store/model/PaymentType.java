package com.clothing.store.model;

import java.util.HashMap;
import java.util.Map;

public enum PaymentType {
	CASH,CARD;

	public static Map<String, PaymentType> cashPayment(Product product, Customer customer, String paymentType) {
		Map<String, PaymentType> map = new HashMap<>();
		map.put("cash", CASH);
		map.put("card", CARD);
		return map;

	}
}
