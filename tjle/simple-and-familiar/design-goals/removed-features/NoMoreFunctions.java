class NoMoreFunctions {
    class Point extends Object {
        double x;
        double y;

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double x() {
            return x;
        }

        public double y() {
            return y;
        }
    }

    class Rectangle extends Object {
        Point lowerLeft;
        Point upperRight;

        public void setEmptyRect() {
            lowerLeft.setX(0.0);
            lowerLeft.setY(0.0);
            upperRight.setX(0.0);
            upperRight.setY(0.0);
        }
    }
}