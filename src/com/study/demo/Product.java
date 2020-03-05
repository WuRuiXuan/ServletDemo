package com.study.demo;

/**
 * 商品类（实体）
 */

public class Product {
	private int pid;
	private String name;
	private float price;
	private int nums;
	private String description;
	
	public Product() {
	}
	
	public Product(int pid, String name, float price, int nums, String description) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.nums = nums;
		this.description = description;
	}

	public Product(String name, float price, int nums, String description) {
		super();
		this.name = name;
		this.price = price;
		this.nums = nums;
		this.description = description;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", nums=" + nums + ", description=" + description
				+ "]";
	}
	
}
