package com.itexam.springbootmybatis.pojo;

import lombok.Data;

@Data
public class User {
    
    private Integer id;
    private String name;
    private String gender;
    private String thumb;
    private Integer state;
    private String createDate;
    private String updateDate;
    private String phone;
    /**
	 * @return updateDate
	 */
//	public String getUpdateDate() {
//		return updateDate;
//	}

	/**
	 * @param updateDate セットする updateDate
	 */
//	public void setUpdateDate(String updateDate) {
//		this.updateDate = updateDate;
//	}

//    public User() {
//    }

//    public User(Integer id, String name, Short age, String gender, String phone) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.phone = phone;
//    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public Short getAge() {
//        return age;
//    }
//
//    public void setAge(Short age) {
//        this.age = age;
//    }

//    public String getGender() {
//        return gender;
//    }

    /**
	 * @return thumb
	 */
//	public String getThumb() {
//		return thumb;
//	}

	/**
	 * @param thumb セットする thumb
	 */
//	public void setThumb(String thumb) {
//		this.thumb = thumb;
//	}

	/**
	 * @return state
	 */
//	public Integer getState() {
//		return state;
//	}

	/**
	 * @param state セットする state
	 */
//	public void setState(Integer state) {
//		this.state = state;
//	}

	/**
	 * @return createDate
	 */
//	public String getCreateDate() {
//		return createDate;
//	}

	/**
	 * @param createDate セットする createDate
	 */
//	public void setCreateDate(String createDate) {
//		this.createDate = createDate;
//	}

//	public void setGender(String gender) {
//        this.gender = gender;
//    }

//    public String getPhone() {
//        return phone;
//    }

//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
