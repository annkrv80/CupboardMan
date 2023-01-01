public class OpenCupboard{

    public void open(Cupboard cup, Man name){
        System.out.println(name + " открой шкаф!");
        if(cup.getLock()==name.getKey()){
            System.out.println("Ура!!! Ключ найден!!!");
            cup.setStatus("открыт");
            System.out.println("Шкаф № " + cup.getNumber() + " " + cup.getStatus());
        }
        else{
            System.out.print("Упс...Ключ неподходит");
        }


    }

}