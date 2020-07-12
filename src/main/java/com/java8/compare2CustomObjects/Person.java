package com.java8.compare2CustomObjects;

import java.io.Serializable;

public class Person implements  Serializable{
	  private String id;
	  private String name;
	  private String address;

	  public Person (String id, String name, String address) {
	      this.id = id;
	      this.name = name;
	      this.address = address;
	  }

	  public String getId () {
	      return id;
	  }

	  public void setId (String id) {
	      this.id = id;
	  }

	  public String getName () {
	      return name;
	  }

	  public void setName (String name) {
	      this.name = name;
	  }

	  public String getAddress () {
	      return address;
	  }

	  public void setAddress (String address) {
	      this.address = address;
	  }

	  @Override
	  public boolean equals (Object o) {
	      if (this == o)
	          return true;
	      if (o == null || getClass() != o.getClass())
	          return false;

	      Person person = (Person) o;

	      return id != null ? id.equals(person.id) : person.id == null;
	  }

	  @Override
	  public int hashCode () {
	      return id != null ? id.hashCode() : 0;
	  }
	}