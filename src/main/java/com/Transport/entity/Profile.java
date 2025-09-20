package com.Transport.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
   
   private String bio ;
   
   
   @OneToOne(mappedBy = "profile")
   private User user;


   public Long getId() {
	return id;
   }


   public void setId(Long id) {
	this.id = id;
   }


   public String getBio() {
	return bio;
   }


   public void setBio(String bio) {
	this.bio = bio;
   }


   public User getUser() {
	return user;
   }


   public void setUser(User user) {
	this.user = user;
   }
   
   
	
}
