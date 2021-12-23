package com.example.web3.model;

public class PointAreaChecker implements AreaChecker<Point> {

    public boolean check(Point p){

        p.setResult(inFourthQuarter(p) && (p.getX() <= p.getR()) && (p.getY() >= -p.getR() / 2) || inThirdQuarter(p) && (-p.getY() <= p.getR() + p.getX()) || inSecondQuarter(p) && (p.getX() * p.getX() + p.getY() * p.getY() <= p.getR() * p.getR()));
        return p.isResult();
    }

    private boolean inFirstQuarter(Point p){
        return p.getX() >= 0 && p.getY() >= 0;
    }

    private boolean inSecondQuarter(Point p){
        return p.getX() <= 0 && p.getY() >= 0;
    }

    private boolean inThirdQuarter(Point p){
        return p.getX() <= 0 && p.getY() <= 0;
    }

    private boolean inFourthQuarter(Point p){
        return p.getX() >= 0 && p.getY() <= 0;
    }
}
