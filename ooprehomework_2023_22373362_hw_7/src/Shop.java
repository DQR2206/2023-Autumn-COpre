public class Shop {
    //独有属性汇总
    private int allbotcapacity;
    private int allequstar;
    private int allfoodenergy;

    //价格属性汇总
    private long allbotprice;
    private long allequprice;
    private long allfoodprice;
    //个数汇总
    private int botcnt;
    private int equcnt;
    private int foodcnt;

    private Shop() {
        this.allbotcapacity = 0;
        this.allequstar = 0;
        this.allfoodenergy = 0;
        this.allbotprice = 0;
        this.allequprice = 0;
        this.allfoodprice = 0;
        this.equcnt = 0;
        this.botcnt = 0;
        this.foodcnt = 0;
    }

    private static Shop shop = new Shop(); //饿汉式

    public static Shop getInstance() {
        return shop;
    }

    public void addallbotcapacity(int capacity) {
        this.allbotcapacity = this.allbotcapacity + capacity;
    }

    public void addallequstar(int star) {
        this.allequstar = this.allequstar + star;
    }

    public void addallfoodenergy(int energy) {
        this.allfoodenergy = this.allfoodenergy + energy;
    }

    public void addallbotprice(long price) {
        this.allbotprice = this.allbotprice + price;
    }

    public void addallequprice(long price) {
        this.allequprice = this.allequprice + price;
    }

    public void addallfoodprice(long price) {
        this.allfoodprice = this.allfoodprice + price;
    }

    public void addbotcnt() {
        this.botcnt++;
    }

    public void addequcnt() {
        this.equcnt++;
    }

    public void addfoodcnt() {
        this.foodcnt++;
    }

    //计算药水瓶
    public long botaverageprice() {
        return (long)(this.allbotprice / this.botcnt);
    }

    public int botaveragecapacity() {
        return (int)(this.allbotcapacity / this.botcnt);
    }

    //计算装备
    public long equaverageprice() {
        return (long)(this.allequprice / this.equcnt);
    }

    public int equaveragestar() {
        return (int)(this.allequstar / this.equcnt);
    }

    //计算食物
    public long foodaverageprice() {
        return (long)(this.allfoodprice / this.foodcnt);
    }

    public int foodaverageenergy() {
        return (int)(this.allfoodenergy / this.foodcnt);
    }
}

//对于商店这个单例模式我一开始的理解是错误的，经过何老师的点拨我明白了对于卖买记录其实只需要记录一下属性之和进行计算而不是需要像figghtlog一样建立起实例
//在商店买东西的过程才是一个真正的“创建”对象的过程、这个时候才用到工厂模式