package mlr.cramer;

/**
 *
 * @author Ricardo
 */
class HelperArithmetic {
//Atributos
double sumX1,sumX2,sumY,sumX1Y,sumX2Y,sumX1pow2,sumX2pow2,sumX1X2;
double  beta2,beta1,beta0,Ds;
int n;
//Constructor
HelperArithmetic(DataSet ds){
n = ds.getX1().length;
sumX1 = calcularSumatoria(ds.getX1());
sumX2 = calcularSumatoria(ds.getX2());
sumY = calcularSumatoria(ds.getY());
sumX1Y = calcularSumatoriaXY(ds.getX1(),ds.getY());
sumX2Y = calcularSumatoriaXY(ds.getX2(),ds.getY());
sumX1X2 = calcularSumatoriaXY(ds.getX1(),ds.getX2());
sumX1pow2 = calcularSumatoriaCuadrada(ds.getX1());
sumX2pow2 = calcularSumatoriaCuadrada(ds.getX2());
calcularDeterminante();
}
//Calculos comunes
private double calcularSumatoria(double [] columna){
double resultado = 0;
for(double campo : columna){
resultado+=campo;
}
return resultado;
}
private double calcularSumatoriaXY(double [] columna1, double [] columna2){
double resultado=0;
for(int i=0;i<columna1.length;i++){
resultado+=columna1[i]*columna2[i];
}
return resultado;
}
private double calcularSumatoriaCuadrada(double [] columna){
double resultado = 0;
for(double campo : columna){
resultado+=campo*campo;
}
return resultado;
}
private void calcularDeterminante() {
Ds = (n*sumX1pow2*sumX2pow2)+(sumX1*sumX1X2*sumX2)+(sumX2*sumX1*sumX1X2)-
(sumX2*sumX1pow2*sumX2)-(sumX1X2*sumX1X2*n)-(sumX2pow2*sumX1*sumX1);
}
public double calcularBeta0() {
beta0 = (sumY*sumX1pow2*sumX2pow2) +(sumX1*sumX1X2*sumX2Y)+(sumX2*sumX1Y*sumX1X2)-
(sumX2Y*sumX1pow2*sumX2)-(sumX1X2*sumX1X2*sumY)-(sumX2pow2*sumX1Y*sumX1);
beta0 /= Ds;
return beta0;
}
public double calcularBeta1() {
beta1 = (n*sumX1Y*sumX2pow2)+(sumY*sumX1X2*sumX2)+(sumX2*sumX1*sumX2Y)-
(sumX2*sumX1Y*sumX2)-(sumX2Y*sumX1X2*n)-(sumX2pow2*sumX1*sumY);
beta1 /= Ds;
return beta1;
}
public double calcularBeta2() {
beta2 = (n*sumX1pow2*sumX2Y)+(sumX1*sumX1Y*sumX2)+(sumY*sumX1*sumX1X2)-
(sumX2*sumX1pow2*sumY)-(sumX1X2*sumX1Y*n)-(sumX2Y*sumX1*sumX1);
beta2 /= Ds;
return beta2;
}
}
