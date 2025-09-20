package com.Transport.entity;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	@ManyToMany
	@JoinTable(
			name="bus_stop",
		joinColumns =	@JoinColumn(name="bus_id"),
			inverseJoinColumns = @JoinColumn(name="stop_id")
			)
	private List<Stop> stops = new ArrayList<>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Stop> getStops() {
		return stops;
	}


	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}
	
	

}
