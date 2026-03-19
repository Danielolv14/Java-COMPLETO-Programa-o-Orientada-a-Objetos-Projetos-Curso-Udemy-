public class Retangulo {
    private double Width;
    private double Height;

    Retangulo(double Width, double Height){
        this.Width = Width;
        this.Height = Height;
    }

    public double Area(){
        return this.Width * this.Height;
    }
    public double Perimeter(){
        return this.Height*2 + this.Width*2;
    }

@Override
    public String toString(){
        return String.format("%.2f\n",Area())
               + String.format("%.2f",Perimeter());
    }
}
