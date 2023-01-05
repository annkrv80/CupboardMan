public class CloseCupboard {

    public void close(Cupboard cup, Man name) {
        System.out.println(name.getName() + "  Закрой шкаф!!!!");
        if (name.getKey()=="Есть") {
            cup.setStatus("закрыт");
            System.out.println("Шкаф № " + cup.getNumber() + " " + cup.getStatus());
        } else {
            System.out.println("Ищи ключ!");
        }
    }

}
