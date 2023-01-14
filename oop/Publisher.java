package com.it.berdeja.oop;

public class Publisher {
	public int id;
	public String publisherName;
	
	public Publisher(int id, String publisherName) {
		this.id = id;
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
	
}
