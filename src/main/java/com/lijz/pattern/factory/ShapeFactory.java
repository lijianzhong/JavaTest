package com.lijz.pattern.factory;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType. equals("circle")){

            return new Circle();

        }else if(shapeType.equals("rectangle")){

            return new Rectangle();

        }else{

            return null;
        }
    }


    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        if(shape != null){
            shape.draw();
        }
        shape = shapeFactory.getShape("rectangle");
        if(shape != null){
            shape.draw();
        }
    }


}
