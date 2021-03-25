
public class Punto {

    private double x;
    private double y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void borrar() {
        mover(0, 0);
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(char a, double n) {
        if (a == 'x') {
            this.x = n;
        } else if (a == 'y') {
            this.y = n;
        }
    }
    
    public double distancia(double z, double t){

       return Math.sqrt(Math.pow((z-x),2)+Math.pow((t-y),2));
    }
    
    public void imprimePunto() {
        System.out.println("\n(" + getX() + "," + getY() + ")");
    }

}
