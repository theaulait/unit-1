/** * Created by Hoshiko on 4/30/15. */public class ClarinetPlayer extends Musician {    Clarinet myClarinet = new Clarinet();    @Override    public String play_instrument()    {        if (!myClarinet.hasReed()){            return null;        }else{            return myClarinet.play();        }    }    public void toggle_reed(){        if (!myClarinet.hasReed()){            myClarinet.place_reed();        }else{            myClarinet.remove_reed();        }    }}