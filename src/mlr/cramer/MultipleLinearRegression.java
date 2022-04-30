package mlr.cramer;
class MultipleLinearRegression {
    HelperArithmetic ha;
    MultipleLinearRegression(HelperArithmetic consultar){
    this.ha = consultar;
    }
        
void imprimir(double mlrX1, double mlrX2){
        double b0,b1,b2;
        b0=ha.calcularBeta0();
        b1=ha.calcularBeta1();
        b2=ha.calcularBeta2();
        System.out.printf("\ny = %f + %f X1 + %f X2 ",b0,b1,b2);
        double y = b0 + b1*mlrX1 + b2*mlrX2;
        System.out.print("\ny = "+y);
}
}

