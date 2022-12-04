package com.gl.learning25nov;

public class codeChallenge14 {
	private String country="India";
	private String nationalAnthem="Jan Gan Man";
	private String touristSpot="Tajmahal";
	
	public void getCountry() {
		System.out.println("Country : "+country); 
	}
	public void getNationalAnthem() {
		System.out.println("National Anthem : "+nationalAnthem); 
	}
	public void getTouristSpot() {
		System.out.println("Tourist Spot : "+touristSpot); 
	}
	
	public void setCountry(String country) {
		this.country=country; 
	}
	public void setNationalAnthem(String nationalAnthem) {
		 this.nationalAnthem=nationalAnthem;
	}
	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}
	public static void main(String[] args) {
		codeChallenge14 obj = new codeChallenge14();
		obj.getCountry();
		obj.getNationalAnthem();
		obj.getTouristSpot();
		
		obj.setCountry("germany");
		obj.setNationalAnthem("oolaa");
		obj.setTouristSpot("no idea");
		
		obj.getCountry();
		obj.getNationalAnthem();
		obj.getTouristSpot();
		
		
	}

}
