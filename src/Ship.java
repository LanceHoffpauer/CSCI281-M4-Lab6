/*
 * The Ship Class. Used to assemble the roster
 * Jayden LaCombe and Lance Hoffpauer
 * 4/13/2022
 */


public class Ship {

 private String shipName;
 private String shipFlag;
 private int shipYear;

 public Ship (String sn, String sc, int sd) {

     setShipName(sn);
     setShipFlag(sc);
     setShipYear(sd);

 }

    public Ship(String tempName, int tempYear, String tempFlag) {
    }

    public String toString() {

     return (getShipName() + ", " + getShipYear() + ", Flag: " + getShipFlag());

 }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipFlag() {
        return shipFlag;
    }

    public void setShipFlag(String shipFlag) {
        this.shipFlag = shipFlag;
    }

    public int getShipYear() {
        return shipYear;
    }

    public void setShipYear(int shipYear) {
        this.shipYear = shipYear;
    }
}
