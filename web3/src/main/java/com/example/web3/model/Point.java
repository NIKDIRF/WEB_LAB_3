package com.example.web3.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private double x;

    private double y;

    private double r;

    private boolean result;

    public Point(Point point){
        id = point.getId();
        x = point.getX();
        y = point.getY();
        r = point.getR();
        result = point.isResult();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(id, point.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
