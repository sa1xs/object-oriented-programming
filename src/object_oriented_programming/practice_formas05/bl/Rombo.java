package object_oriented_programming.practice_formas05.bl;

public class Rombo extends Figura {
    private double diagonalMayor, diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = validar(diagonalMayor);
        this.diagonalMenor = validar(diagonalMenor);
    }

    public double getDiagonalmayor() {
        return diagonalMayor;
    }

    public void setDiagonalmayor(double diagonalMayor) {
        this.diagonalMayor = validar(diagonalMayor);
    }

    public double getDiagonalmenor() {
        return diagonalMenor;
    }

    public void setDiagonalmenor(double diagonalMenor) {
        this.diagonalMenor = validar(diagonalMenor);
    }

    @Override
    protected double[] medidas() {
        return new double[] { diagonalMayor, diagonalMenor };
    }

    @Override
    public double calcularArea() {
        return diagonalMayor * diagonalMenor / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * Math.hypot(diagonalMayor / 2, diagonalMenor / 2);
    }

}
