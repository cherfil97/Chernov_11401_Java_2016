/**
 * Created by cherfil97 on 12.02.16.
 */
public class CoolSchool implements CitySchool {

    public int ageOfChild;
    public String books;
    public String brandOfClothes;

    @Override
    public void teachChild() {
        System.out.println("Учить детей");
    }

    @Override
    public void deductChild() {
        System.out.println("Отчислить ребенка");
    }

    @Override
    public void giveSchoolClothes() {
        System.out.println("Дать школьную форму");
    }
}
