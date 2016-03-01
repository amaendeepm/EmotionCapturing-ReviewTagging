package com.trustpilot.reviews;

import java.io.IOException;
import java.util.Map;

public class TagsPusher {

	public String readCSV(String filePath) throws IOException {
		return null;
	}
	
	public Map<String,String> parseCSV(String text) {
		return null;
	}
	
	public Map<String,String> pushReviewTag(Map<String,String> map){
		return null;
	}
	
	private boolean applyTag(String reviewID, String tag) {
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Tags Parse & Push");
		
		TagsPusher tagsPush = new TagsPusher();
		if(args.length <1) {
			System.out.println("Please provide CSV file path");
			System.exit(1);
		}
		try {
			tagsPush.readCSV(args[0]);
			Map m =  tagsPush.parseCSV(tagsPush.readCSV(args[0]));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
