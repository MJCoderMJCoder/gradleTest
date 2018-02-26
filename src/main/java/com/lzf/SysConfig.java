/**
 * 
 */
package com.lzf;

import java.sql.Timestamp;

/**
 * @author MJCoder
 *
 */
public class SysConfig {
	private String variable;
	private String value;
	private Timestamp set_time;
	private String set_by;

	/**
	 * @param variable
	 * @param value
	 * @param set_time
	 * @param set_by
	 */
	public SysConfig(String variable, String value, Timestamp set_time, String set_by) {
		this.variable = variable;
		this.value = value;
		this.set_time = set_time;
		this.set_by = set_by;
	}

	/**
	 * @return the variable
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * @param variable
	 *            the variable to set
	 */
	public void setVariable(String variable) {
		this.variable = variable;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the set_time
	 */
	public Timestamp getSet_time() {
		return set_time;
	}

	/**
	 * @param set_time
	 *            the set_time to set
	 */
	public void setSet_time(Timestamp set_time) {
		this.set_time = set_time;
	}

	/**
	 * @return the set_by
	 */
	public String getSet_by() {
		return set_by;
	}

	/**
	 * @param set_by
	 *            the set_by to set
	 */
	public void setSet_by(String set_by) {
		this.set_by = set_by;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{\"variable\":\"" + variable + "\", \"value\":\"" + value + "\", \"set_time\":\"" + set_time
				+ "\", \"set_by\":\"" + set_by + "\"}";
	}
}
