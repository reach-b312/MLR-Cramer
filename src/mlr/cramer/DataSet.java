package mlr.cramer;

class DataSet {
//Atributos de clase
    private double X1[] = new double[]{41.9, 43.4, 43.9, 44.5, 47.3, 47.5, 47.9, 50.2, 52.8, 53.2, 56.7, 57, 63.5, 65.3, 71.1, 77, 77.8};
    private double X2[] = new double[]{29.1, 29.3, 29.5, 29.7, 29.9, 30.3, 30.5, 30.7, 30.8, 30.9, 31.5, 31.7, 31.9, 32, 32.1, 32.5, 32.9};
    private double Y[] = new double[]{251.3, 251.3, 248.3, 267.5, 273, 276.5,  270.3,  274.9, 285, 290, 297, 302.5, 304.5, 309.3, 321.7, 330.7, 349};
    /*private double X1[] = new double[]{1,2,2,4,2,1,5,4,2,4,4,3,6,5,3,4,6,2,1,2};
    private double X2[] = new double[]{1,3,3,5,2,2,1,1,0,3,4,3,2,4,4,4,5,1,0,1};
    private double Y[] = new double[]{76,78,85,88,72,69,94,94,88,92,90,75,96,90,82,85,99,83,62,76};*/

//Metodos
public double [] getX1 (){return X1;}
public double [] getX2 (){return X2;}
public double [] getY (){return Y;}
}
