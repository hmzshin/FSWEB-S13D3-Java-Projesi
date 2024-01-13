public class Wall {
    private  double width;
    private double height;


    public Wall (double width, double height){
        this.width= width;
        this.height= height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    public void setHeight(double height) {
        if (height < 0 ) {
            System.out.println("Height değeri sıfırdan küçük olamaz");
            this.height = 0;
        }else {
            this.height = height;
        }
    }
    public void setWidth(double width) {
        if (width < 0 ) {
            System.out.println("Width değeri sıfırdan küçük olamaz");
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    public double getArea(){
        return this.getHeight()*this.getWidth();
    }


    @Override
    public String toString() {
        return "Wall{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
