package com.hawkersco.shopifycommons.entities;

import java.util.ArrayList;

public class Order{
	private Long id;
	private String email;
	private String created_at;
	private ArrayList<Product> line_items;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public ArrayList<Product> getLine_items() {
		return line_items;
	}
	public void setLine_items(ArrayList<Product> line_items) {
		this.line_items = line_items;
	}
	
}
