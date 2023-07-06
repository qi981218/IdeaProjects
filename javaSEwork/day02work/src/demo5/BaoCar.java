package demo5;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 19:38
 */
public class BaoCar extends Car implements Gps {
    public BaoCar() {
    }

    public BaoCar(String name, double price) {
        super(name, price);
    }

    @Override
    public void gps() {
        System.out.println("具有gps");
    }
}
