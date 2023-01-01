public class Main {
    public static void main(String[] args) {
        Cupboard cupboard=new Cupboard(1);
        cupboard.setStatus("закрыт");
        System.out.println(cupboard);
        Man andrey=new Man("Андрей");
        

        if(cupboard.getStatus()=="закрыт"){
            OpenCupboard openCupboard=new OpenCupboard();
            openCupboard.open(cupboard, andrey);
        }
        else if (cupboard.getStatus()=="открыт"){
            CloseCupboard closeCupboard=new CloseCupboard();
            closeCupboard.close(cupboard, andrey);
        }
    }
    
}