public interface Commodity {
    //接口中不定义属性，定义实现该接口的所有类的共同方法,实现接口的类中进行覆写
    public long getPrice();

    public int getId();

    public String getName();

}