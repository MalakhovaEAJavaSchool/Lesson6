package lesson10;

/**
 * Created by Student on 11.08.2016.
 */
public class Apple {
    Integer size;

    public Integer getSize(){
        return this.size;
    }

    public static Integer getSize(Integer size){return size;}
    public Apple(Integer size) {
        this.size = size;

    }
}
