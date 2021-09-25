package com.bookmyshow.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.bookmyshow.model.Screen;
import com.bookmyshow.model.Seat;
import com.bookmyshow.model.Theater;

@Service
public class TheatreService {

    private final Map<String, Theater> theatres;
    private final Map<String, Screen> screens;
    private final Map<String, Seat> seats;

    public TheatreService() {
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }

    public Seat getSeat(@NonNull final String seatId) throws Exception {
        if (!seats.containsKey(seatId)) {
            throw new Exception(seatId);
        }
        return seats.get(seatId);
    }

    public Theater getTheatre(@NonNull final String theatreId) throws Exception {
        if (!theatres.containsKey(theatreId)) {
            throw new Exception(theatreId);
        }
        return theatres.get(theatreId);
    }

    public Screen getScreen(@NonNull final String screenId) throws Exception {
        if (!screens.containsKey(screenId)) {
            throw new Exception(screenId);
        }
        return screens.get(screenId);
    }

    public Theater createTheatre(@NonNull final String theatreName) {
        String theatreId = UUID.randomUUID().toString();
        Theater theatre = new Theater(theatreId, theatreName);
        theatres.put(theatreId, theatre);
        return theatre;
    }

    public Screen createScreenInTheatre(@NonNull final String screenName, @NonNull final Theater theatre) {
        Screen screen = createScreen(screenName, theatre);
        theatre.addScreen(screen);
        return screen;
    }

    public Seat createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo, @NonNull final Screen screen) {
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId, rowNo, seatNo);
        seats.put(seatId, seat);
        screen.addSeat(seat);

        return seat;
    }

    private Screen createScreen(final String screenName, final Theater theatre) {
        String screenId = UUID.randomUUID().toString();
        Screen screen = new Screen(screenId, screenName, theatre);
        screens.put(screenId, screen);
        return screen;
    }

}
