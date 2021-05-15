package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Number Table which contain num field.
 *
 * @author Anant Jain
 */
@Entity
public class Number {
	@Id
	Integer num ;

	public Number() {
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
}
