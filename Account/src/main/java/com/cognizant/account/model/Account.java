package com.cognizant.account.model;

import lombok.Getter;
import lombok.Setter;
//import lombok.ToString;

@Getter
@Setter
//@ToString
public class Account {
	private String number;
	private String type;
	private double balance;
}
