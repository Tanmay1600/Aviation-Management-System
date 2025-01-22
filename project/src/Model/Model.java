package Model;

import Model.Airports.managepass;
import Model.Airlines.manageairl;
import Model.Trips.manageTrips;

public class Model {
    managepass mp;
    manageairl ma;
    manageTrips me;

    public Model() {
        mp = new managepass();
        ma = new manageairl();
        me = new manageTrips();
    }

    public managepass getMp() {
        return mp;
    }

    public manageairl getMa() {
        return ma;
    }

    public manageTrips getMe() {
        return me;
    }

    public void setMp(managepass mp) {
        this.mp = mp;
    }

    public void setMa(manageairl ma) {
        this.ma = ma;
    }

    public void setMe(manageTrips me) {
        this.me = me;
    }
}

