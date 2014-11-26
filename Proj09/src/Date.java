

/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class Date {
	 
	private int day;   
	private int month;   
	private int year;
	
	private static final int[] monthDays= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	/**
	 * Verifies if the year is leap
	 * @param year
	 * @return true if is a leap year
	 */
	private static boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
	/**
	 * Get the number of days the year
	 * @param year 
	 * @return number of days
	 */
	private static int getYearDays(int year) {	
		
		return isLeap(year) ? 366 : 365;
	}
	
	/**
	 * Get the number of the days in the specific month
	 * @param month
	 * @param year
	 * @return number of days
	 */
	private static int getMonthDays(int month, int year) {
		int days = monthDays[month-1];
		if (month==2 && isLeap(year)) days++;
		return days;
	}
	
	/**
	 * Get the number of days since January 1st of the current year
	 * @return number of days
	 */
	private int getDaysSinceJan() {
		int nd=0;
		 
		for (int m = 1; m < month; ++m) {
			nd += getMonthDays(m, year);
		}

		return nd + day;
	}
	
	/**
	* Adjust the date to make sure its valid
	*/
	private void adjustDate() {
	  if (year < 0) year = 0;
	  if (month < 1 ) month = 1;
	  else if (month >= 12) month=12;
	  if (day < 0) day=1;
	  else if (day >= getMonthDays(month,year)) day = getMonthDays(month,year);
	}
	
	/**
	 * @param day
	 * @param mes
	 * @param ano
	 */
	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		adjustDate();
	}
	
	public Date() {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		year= cal.get(java.util.Calendar.YEAR);
		month= cal.get(java.util.Calendar.MONTH) + 1;
		day= cal.get(java.util.Calendar.DAY_OF_MONTH);
	}

	/**
	 *	@return Return the String representation of the date
	 */
    public String toString() {
		return day + "/" + month + "/" + year;		
	}
	
	/**
	 * Compare the current date with the date "date"
	 * @param date 
	 * @return <0, =0, >0, if the current date is less, equal or bigger then the date "date"
	 */
	public int compareTo(Date date) {
		int da = year - date.year;
		if (da != 0) return da;
		int dm = month - date.month;
		if (dm != 0) return dm;
		return day- date.day;//NOTE
	}
	
	/**
	 * Add's to the current number of days "nDays" and returns a new date.
	 * @param nDays
	 */
	public Date addDays(int nDays) {
	
		int m=month, d=day, y=year;
		
		int daysLeftYear = getYearDays(y) - getDaysSinceJan();
		
		if (nDays > daysLeftYear) {
			nDays -= daysLeftYear;
			d=1; m=1; y++;
			int da;
			
			while (nDays >= (da = getYearDays(y))) {
				 y++;
				 nDays -= da;
			}
		}
		
		int daysLeftMonth = getMonthDays(m, y)-d;
		
		while (nDays > daysLeftMonth) {
			nDays -= daysLeftMonth+1;
			m++;
			d=1;
			daysLeftMonth = getMonthDays(m, y)-1;
		}
		
		d+= nDays;
		return new Date(d,m,y);
	}

	/**
	 * Calculate the difference between the current date and "date" 
	 * @param date
	 * @return number of days
	 */
	int diffDays(Date date) {
		if (this.compareTo(date) > 0) {
			return - date.diffDays(this); 
		}
		
		if (year == date.year)  {
		   return   date.getDaysSinceJan()-getDaysSinceJan();
		}
		int nDays = getYearDays(year) -  getDaysSinceJan();
		for(int a=year+1 ; a < date.year; ++a) {
			nDays += getYearDays(a);
		}
		return nDays + date.getDaysSinceJan();
	}
	
	
	/**
	 * Returns the day of the current date
	 * @return day
	 */
	public int getDay()  {
		return day;
	}
	
	/**
	 * Returns the month of the current date
	 * @return month
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Returns the year of the current date
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Verifies if a date is valid
	 * @return true if is valid
	 */
	public static boolean isValid(int day, int month, int year) {
		if (year < 1900 || year > 3000) return false;
		if (month < 1 || month > 12) return false;
		return (day >= 1 && day <= getMonthDays(month, year));
	}
}

