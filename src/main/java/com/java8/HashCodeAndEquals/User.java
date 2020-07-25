package com.java8.HashCodeAndEquals;

//import org.apache.commons.lang3.builder;

public class User {
    private String name;
    private int age;
    private String passport;

	//getters and setters, constructor
    
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        return user.name.equals(name) &&
                user.age == age &&
                user.passport.equals(passport);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        return result;
    }

	public User(String name, int age, String passport) {
		super();
		this.name = name;
		this.age = age;
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", passport=" + passport + "]";
	}
    
    ///////////////////////////////////////////////

//     @Override
//    public boolean equals(Object o) {
//
//        if (o == this) return true;
//        if (!(o instanceof User)) {
//            return false;
//        }
//
//        User user = (User) o;
//
//        return new EqualsBuilder()
//                .append(age, user.age)
//                .append(name, user.name)
//                .append(passport, user.passport)
//                .isEquals();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 37)
//                .append(name)
//                .append(age)
//                .append(passport)
//                .toHashCode();
//    }
    
    

}