package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by kaganets.s on 27.04.2017.
 */
public class Number {



    private  final int id;
    private String name;

    public Number(long id, String name) {
        this.name = name;
        this.id = TestGenerator.generateId();
    }
    public Number createNumber(){

        return new Number(id,name+"number");
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Number number = (Number) o;

        return id == number.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Number{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
