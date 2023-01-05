public class OpenCupboard {

    public void open(Cupboard cup, Man name) {
        System.out.println(name + " открой шкаф!");
        if (name.getKey()=="Есть") {
            cup.setStatus("открыт");
            System.out.println("Шкаф № " + cup.getNumber() + " " + cup.getStatus());
        } else {
            System.out.print("Упс...нет ключа!");
        }

    }

}