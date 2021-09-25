package com.bookmyshow.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name = "SEAT")
public class Seat {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "seat_id")
    private Long seatId;
	
	@Column(name = "seat_type")
	private String seatType;
	
	@Column(name = "row_no")
	private String rowNo;
	
	@Column(name = "seat_no")
    private String seatNo;
	
    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;
    
    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

	@Override
	public int hashCode() {
		return Objects.hash(seatId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return Objects.equals(seatNo, other.seatNo);
	}
}
