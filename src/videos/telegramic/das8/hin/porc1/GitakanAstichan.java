package videos.telegramic.das8.hin.porc1;

/**
 * T = type
 * E = Element
 * N = Number
 * K = key
 * V = value
 * G = Generic
 * @param <T>
 */

public class GitakanAstichan<T> {
    String name;
    T astichan;

    public GitakanAstichan(String name, T astichan){
        this.name = name;
        this.astichan = astichan;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public T getAstichan(){
        return astichan;
    }

    public void setAstichan(T astichan){
        this.astichan = astichan;
    }

    public <G> void orinak(G popoxakan){
        System.out.println("popoxakan " + popoxakan.toString()+ " class: " + popoxakan.getClass().getSimpleName());
    }
}














