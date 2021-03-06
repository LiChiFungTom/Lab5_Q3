/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Shapes;

import java.util.Scanner;

/**
 *
 * @author alanpo
 */
public abstract class Shape {
    private String name;
    private Point topLeft;

    public Shape(String name, Point topLeft) {
        this.name = name;
        this.topLeft = topLeft;
    }

    public abstract double getArea();
    
    public abstract void update(Scanner sc);

    @Override
    public String toString() {
        return name + ": " + topLeft;
    }
    
    
}
