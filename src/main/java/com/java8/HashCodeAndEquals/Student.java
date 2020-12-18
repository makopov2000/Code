package com.java8.HashCodeAndEquals;

public class Student {
    private Integer id;
    private String name;
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    ///////////////////   1! way /////////////////////
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (!(obj instanceof Student))
//            return false;
//        if (obj == this)
//            return true;
//        return this.getId() == ((Student) obj).getId();
//    }
//    
//    @Override
//    public int hashCode() {
//        return id;
//    }
    
    /////////////////// 2 way /////////////////////
    
//    @Override 
//    public boolean equals(Object obj) { 
//    	if (obj == this) { return true; } 
//    	if (obj == null || obj.getClass() != this.getClass()) { return false; } 
//    	Student guest = (Student) obj; 
//    	return id == guest.id && (name == guest.name || (name != null && name.equals(guest.getName()))) ; 
//    	}
//    
//    @Override 
//    public int hashCode() { 
//    	final int prime = 31; 
//    	int result = 1; 
//    	result = prime * result + ((name == null) ? 0 : name.hashCode()); 
//    	result = prime * result + id; 
//    	return result; 
//    	}

   @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
//		return "(" + getId() + " => " + getName() + ")";
	}
	//////////////////// 3 way /////////////////
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Student)) {
            return false;
        }

        Student user = (Student) o;

        return user.name.equals(name) && user.id == id ;
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }
    
}