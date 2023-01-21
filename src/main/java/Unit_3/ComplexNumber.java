package Unit_3;

import java.lang.Double;
import java.util.Objects;


public final class ComplexNumber {
    private final double re;
    private final double im;


    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {

        return im;
    }

    @Override
    public String toString() {
        return "Unit_3.ComplexNumber{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumber that = (ComplexNumber) o;

        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;///????????????????????
    }



    @Override
    public int hashCode() {

        return Objects.hash(re, im);
    }
    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) Double.doubleToLongBits(re);
        result = prime * result + (int) Double.doubleToLongBits(im);
        return result;
    }*/

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));

    }


}
