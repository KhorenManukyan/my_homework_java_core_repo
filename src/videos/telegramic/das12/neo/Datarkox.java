package videos.telegramic.das12.neo;

import java.util.Iterator;

public class Datarkox implements Iterator {

    /*bah klyuch eiminch miban chaynik*/
    StringBuilder stringBuilder;
    int start;
    int end;

    public Datarkox(String stringBuilder) {
        this.stringBuilder = new StringBuilder(stringBuilder);
    }

    @Override
    public boolean hasNext() {
        if (end != stringBuilder.length() - 1) {
            start = end == 0 ?
                    0 :
                    stringBuilder.indexOf(" ", end);
            end = stringBuilder.indexOf(" ", start + 1) <= 0 ?
                    stringBuilder.length() - 1 :
                    stringBuilder.indexOf(" ", start + 1);
            return start >= 0;
        }
        return false;
    }

    @Override
    public Object next() {
        String st = stringBuilder.substring(start,end);
        return st.trim();
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}











