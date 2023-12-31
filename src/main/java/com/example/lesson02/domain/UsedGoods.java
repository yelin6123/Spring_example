package com.example.lesson02.domain;

import java.util.Date;

//DTO, model, domain 이라고 불리는 객체!!!! : 가공 후 (같은 단어) 
//Entity : 가공 전
public class UsedGoods {
	//필드 : DB에 있는 데이터들 : desc `used_good`; 해서 field 확인후 붙여넣기 
	//데이터 중 null 여부 확인 > null이 된다면 Integer로 담아줘야함. ex) private Integer id;
	private int id;
	private int sellerId;
	private String title;
	private String description;
	private int price;
	private String pictureUrl;
	private Date createdAt;
	private Date updateedAt;

	//메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateedAt() {
		return updateedAt;
	}
	public void setUpdateedAt(Date updateedAt) {
		this.updateedAt = updateedAt;
	}
	
	
	
}



