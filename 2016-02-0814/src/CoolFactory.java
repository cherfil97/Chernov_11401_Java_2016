/**
 * Created by cherfil97 on 12.02.16.
 */
public class CoolFactory implements CityFactory {

    public int workers = 300;
    public int garbageCount = 100;
    public int materialCount = 50;
    public String name;

    @Override
    public void recycleGarbage() {
        System.out.println("Переработать мусор");
    }

    @Override
    public void createMaterials() {
        System.out.println("Создать сырье");
    }

    @Override
    public void metalProcessing() {
        System.out.println("Обработать металл");
    }
}
