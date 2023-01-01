public class CloseCupboard {

    public void close(Cupboard cup, Man name) {
        System.out.println(name.getName() + "  Закрой шкаф!!!!");
        if (cup.getLock() == name.getKey()) {
            cup.setStatus("закрыт");
            System.out.println("Шкаф № " + cup.getNumber() + " " + cup.getStatus());
        } else {
            System.out.println("Ключ неподходит! Попробуй еще раз!");
        }
    }

}
