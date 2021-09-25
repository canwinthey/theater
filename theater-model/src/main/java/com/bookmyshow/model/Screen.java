package com.bookmyshow.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name = "SCREEN")
public class Screen {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "screen_id")
    private Long screenId;
	
	@Column(name = "screen_name")
	private String screenName;
	
    @ManyToOne(fetch = FetchType.LAZY)
    private Theater theater;

    @OneToMany(mappedBy = "show")
    private List<Show> showList;

    @OneToMany(mappedBy = "seat")
    private List<Seat> seatList;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    public void addShow(Show show) {
        this.showList.add(show);
    }
    
    public void removeShow(Show show) {
        this.showList.remove(show);
    }

    public void addSeat(Seat seat) {
        this.seatList.add(seat);
    }
    
    public void removeSeat(Seat seat) {
        this.seatList.remove(seat);
    }
	@Override
	public int hashCode() {
		return Objects.hash(screenId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return Objects.equals(screenName, other.screenName);
	}

}
