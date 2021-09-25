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
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name = "SHOW")
public class Show {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "show_id")
	private Long showId;
	
	@Column(name = "show_name")
    private String showName;

	@OneToOne
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

	@Override
	public int hashCode() {
		return Objects.hash(showId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Show other = (Show) obj;
		return Objects.equals(showName, other.showName);
	}
}
