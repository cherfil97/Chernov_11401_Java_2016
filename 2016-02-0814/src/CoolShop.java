/**
 * Created by cherfil97 on 12.02.16.
 */
public class CoolShop implements CityShop {

    public int products;
    public String nameOfProduct;
    public String frozenProduct;

    @Override
    public int getProducts() {
        System.out.println("Принять продукты");
        return 0;
    }

    @Override
    public int sellProducts() {
        System.out.println("Продать продукты");
        return 0;
    }

    @Override
    public String freezingProducts() {
        System.out.println("Заморозить продукты");
        return null;
    }
}
