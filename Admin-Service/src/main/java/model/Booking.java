package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
	
    private int userId;
    
    private int scheduleId;
    
    private Date bookingTime;
    
    private Date journeyDate;
    
    private double totalFare;
    
    private String bookingStatus;
    
    private String pnr;
    
    private String seatNumber;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Booking(int bookingId, int userId, int scheduleId, Date bookingTime, Date journeyDate, double totalFare,
			String bookingStatus, String pnr, String seatNumber) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.scheduleId = scheduleId;
		this.bookingTime = bookingTime;
		this.journeyDate = journeyDate;
		this.totalFare = totalFare;
		this.bookingStatus = bookingStatus;
		this.pnr = pnr;
		this.seatNumber = seatNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingId;
		result = prime * result + ((bookingStatus == null) ? 0 : bookingStatus.hashCode());
		result = prime * result + ((bookingTime == null) ? 0 : bookingTime.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + ((pnr == null) ? 0 : pnr.hashCode());
		result = prime * result + scheduleId;
		result = prime * result + ((seatNumber == null) ? 0 : seatNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalFare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookingId != other.bookingId)
			return false;
		if (bookingStatus == null) {
			if (other.bookingStatus != null)
				return false;
		} else if (!bookingStatus.equals(other.bookingStatus))
			return false;
		if (bookingTime == null) {
			if (other.bookingTime != null)
				return false;
		} else if (!bookingTime.equals(other.bookingTime))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (pnr == null) {
			if (other.pnr != null)
				return false;
		} else if (!pnr.equals(other.pnr))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (seatNumber == null) {
			if (other.seatNumber != null)
				return false;
		} else if (!seatNumber.equals(other.seatNumber))
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	
   // private Schedule Schedule;
    
  //  private User User

    
    
}
