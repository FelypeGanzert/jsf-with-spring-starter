package com.felypeganzert.jsfstarter.web.form;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Getter;
import lombok.Setter;

@Component
@SessionScope
@Getter
@Setter
public class DayOfWeekResolverForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int year;
	private int month;
	private int dayOfMonth;
	private String dayOfWeek;
	
}
