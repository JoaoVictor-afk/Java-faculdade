class circulodnv {
    public   double raio;
    public   double area;
    
    public circulodnv(double r, double a) {
    
        this.raio=1;
        this.area=a;
    
        
    }
    
    public circulodnv() {     
    }
    
    
    public  double getRaio(){
        return raio;
    }
    
    public  double getArea(){
        return area=(Math.pow(raio, 2)*3.14);
    }
    

    public static void main(String args [] ){
        
        circulodnv areas = new circulodnv();
        
        areas.raio=6;
        
        System.out.println(areas.raio);
        System.out.println(areas.getArea());
        
    }
    
    
    
}

