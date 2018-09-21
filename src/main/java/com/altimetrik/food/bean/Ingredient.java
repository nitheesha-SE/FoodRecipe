package com.altimetrik.food.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
public class Ingredient {
	
	private String query;
	private String timezone = "America/Chicago";
	private boolean line_delimited = false;
	private boolean use_raw_foods = false;
	private boolean use_branded_foods = false;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public boolean isLine_delimited() {
		return line_delimited;
	}
	public void setLine_delimited(boolean line_delimited) {
		this.line_delimited = line_delimited;
	}
	public boolean isUse_raw_foods() {
		return use_raw_foods;
	}
	public void setUse_raw_foods(boolean use_raw_foods) {
		this.use_raw_foods = use_raw_foods;
	}
	public boolean isUse_branded_foods() {
		return use_branded_foods;
	}
	public void setUse_branded_foods(boolean use_branded_foods) {
		this.use_branded_foods = use_branded_foods;
	}

	
	/*public Ingredient(String ingredient) {
		this.query = ingredient;
		this.timezone = "America/Chicago";
		this.line_delimited = false;
		this.use_raw_foods = false;
		this.use_branded_foods = false;
	}*/

}
