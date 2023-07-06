package demo5;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:35
 */
public abstract class Che {
    //属性：品牌、价格
    public String name;
    public double price;

    public Che() {
    }

    public Che(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void run() {
        System.out.println("跑");
    }

    ;
}
