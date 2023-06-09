package com.app.rys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.rys.models.Booking;
import com.app.rys.models.User;
import com.app.rys.repository.UserRepository;



public class BookingPostBody {
	
	   @Autowired
	    private UserRepository userRepository;
	
	    private Long userId;
	    private String seatNumber;
	    private String address;
	    private String floorNumber;
	    private String city;
	    private String reservationDate;
	  

	    public BookingPostBody(String seatNumber, String address, String floorNumber, String city, String reservationDate, Long userId, UserRepository userRepository) {
	        super();
	        this.seatNumber = seatNumber;
	        this.address = address;
	        this.floorNumber = floorNumber;
	        this.city = city;
	        this.reservationDate = reservationDate;
	        User user = userRepository.findByid(userId);
	        if (user != null) {
	            this.userId = user.getId();
	        }
	    }
	
	    
	    
	public BookingPostBody() {
		super();
	}



	public UserRepository getUserRepository() {
		return userRepository;
	}



	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getSeatNumber() {
		return seatNumber;
	}



	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getFloorNumber() {
		return floorNumber;
	}



	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getReservationDate() {
		return reservationDate;
	}



	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	

	
}
