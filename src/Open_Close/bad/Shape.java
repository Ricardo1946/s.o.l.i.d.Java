package Open_Close.bad;

/**
 * We should desig our code in a way that allows us to add
 * new feature without changing the existing code.
 *
 * The shape class violates the OCP because it requires modification
 * whenever a new shape is added.
 */


class Share {

    private String type;


    public Share(String type) { this.type = type; }

    public double calculateArea(double radius, double width, double heigth){
        if (type.equals("circle")){
            //calcule  circule  area
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            //calculate rectangle area
            return width * heigth;
        }
        return 0.0;
    }
}
