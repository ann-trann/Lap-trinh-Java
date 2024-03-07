package java_34;

import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >= 1) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	public int getDay() {
			return this.day;
		}
		public void setDay(int day) {
			if (day >= 1 && day <= 31) {
				this.day = day;
			}
		}
		
		public int getMonth() {
			return this.month;
		}
		public void setMonth(int month) {
			if (month >= 1 && month <= 12) {
				this.month = month;
			}
		}
		
		public int getYear() {
			return this.year;
		}
		public void setYear(int year) {
			if (this.year >= 1) {
				this.year = year;
			}
		}
		
		public String toString() {
			return this.day + "/" + this.month + "/" + this.year;
//			return this.year + "/";
		}

		@Override
		public int hashCode() {
			return Objects.hash(day, month, year);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyDate other = (MyDate) obj;
			return day == other.day && month == other.month && year == other.year;
		}
		
		
}
