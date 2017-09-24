package HomeTask1;


import java.util.Objects;

public class Cortege {
    int low;
    int high;
    int sum;

    public int getLow(){
        return  low;
    }

    public int getHigh(){
        return high;
    }
    public Cortege(int low, int high, int sum){
        this.low = low;
        this.high = high;
        this.sum = sum;
    }

    @Override
    public String toString(){
        return "(" + this.low + ", " + this.high + ", " + this.sum + ")";
    }
    @Override
    public boolean equals(Object o) {
        Cortege cort = (Cortege) o;
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        return ((Objects.equals(this.low, cort.low)) && (Objects.equals(this.high, cort.high))
                && (Objects.equals(this.sum, cort.sum)));
    }
}

