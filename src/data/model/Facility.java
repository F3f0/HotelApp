package data.model;

import static utils.Constants.*;

public enum Facility {

    BreakfastFree (BREAKFAST_FREE, "Free breakfast") ,
    Wifi (WIFI, "wifi") ,
    Tv (TV, "tv") ,
    Ac (AC, "ac") ,
    SeaView (SEA_VIEW, "Sea view") ;

    private final String key;
    private final String name;

    Facility (String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
