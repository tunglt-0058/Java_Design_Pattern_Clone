/*
 * Copyright (c) 2014 Ilkka Sepp�l�
 * link github clone : https://github.com/iluwatar/java-design-patterns
 * Le Tat Tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractdocument.domain;

import java.util.Map;

import com.letattung.abstractdocument.AbstractDocument;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

	public Part(Map<String, Object> properties){
		super(properties);
	}
}
