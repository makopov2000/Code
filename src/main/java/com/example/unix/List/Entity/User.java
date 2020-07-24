package com.example.unix.List.Entity;

import java.util.Date;

public class User implements Comparable<User>{

	  private long id;
	  private String email;
	  private Date createdOn;
	    
	  // other getters and setters omitted
	  
	  public Date getCreatedOn() {
	    return createdOn;
	  }
	  
	  public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String email, Date createdOn) {
		super();
		this.id = id;
		this.email = email;
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", createdOn=" + createdOn + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreatedOn(Date createdOn) {
	    this.createdOn = createdOn;
	  }

	@Override
	  public int compareTo(User u) {
	    if (getCreatedOn() == null || u.getCreatedOn() == null) {
	      return 0;
	    }
	    return getCreatedOn().compareTo(u.getCreatedOn());
	  }
	}