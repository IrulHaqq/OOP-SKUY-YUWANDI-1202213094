package praktikum;
public class Calculation implements Runnable{
    public double SquereSide, CircleRadius, area;
    public double phi = 3.14;

    public void setSquare(double SquereSide) throws IllegalArgumentException{
        if (SquereSide < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari satu!");
        }
        this.area = SquereSide*SquereSide;
    }

    public double getSquare(){
        return this.area;
    }

    public void setCircle(double CircleRadius) throws IllegalArgumentException{
        if (CircleRadius < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari satu!");
        }
        this.area = phi*(CircleRadius*CircleRadius);
    }

    public double getCircle(){
        return this.area;
    }

    public void setTrapezoid(double TrapezoidSide, double TrapezoidUpperSide, double TrapezoidHeight) throws IllegalArgumentException{
        if (TrapezoidSide < 1 || TrapezoidUpperSide < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari satu!");
        }
        this.area = (TrapezoidSide+TrapezoidUpperSide)*TrapezoidHeight*0.5;
    }

    public double getTrapezoid(){
        return this.area;
    }

    @Override
    public void run(){
        System.out.println("Program akan dimulai dalam: ");
        for (int i = 3; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                System.out.println("Terjadi kesalahan: "+ e.getMessage());
            }
        }
        System.out.println("Program selesai");
    }
}