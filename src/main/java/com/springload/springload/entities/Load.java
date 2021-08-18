package com.springload.springload.entities;

public class Load {
	
	private long id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private long noOfTruck;
	private long weight;
	private String comment;
	private long date;
	
	public Load(long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			long noOfTruck, long weight, String comment, long date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public long getNoOfTruck() {
		return noOfTruck;
	}

	public void setNoOfTruck(long noOfTruck) {
		this.noOfTruck = noOfTruck;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTruck=" + noOfTruck + ", weight="
				+ weight + ", comment=" + comment + ", date=" + date + "]";
	}

	
	
}