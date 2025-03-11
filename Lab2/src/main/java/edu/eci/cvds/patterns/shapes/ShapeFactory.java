package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Hexagon:
                return new Hexagon();
            case Pentagon:
                return new Pentagon();
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            default:
                throw new IllegalArgumentException("Forma no reconocida: " + type);
        }
    }
}
