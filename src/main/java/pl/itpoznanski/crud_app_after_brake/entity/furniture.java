package pl.itpoznanski.crud_app_after_brake.entity;

import com.sun.istack.NotNull;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "furniture")
public class furniture {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @NonNull
    @Column(name = "id_furniture")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private double weight;

    public furniture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        furniture furniture = (furniture) o;
        return id == furniture.id &&
                Double.compare(furniture.weight, weight) == 0 &&
                Objects.equals(name, furniture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight);
    }

    @Override
    public String toString() {
        return "furniture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
