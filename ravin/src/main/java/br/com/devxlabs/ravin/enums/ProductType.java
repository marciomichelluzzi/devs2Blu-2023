package br.com.devxlabs.ravin.enums;

public enum ProductType {
	
	SNACK("SNACK"),
	DRINK("DRINK"),
	DESSERT("DESSERT");
	
	private String description = "";

	ProductType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
