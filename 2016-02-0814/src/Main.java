/**
 * Created by cherfil97 on 12.02.16.
 */
public class Main {

    public static void main(String[] args) {

        CoolShop magnit = new CoolShop();

        magnit.freezingProducts();
        magnit.getProducts();
        magnit.sellProducts();

        CoolFactory chuvashFactory = new CoolFactory();
        chuvashFactory.createMaterials();
        chuvashFactory.metalProcessing();
        chuvashFactory.recycleGarbage();

        CoolHospital chuvashHospital = new CoolHospital();
        chuvashHospital.doSurgeryPeople();
        chuvashHospital.healPeople();
        chuvashFactory.createMaterials();

        CoolParking chuvashParking = new CoolParking();
        chuvashParking.comeToParking();
        chuvashParking.exitOfParking();
        chuvashParking.payParking();

        CoolSchool chuvashSchool = new CoolSchool();
        chuvashSchool.deductChild();
        chuvashSchool.giveSchoolClothes();
        chuvashSchool.teachChild();

        Populating actionsPopulating = new Populating();
        actionsPopulating.closePeople();
        actionsPopulating.connectPeopleFromOtherCity();
        actionsPopulating.evacuatePeople();

        Provision actionsProvision = new Provision();
        actionsProvision.buildHouse();
        actionsProvision.buildRoad();
        actionsProvision.conductElectricity();

    }
}