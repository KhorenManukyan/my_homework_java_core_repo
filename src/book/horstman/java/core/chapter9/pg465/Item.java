package book.horstman.java.core.chapter9.pg465;

import java.util.Objects;

/**
 * Описание изделия и его номер по каталогу
 */
public class Item implements Comparable<Item>{
    private  String description;
    private int partNumber;

    /**
     * Конструирует объект изделия
     *
     * @param description Описание изделия
     * @param partNumber Номер изделия по каталогу
     */
    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    /**
     * Получает описание данного изделия
     *
     * @return Описание изделия
     */
    public String getDescription(){
        return description;
    }

    public String toString(){
        return "[descripion = " + description + ", partNumber = "+ partNumber + "] ";
    }
    
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other =(Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode(){
        return Objects.hash(description,partNumber);
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber,o.partNumber);
        return diff != 0 ? diff:description.compareTo(o.description);
    }
}
