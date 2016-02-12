/**
 * Created by cherfil97 on 12.02.16.
 */
public class CoolHospital implements CityHospital {


    public String disease;
    public int age;
    public int daysOfHealing;

    @Override
    public String registerPeople() {
        System.out.println("Регистрация людей");
        return null;
    }

    @Override
    public void healPeople() {
        System.out.println("Вылечить людей");
    }

    @Override
    public void doSurgeryPeople() {
        System.out.println("Сделать операцию");
    }
}
