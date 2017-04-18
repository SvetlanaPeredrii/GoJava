package module8;

import java.util.Date;

/**
 * Created by kaganets.s on 13.04.2017.
 */
public class Food {
    private  final long id;
    private String name;
    private String country;
    private Date expiration;

    public Food(String name, String country, Date expiration, long id) {
        this.id=id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public long getId() {

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
        return (int) (id ^ (id >>> 32));
    }
}
