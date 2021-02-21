package com.felypeganzert.jsfstarter.web.action;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.felypeganzert.jsfstarter.service.DayOfWeekResolverService;
import com.felypeganzert.jsfstarter.web.form.DayOfWeekResolverForm;

import lombok.RequiredArgsConstructor;

@Component
@RequestScope
@RequiredArgsConstructor
public class DayOfWeekResolverAction implements Serializable{
	private static final long serialVersionUID = 1L;

	private final DayOfWeekResolverForm dayOfWeekResolverForm;
	private final DayOfWeekResolverService dayOfWeekResolverService;
	
	public void determineDayOfWeek() {
		int year = dayOfWeekResolverForm.getYear();
		int month = dayOfWeekResolverForm.getMonth();
		int dayOfMonth = dayOfWeekResolverForm.getDayOfMonth();
		
		String dayOfWeekName = dayOfWeekResolverService.determineDayOfWeek(year, month, dayOfMonth);
		dayOfWeekResolverForm.setDayOfWeek(dayOfWeekName);
	}
	
}
