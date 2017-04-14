package module8;

import java.util.Date;

/**
 * Created by kaganets.s on 13.04.2017.
 */
public class Food {
    private int id;
    private String name;
    private String country;
    private Date expiration;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Date getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
