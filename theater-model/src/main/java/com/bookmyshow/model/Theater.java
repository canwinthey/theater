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
@Entity
public class Theater {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "theater_id")
    private Long theaterId;
    
	@Column(name = "theater_name")
	private String theaterName;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
    
    @OneToMany(mappedBy = "theater")
    private List<Screen> screens;
    
    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    public void addScreen(Screen screen) {
        screens.add(screen);
    }
    
    public void deleteScreen(Screen screen) {
        screens.remove(screen);
    }

	@Override
	public int hashCode() {
		return Objects.hash(theaterId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theater other = (Theater) obj;
		return Objects.equals(theaterName, other.theaterName);
	}


}
