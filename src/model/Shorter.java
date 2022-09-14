package model;

import java.security.SecureRandom;

public class Shorter {
	
	private String link;
	private String shortnedLink;
	
	public Shorter(String link) {
		this.link = link;
		this.shortnedLink = shortLink(link);
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getShortnedLink() {
		return shortnedLink;
	}

	public void setShortnedLink(String shortnedLink) {
		this.shortnedLink = shortnedLink;
	}

	@Override
	public String toString() {
		return "Original link: " + link + "\nShortnedLink: " + shortnedLink;
	}
	
	public String shortLink(String link) {
		String caracters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 6; i++) {
			sb.append(caracters.charAt(rnd.nextInt(caracters.length())));
		}
		return shortnedLink = "shtlink.com/" + sb.toString();		
	}
	
}
