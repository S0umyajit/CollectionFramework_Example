package weakHashMapEx;

import java.util.WeakHashMap;

/**
 * Example of weak Hashmap
 */
public class Test {
    public static void main(String[] args) {

//        String key1=new String("img1");
//        String key2=new String("img2");
        WeakHashMap<String,Image> imageCache=new WeakHashMap<>();
//        imageCache.put("img1",new Image("image1"));
//        imageCache.put("img2",new Image("image2"));

//        imageCache.put(key1,new Image("image1"));
//        imageCache.put(key2,new Image("image2"));
        imageCache.put(new String("img1"),new Image("image1"));
        imageCache.put(new String("img2"),new Image("image2"));
        System.out.println(imageCache);
        /**
         * Here we are manually putting the reference to null
         * so that garbage collector can clear it out
         * but we don't use this in PROD
         */
//        key1=null;
//        key2=null;
        System.gc();
        simulateAppRunn();
        System.out.println(imageCache);
        System.out.println("Simulate Application run END");

    }

    public static void simulateAppRunn(){
        try{
            System.out.println("Simulate Application Running");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class Image{
    public String name;

    Image(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
