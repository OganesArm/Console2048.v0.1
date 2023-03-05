import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a1=0,a2=0,a3=0,a4=0,a5=0,
                b1=0,b2=0,b3=0,b4=0,b5=0,
                c1=0,c2=0,c3=0,c4=0,c5=0,
                d1=0,d2=0,d3=0,d4=0,d5=0,
                e1=0,e2=0,e3=0,e4=0,e5=0;
        System.out.println("\nДобро пожаловать в консольную 2048.\nУдачной игры!");
        Arena.time(3000);
        Arena.arena(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

    }
}
class Arena {

    public static void arena(int a1, int a2, int a3,int a4,int a5,int b1,int b2,int b3,int b4,int b5,int c1,int c2,int c3,
                             int c4,int c5,int d1,int d2,int d3, int d4, int d5, int e1,int e2,int e3,int e4,int e5){
        //System.out.println("Здесь arena\n");
        randOneTime(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
    }

    public static void randOneTime(int a1, int a2, int a3,int a4,int a5,int b1,int b2,int b3,int b4,int b5,int c1,int c2,int c3,
                                   int c4,int c5,int d1,int d2,int d3, int d4, int d5, int e1,int e2,int e3,int e4,int e5){
        Random random = new Random();
        int i = random.nextInt(1,10);
        if (i==1){
                a1=2; c4=2; e1=2; a4=2;b5=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }if (i==2){
                a2=2; a1=2; e4=2; c2=2;b5=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }if (i==3){
                a3=2; d2=2; e1=2; c3=2;b2=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }if (i==4){
                b1=2; d1=2; e5=2; c1=2;b5=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }if (i==5){
                b2=2; a1=2; a3=2; e3=2;b1=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }if (i==6){
                b3=2; d1=2; e4=2; a1=2;b5=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }if (i==7){
                c1=2; e5=2; a4=2; b5=2;b2=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }if (i==8){
                c2=2; a4=2; c3=2; b1=2;b5=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }if (i==9){
                c3=2; a1=2; d1=2; e3=2;b1=2;
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }
    }
    public static void rand(int a1, int a2, int a3,int a4,int a5,int b1,int b2,int b3,int b4,int b5,int c1,int c2,int c3,
                            int c4,int c5,int d1,int d2,int d3, int d4, int d5, int e1,int e2,int e3,int e4,int e5){
        Random random = new Random();
        int i = random.nextInt(1,25);
        //System.out.println(i+"\n");

        if (i==1){
            if (a1==0){
                a1=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==2){
            if (a2==0){
                a2=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==3){
            if (a3==0){
                a3=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==4){
            if (a4==0){
                a4=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==5){
            if (a5==0){
                a5=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==6){
            if (b1==0){
                b1=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==7){
            if (b2==0){
                b2=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==8){
            if (b3==0){
                b3=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==9){
            if (b4==0){
                b4=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==10){
            if (b5==0){
                b5=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==11){
            if (c1==0){
                c1=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==12){
            if (c2==0){
                c2=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==13){
            if (c3==0){
                c3=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==14){
            if (c4==0){
                c4=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==15){
            if (c5==0){
                c5=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==16){
            if (d1==0){
                d1=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==16){
            if (d2==0){
                d2=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==17){
            if (d3==0){
                d3=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==18){
            if (d4==0){
                d4=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==19){
            if (d5==0){
                d5=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==20){
            if (e1==0){
                e1=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==21){
            if (e2==0){
                e2=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==22){
            if (e3==0){
                e3=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==23){
            if (e4==0){
                e4=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }if (i==24){
            if (e5==0){
                e5=2;
                menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }else{
                rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
            }
        }

        else {
            System.out.println("КОНЕЦ ИГРЫ");
        }

    }
    public static void menu(int a1, int a2, int a3,int a4,int a5,int b1,int b2,int b3,int b4,int b5,int c1,int c2,int c3,
                            int c4,int c5,int d1,int d2,int d3, int d4, int d5, int e1,int e2,int e3,int e4,int e5) {
        String q = "  ";
        System.out.println(a1+q+a2+q+a3+q+a4+q+a5+"\n"+b1+q+b2+q+b3+q+b4+q+b5+"\n"+c1+q+c2+q+c3+q+c4+q+c5+"\n"+
                d1+q+d2+q+d3+q+d4+q+d5+"\n"+e1+q+e2+q+e3+q+e4+q+e5);
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nСделайте выбор хода.\nХод вврх 8\nХод вниз 2\nХод вправо 6\nХод влево 4");


        String i = scanner.next();
        if (i.equals("2") | i.equals("4") | i.equals("6") | i.equals("8")){
            int select = Integer.parseInt(i);
            question(select,a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }else{
            System.out.println("\nНе правильный ввод!\nПожалуйста, будьте внимательны...\n\n");
            time(2000);
            menu(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }
        scanner.close();

    }


    public static void question(int select, int a1, int a2, int a3,int a4,int a5,int b1,int b2,int b3,int b4,int b5,int c1,int c2,int c3,
                                int c4,int c5,int d1,int d2,int d3, int d4, int d5, int e1,int e2,int e3,int e4,int e5){
        System.out.println("Здесь территория question");

        //region ↓ ↓ ↓ ↓ ↓ ↓

        if(select==2){

            // Сдвиг вниз всех
            for (int i = 0; i <5 ; i++) {
                // 1
                if (b1==0) {
                    b1 = a1;
                    a1 = 0;
                } if(c1==0){
                    c1=b1;
                    b1=0;
                } if(d1==0){
                    d1=c1;
                    c1=0;
                } if(e1==0){
                    e1=d1;
                    d1=0;
                }
                // 2
                if(b2==0){
                    b2=a2;
                    a2=0;
                } if (c2==0){
                    c2=b2;
                    b2=0;
                } if (d2==0){
                    d2=c2;
                    c2=0;
                } if (e2==0){
                    e2=d2;
                    d2=0;
                }
                //C
                if(b3==0){
                    b3=a3;
                    a3=0;
                } if (c3==0){
                    c3=b3;
                    b3=0;
                } if (d3==0){
                    d3=c3;
                    c3=0;
                } if (e3==0){
                    e3=d3;
                    d3=0;
                }
                //D
                if(b4==0){
                    b4=a4;
                    a4=0;
                } if (c4==0){
                    c4=b4;
                    b4=0;
                } if (d4==0){
                    d4=c4;
                    c4=0;
                } if (e4==0){
                    e4=d4;
                    d4=0;
                }
                //E
                if(b5==0){
                    b5=a5;
                    a5=0;
                } if (c5==0){
                    c5=b5;
                    b5=0;
                } if (d5==0){
                    d5=c5;
                    c5=0;
                } if (e5==0){
                    e5=d5;
                    d5=0;
                }
            }

            //region работа с 1

            if (e1==d1) {
                e1 = e1 * 2;
                d1 = 0;
            } if (d1==c1){
                d1=d1*2;
                c1=0;
            } if (c1==b1){
                c1=c1*2;
                b1=0;
            } if (b1==a1){
                b1=b1*2;
                a1=0;
            }
            //endregion
            //region работа с 2
            if (e2==d2) {
                e2 = e2 * 2;
                d2 = 0;
            } if (d2==c2){
                d2=d2*2;
                c2=0;
            } if (c2==b2){
                c2=c2*2;
                b2=0;
            } if (b2==a2){
                b2=b2*2;
                a2=0;
            }
            //endregion
            //region работа с 3
            if (e3==d3) {
                e3 = e3 * 2;
                d3 = 0;
            } if (d3==c3){
                d3=d3*2;
                c3=0;
            } if (c3==b3){
                c3=c3*2;
                b3=0;
            } if (b3==a3){
                b3=b3*2;
                a3=0;
            }
            //endregion
            //region работа с 4
            if (e4==d4) {
                e4 = e4 * 2;
                d4 = 0;
            } if (d4==c4){
                d4=d4*2;
                c4=0;
            } if (c4==b4){
                c4=c4*2;
                b4=0;
            } if (b4==a4){
                b4=b4*2;
                a4=0;
            }
            //endregion
            //region работа с 5
            if (e5==d5) {
                e5 = e5 * 2;
                d5 = 0;
            } if (d5==c5){
                d5=d5*2;
                c5=0;
            } if (c5==b5){
                c5=c5*2;
                b5=0;
            } if (b5==a5){
                b5=b5*2;
                a5=0;
            }
            //endregion

            // Сдвиг вниз всех
            for (int i = 0; i <5 ; i++) {
                // 1
                if (b1==0) {
                    b1 = a1;
                    a1 = 0;
                } if(c1==0){
                    c1=b1;
                    b1=0;
                } if(d1==0){
                    d1=c1;
                    c1=0;
                } if(e1==0){
                    e1=d1;
                    d1=0;
                }
                // 2
                if(b2==0){
                    b2=a2;
                    a2=0;
                } if (c2==0){
                    c2=b2;
                    b2=0;
                } if (d2==0){
                    d2=c2;
                    c2=0;
                } if (e2==0){
                    e2=d2;
                    d2=0;
                }
                //C
                if(b3==0){
                    b3=a3;
                    a3=0;
                } if (c3==0){
                    c3=b3;
                    b3=0;
                } if (d3==0){
                    d3=c3;
                    c3=0;
                } if (e3==0){
                    e3=d3;
                    d3=0;
                }
                //D
                if(b4==0){
                    b4=a4;
                    a4=0;
                } if (c4==0){
                    c4=b4;
                    b4=0;
                } if (d4==0){
                    d4=c4;
                    c4=0;
                } if (e4==0){
                    e4=d4;
                    d4=0;
                }
                //E
                if(b5==0){
                    b5=a5;
                    a5=0;
                } if (c5==0){
                    c5=b5;
                    b5=0;
                } if (d5==0){
                    d5=c5;
                    c5=0;
                } if (e5==0){
                    e5=d5;
                    d5=0;
                }
            }

            rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }

        // endregion

        //region       <<<--------

        if(select==4){

            //Сдвиги влево всех
            for (int i = 0; i <5 ; i++) {
                // A
                if (a4==0) {
                    a4 = a5;
                    a5 = 0;
                } if(a3==0){
                    a3=a4;
                    a4=0;
                } if(a2==0){
                    a2=a3;
                    a3=0;
                } if(a1==0){
                    a1=a2;
                    a2=0;
                }
                //B
                if(b4==0){
                    b4=b5;
                    b5=0;
                } if (b3==0){
                    b3=b4;
                    b4=0;
                } if (b2==0){
                    b2=b3;
                    b3=0;
                } if (b1==0){
                    b1=b2;
                    b2=0;
                }
                //C
                if(c4==0){
                    c4=c5;
                    c5=0;
                } if (c3==0){
                    c3=c4;
                    c4=0;
                } if (c2==0){
                    c2=c3;
                    c3=0;
                } if (c1==0){
                    c1=c2;
                    c2=0;
                }
                //D
                if(d4==0){
                    d4=d5;
                    d5=0;
                } if (d3==0){
                    d3=d4;
                    d4=0;
                } if (d2==0){
                    d2=d3;
                    d3=0;
                } if (d1==0){
                    d1=d2;
                    d2=0;
                }
                //E
                if(e4==0){
                    e4=e5;
                    e5=0;
                } if (e3==0){
                    e3=e4;
                    e4=0;
                } if (e2==0){
                    e2=e3;
                    e3=0;
                } if (e1==0){
                    e1=e2;
                    e2=0;
                }
            }

            //region работа с А
            if (a1==a2){
                a1=a2*2;
                a2=0;
            }
            if (a2==a3){
                a2=a3*2;
                a3=0;
            }
            if (a3==a4){
                a3=a3*2;
                a4=0;
            }
            if (a4==a5){
                a4=a4*2;
                a5=0;
            }
            //endregion

            //region работа с B
            if (b1==b2){
                b1=b2*2;
                b2=0;
            }
            if (b2==b3){
                b2=b3*2;
                b3=0;
            }
            if (b3==b4){
                b3=b3*2;
                b4=0;
            }
            if (b4==b5){
                b4=b4*2;
                b5=0;
            }
            //endregion

            //region работа с C
            if (c1==c2){
                c1=c2*2;
                c2=0;
            }
            if (c2==c3){
                c2=c3*2;
                c3=0;
            }
            if (c3==c4){
                c3=c3*2;
                c4=0;
            }
            if (c4==c5){
                c4=c4*2;
                c5=0;
            }
            //endregion

            //region работа с D
            if (d1==d2){
                d1=d2*2;
                d2=0;
            }
            if (d2==d3){
                d2=d3*2;
                d3=0;
            }
            if (d3==d4){
                d3=d3*2;
                d4=0;
            }
            if (d4==d5){
                d4=d4*2;
                d5=0;
            }
            //endregion

            //region работа с E
            if (e1==e2){
                e1=e2*2;
                e2=0;
            }
            if (e2==e3){
                e2=e3*2;
                e3=0;
            }
            if (e3==e4){
                e3=e3*2;
                e4=0;
            }
            if (e4==e5){
                e4=e4*2;
                e5=0;
            }
            //endregion

            //Сдвиги влево всех
            for (int i = 0; i <5 ; i++) {
                // A
                if (a4==0) {
                    a4 = a5;
                    a5 = 0;
                } if(a3==0){
                    a3=a4;
                    a4=0;
                } if(a2==0){
                    a2=a3;
                    a3=0;
                } if(a1==0){
                    a1=a2;
                    a2=0;
                }
                //B
                if(b4==0){
                    b4=b5;
                    b5=0;
                } if (b3==0){
                    b3=b4;
                    b4=0;
                } if (b2==0){
                    b2=b3;
                    b3=0;
                } if (b1==0){
                    b1=b2;
                    b2=0;
                }
                //C
                if(c4==0){
                    c4=c5;
                    c5=0;
                } if (c3==0){
                    c3=c4;
                    c4=0;
                } if (c2==0){
                    c2=c3;
                    c3=0;
                } if (c1==0){
                    c1=c2;
                    c2=0;
                }
                //D
                if(d4==0){
                    d4=d5;
                    d5=0;
                } if (d3==0){
                    d3=d4;
                    d4=0;
                } if (d2==0){
                    d2=d3;
                    d3=0;
                } if (d1==0){
                    d1=d2;
                    d2=0;
                }
                //E
                if(e4==0){
                    e4=e5;
                    e5=0;
                } if (e3==0){
                    e3=e4;
                    e4=0;
                } if (e2==0){
                    e2=e3;
                    e3=0;
                } if (e1==0){
                    e1=e2;
                    e2=0;
                }
            }

            rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);
        }
//endregion

        //region         -------->>>

        if(select==6){

                //Сдвиги вправо всех
            for (int i = 0; i <5 ; i++) {
                // A
                if(a2==0){
                    a2=a1;
                    a1=0;
                } if (a3==0){
                    a3=a2;
                    a2=0;
                } if (a4==0){
                    a4=a3;
                    a3=0;
                } if (a5==0){
                    a5=a4;
                    a4=0;
                }
                //B
                if(b2==0){
                    b2=b1;
                    b1=0;
                } if (b3==0){
                    b3=b2;
                    b2=0;
                } if (b4==0){
                    b4=b3;
                    b3=0;
                } if (b5==0){
                    b5=b4;
                    b4=0;
                }
                //C
                if(c2==0){
                    c2=c1;
                    c1=0;
                } if (c3==0){
                    c3=c2;
                    c2=0;
                } if (c4==0){
                    c4=c3;
                    c3=0;
                } if (c5==0){
                    c5=c4;
                    c4=0;
                }
                //D
                if(d2==0){
                    d2=d1;
                    d1=0;
                } if (d3==0){
                    d3=d2;
                    d2=0;
                } if (d4==0){
                    d4=d3;
                    d3=0;
                } if (d5==0){
                    d5=d4;
                    d4=0;
                }
                //E
                if(e2==0){
                    e2=e1;
                    e1=0;
                } if (e3==0){
                    e3=e2;
                    e2=0;
                } if (e4==0){
                    e4=e3;
                    e3=0;
                } if (e5==0){
                    e5=e4;
                    e4=0;
                }
            }


            //region работа с А
            if (a4==a5){
                a5=a5*2;
                a4=0;
            }
            if (a3==a4){
                a4=a4*2;
                a3=0;
            }
            if (a2==a3){
                a3=a3*2;
                a2=0;
            }
            if (a1==a2){
                a2=a2*2;
                a1=0;
            }
            //endregion
            //region работа с B
            if (b4==b5){
                b5=b5*2;
                b4=0;
            }
            if (b3==b4){
                b4=b4*2;
                b3=0;
            }
            if (b2==b3){
                b3=b3*2;
                b2=0;
            }
            if (b1==b2){
                b2=b2*2;
                b1=0;
            }
            //endregion
            //region работа с C
            if (c4==c5){
                c5=c5*2;
                c4=0;
            }
            if (c3==c4){
                c4=c4*2;
                c3=0;
            }
            if (c2==c3){
                c3=c3*2;
                c2=0;
            }
            if (c1==c2){
                c2=c2*2;
                c1=0;
            }
            //endregion
            //region работа с D
            if (d4==d5){
                d5=d5*2;
                d4=0;
            }
            if (d3==d4){
                d4=d4*2;
                d3=0;
            }
            if (d2==d3){
                d3=d3*2;
                d2=0;
            }
            if (d1==d2){
                d2=d2*2;
                d1=0;
            }
            //endregion
            //region работа с E
            if (e4==e5){
                e5=e5*2;
                e4=0;
            }
            if (e3==e4){
                e4=e4*2;
                e3=0;
            }
            if (e2==e3){
                e3=e3*2;
                e2=0;
            }
            if (e1==e2){
                e2=e2*2;
                e1=0;
            }
            //endregion

            //Сдвиги вправо всех
            for (int i = 0; i <5 ; i++) {
                // A
                if(a2==0){
                    a2=a1;
                    a1=0;
                } if (a3==0){
                    a3=a2;
                    a2=0;
                } if (a4==0){
                    a4=a3;
                    a3=0;
                } if (a5==0){
                    a5=a4;
                    a4=0;
                }
                //B
                if(b2==0){
                    b2=b1;
                    b1=0;
                } if (b3==0){
                    b3=b2;
                    b2=0;
                } if (b4==0){
                    b4=b3;
                    b3=0;
                } if (b5==0){
                    b5=b4;
                    b4=0;
                }
                //C
                if(c2==0){
                    c2=c1;
                    c1=0;
                } if (c3==0){
                    c3=c2;
                    c2=0;
                } if (c4==0){
                    c4=c3;
                    c3=0;
                } if (c5==0){
                    c5=c4;
                    c4=0;
                }
                //D
                if(d2==0){
                    d2=d1;
                    d1=0;
                } if (d3==0){
                    d3=d2;
                    d2=0;
                } if (d4==0){
                    d4=d3;
                    d3=0;
                } if (d5==0){
                    d5=d4;
                    d4=0;
                }
                //E
                if(e2==0){
                    e2=e1;
                    e1=0;
                } if (e3==0){
                    e3=e2;
                    e2=0;
                } if (e4==0){
                    e4=e3;
                    e3=0;
                } if (e5==0){
                    e5=e4;
                    e4=0;
                }
            }

            rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }

//endregion

        //region ↑ ↑ ↑ ↑ ↑ ↑
        if(select==8){

            // Сдвиг вверх всех
            for (int i = 0; i <5 ; i++) {
                // 1
                if (d1==0) {
                    d1 = e1;
                    e1 = 0;
                } if(c1==0){
                    c1=d1;
                    d1=0;
                } if(b1==0){
                    b1=c1;
                    c1=0;
                } if(a1==0){
                    a1=b1;
                    b1=0;
                }
                // 2
                if (d2==0) {
                    d2 = e2;
                    e2 = 0;
                } if(c2==0){
                    c2=d2;
                    d2=0;
                } if(b2==0){
                    b2=c2;
                    c2=0;
                } if(a2==0){
                    a2=b2;
                    b2=0;
                }
                // 3
                if (d3==0) {
                    d3 = e3;
                    e3 = 0;
                } if(c3==0){
                    c3=d3;
                    d3=0;
                } if(b3==0){
                    b3=c3;
                    c3=0;
                } if(a3==0){
                    a3=b3;
                    b3=0;
                }
                // 4
                if (d4==0) {
                    d4 = e4;
                    e4 = 0;
                } if(c4==0){
                    c4=d4;
                    d4=0;
                } if(b4==0){
                    b4=c4;
                    c4=0;
                } if(a4==0){
                    a4=b4;
                    b4=0;
                }
                // 5
                if (d5==0) {
                    d5 = e5;
                    e5 = 0;
                } if(c5==0){
                    c5=d5;
                    d5=0;
                } if(b5==0){
                    b5=c5;
                    c5=0;
                } if(a5==0){
                    a5=b5;
                    b5=0;
                }
            }

            //region работа с 1

            if (a1==b1) {
                a1 = a1 * 2;
                b1 = 0;
            } if (b1==c1){
                b1=b1*2;
                c1=0;
            } if (c1==d1){
                c1=c1*2;
                d1=0;
            } if (d1==e1){
                d1=b1*2;
                e1=0;
            }
            //endregion
            //region работа с 2
            if (a2==b2) {
                a2 = a2 * 2;
                b2 = 0;
            } if (b2==c2){
                b2=b2*2;
                c2=0;
            } if (c2==d2){
                c2=c2*2;
                d2=0;
            } if (d2==e2){
                d2=b2*2;
                e2=0;
            }
            //endregion
            //region работа с 3

            if (a3==b3) {
                a3 = a3 * 2;
                b3 = 0;
            } if (b3==c3){
                b3=b3*2;
                c3=0;
            } if (c3==d3){
                c3=c3*2;
                d3=0;
            } if (d3==e3){
                d3=b3*2;
                e3=0;
            }
            //endregion
            //region работа с 4

            if (a4==b4) {
                a4 = a4 * 2;
                b4 = 0;
            } if (b4==c4){
                b4=b4*2;
                c4=0;
            } if (c4==d4){
                c4=c4*2;
                d4=0;
            } if (d4==e4){
                d4=b4*2;
                e4=0;
            }
            //endregion
            //region работа с 5

            if (a5==b5) {
                a5 = a5 * 2;
                b5 = 0;
            } if (b5==c5){
                b5=b5*2;
                c5=0;
            } if (c5==d5){
                c5=c5*2;
                d5=0;
            } if (d5==e5){
                d5=b5*2;
                e5=0;
            }
            //endregion
            // Сдвиг вверх всех
            for (int i = 0; i <5 ; i++) {
                // 1
                if (d1==0) {
                    d1 = e1;
                    e1 = 0;
                } if(c1==0){
                    c1=d1;
                    d1=0;
                } if(b1==0){
                    b1=c1;
                    c1=0;
                } if(a1==0){
                    a1=b1;
                    b1=0;
                }
                // 2
                if (d2==0) {
                    d2 = e2;
                    e2 = 0;
                } if(c2==0){
                    c2=d2;
                    d2=0;
                } if(b2==0){
                    b2=c2;
                    c2=0;
                } if(a2==0){
                    a2=b2;
                    b2=0;
                }
                // 3
                if (d3==0) {
                    d3 = e3;
                    e3 = 0;
                } if(c3==0){
                    c3=d3;
                    d3=0;
                } if(b3==0){
                    b3=c3;
                    c3=0;
                } if(a3==0){
                    a3=b3;
                    b3=0;
                }
                // 4
                if (d4==0) {
                    d4 = e4;
                    e4 = 0;
                } if(c4==0){
                    c4=d4;
                    d4=0;
                } if(b4==0){
                    b4=c4;
                    c4=0;
                } if(a4==0){
                    a4=b4;
                    b4=0;
                }
                // 5
                if (d5==0) {
                    d5 = e5;
                    e5 = 0;
                } if(c5==0){
                    c5=d5;
                    d5=0;
                } if(b5==0){
                    b5=c5;
                    c5=0;
                } if(a5==0){
                    a5=b5;
                    b5=0;
                }
            }

            rand(a1,a2,a3,a4,a5,b1,b2,b3,b4,b5,c1,c2,c3,c4,c5,d1,d2,d3,d4,d5,e1,e2,e3,e4,e5);

        }
        // endregion

    }

    public static void time(int i){
        try{
            Thread.sleep(i);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}




