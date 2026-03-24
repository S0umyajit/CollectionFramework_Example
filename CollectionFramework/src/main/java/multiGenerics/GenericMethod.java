package multiGenerics;

class ShowItem{

    public <T> void show(T item){
        System.out.println(item);
    }

    public <T,V> String shows(T item, V value){
        return item+" "+value;
    }
}
public class GenericMethod {

    public static void main(String[] args) {

        ShowItem showItem=new ShowItem();

        showItem.show(12);

        System.out.println(showItem.shows(12,234));
    }
}
