package DefaultMethod;

class DefaultMethod1 {
    interface Shape{
        void draw();

        default  void setColor(String color){
            System.out.println("Draw shape with color: " + color);
        }

    }

    public static class DefaultMethod implements Shape {
        @Override
        public void draw() {
            System.out.println("this line is draw");
        }

        public static void main(String[] args) {
            DefaultMethod shape = new DefaultMethod();
            shape.draw();
            shape.setColor("green");
        }
    }
}
