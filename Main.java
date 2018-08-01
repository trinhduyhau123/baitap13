package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner scanner = new Scanner(System.in);
        int so = scanner.nextInt();
        switch (so){
            case 1:{
                System.out.println("one");
                break;
            }
            case 2:{
                System.out.println("two");
                break;
            }
            case 3:{
                System.out.println("three");
                break;
            }
            case 4:{
                System.out.println("four");
                break;
            }
            case 5:{
                System.out.println("five");
                break;
            }
            case 6:{
                System.out.println("six");
                break;
            }
            case 7:{
                System.out.println("seven");
                break;
            }
            case 8:{
                System.out.println("eight");
                break;
            }
            case 9:{
                System.out.println("nice");
                break;
            }
            case 10: {
                System.out.println("ten");
            }
        }
       if(so>10 && so <20) {
           so %= 10;
           switch (so) {
               case 0: {
                   System.out.println("teuwnty");
               }
               case 1: {
                   System.out.println("elevent");
                   break;
               }
               case 2: {
                   System.out.println("twiele");
                   break;
               }
               case 3: {
                   System.out.println("thirteen");
                   break;
               }
               case 4: {
                   System.out.println("fourteen");
                   break;
               }
               case 5: {
                   System.out.println("fivteen");
                   break;
               }
               case 6: {
                   System.out.println("sixteen");
                   break;
               }
               case 7: {
                   System.out.println("seventeen");
                   break;
               }
               case 8: {
                   System.out.println("eighteen");
                   break;
               }
               case 9: {
                   System.out.println("niceteen");
                   break;
               }
           }
       }
            if(so<100 && so>20){
                int sodonvi = so%10;
                int sochuc = (so-sodonvi)/10;
                switch (sochuc){

                    case 2:{
                        System.out.println("twiele");
                        break;
                    }
                    case 3:{
                        System.out.println("thirty");
                        break;
                    }
                    case 4:{
                        System.out.println("fourty");
                        break;
                    }
                    case 5:{
                        System.out.println("fivty");
                        break;
                    }
                    case 6:{
                        System.out.println("sixty");
                        break;
                    }
                    case 7:{
                        System.out.println("seventy");
                        break;
                    }
                    case 8:{
                        System.out.println("eighty");
                        break;
                    }
                    case 9:{
                        System.out.println("nicety");
                        break;
                    }
                }

                switch (sodonvi){
                    case 1:{
                        System.out.println("one");
                        break;
                    }
                    case 2:{
                        System.out.println("two");
                        break;
                    }
                    case 3:{
                        System.out.println("three");
                        break;
                    }
                    case 4:{
                        System.out.println("four");
                        break;
                    }
                    case 5:{
                        System.out.println("five");
                        break;
                    }
                    case 6:{
                        System.out.println("six");
                        break;
                    }
                    case 7:{
                        System.out.println("seven");
                        break;
                    }
                    case 8:{
                        System.out.println("eight");
                        break;
                    }
                    case 9:{
                        System.out.println("nice");
                        break;
                    }
                }


                }

            if(so>99 && so <1000) {
                int sodonvi = so % 100;
                int sodonvi2 = sodonvi%10;
                int sochuc = sodonvi/10;
                int sotram = so/100;
                if(so%100==0){
                    switch (sotram){
                        case 1:{
                            System.out.println("one hurdert");
                            break;
                        }
                        case 2:{
                            System.out.println("two hurdert");
                            break;
                        }
                        case 3:{
                            System.out.println("three hurdert");
                            break;
                        }
                        case 4:{
                            System.out.println("four hurdert");
                            break;
                        }
                        case 5:{
                            System.out.println("five hurdert");
                            break;
                        }
                        case 6:{
                            System.out.println("six hurdert");
                            break;
                        }
                        case 7:{
                            System.out.println("seven hurdert");
                            break;
                        }
                        case 8:{
                            System.out.println("eight hurdert");
                            break;
                        }
                        case 9:{
                            System.out.println("nice hurdert");
                            break;
                        }

                    }
                }else{
                    switch (sotram){
                        case 1:{
                            System.out.println("one hurdert");
                            break;
                        }
                        case 2:{
                            System.out.println("two hurdert");
                            break;
                        }
                        case 3:{
                            System.out.println("three hurdert");
                            break;
                        }
                        case 4:{
                            System.out.println("four hurdert");
                            break;
                        }
                        case 5:{
                            System.out.println("five hurdert");
                            break;
                        }
                        case 6:{
                            System.out.println("six hurdert");
                            break;
                        }
                        case 7:{
                            System.out.println("seven hurdert");
                            break;
                        }
                        case 8:{
                            System.out.println("eight hurdert");
                            break;
                        }
                        case 9:{
                            System.out.println("nice hurdert");
                            break;
                        }

                    }
                }

                if(sodonvi<10){
                    switch (sodonvi){
                        case 1:{
                            System.out.println("and one");
                            break;
                        }
                        case 2:{
                            System.out.println("and two");
                            break;
                        }
                        case 3:{
                            System.out.println("and three");
                            break;
                        }
                        case 4:{
                            System.out.println("and four");
                            break;
                        }
                        case 5:{
                            System.out.println("and five");
                            break;
                        }
                        case 6:{
                            System.out.println("and six");
                            break;
                        }
                        case 7:{
                            System.out.println("and seven");
                            break;
                        }
                        case 8:{
                            System.out.println("and eight");
                            break;
                        }
                        case 9:{
                            System.out.println("and nice");
                            break;
                        }

                    }
                }
                if(sochuc <2 && sochuc>0){
                    switch (sochuc){
                        case 0:{
                            System.out.println("and teuwnty");
                            break;
                        }
                        case 1:{
                            switch (sodonvi2){
                                case 0:{
                                    System.out.println("ten");
                                    break;
                                }
                                case 1: {
                                    System.out.println("elevent");
                                    break;
                                }
                                case 2: {
                                    System.out.println("twiele");
                                    break;
                                }
                                case 3: {
                                    System.out.println("thirteen");
                                    break;
                                }
                                case 4: {
                                    System.out.println("fourteen");
                                    break;
                                }
                                case 5: {
                                    System.out.println("fivteen");
                                    break;
                                }
                                case 6: {
                                    System.out.println("sixteen");
                                    break;
                                }
                                case 7: {
                                    System.out.println("seventeen");
                                    break;
                                }
                                case 8: {
                                    System.out.println("eighteen");
                                    break;
                                }
                                case 9: {
                                    System.out.println("niceteen");
                                    break;
                                }
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("and tewnty");
                            break;
                        }
                        case 3:{
                            System.out.println("and thirteen");
                            break;
                        }
                        case 4:{
                            System.out.println("and fourteen");
                            break;
                        }
                        case 5:{
                            System.out.println("and fivteen");
                            break;
                        }
                        case 6:{
                            System.out.println("and sixteen");
                            break;
                        }
                        case 7:{
                            System.out.println("and seventeen");
                            break;
                        }
                        case 8:{
                            System.out.println("and eighteen");
                            break;
                        }
                        case 9:{
                            System.out.println("and niceteen");
                            break;
                        }
                    }
                }
                else if(sochuc>1){
                    switch (sochuc) {

                        case 2: {
                            System.out.println("and tewuty");
                            break;
                        }
                        case 3: {
                            System.out.println("and thirty");
                            break;
                        }
                        case 4: {
                            System.out.println("and fourty");
                            break;
                        }
                        case 5: {
                            System.out.println("and fivty");
                            break;
                        }
                        case 6: {
                            System.out.println("and sixty");
                            break;
                        }
                        case 7: {
                            System.out.println("and seventeen");
                            break;
                        }
                        case 8: {
                            System.out.println("and eighty");
                            break;
                        }
                        case 9: {
                            System.out.println("and nicety");
                            break;
                        }
                    }

                    if(sodonvi2>0){
                        switch (sodonvi2){
                            case 1:{
                                System.out.println("one");
                                break;
                            }
                            case 2:{
                                System.out.println("two");
                                break;
                            }
                            case 3:{
                                System.out.println("three");
                                break;
                            }
                            case 4:{
                                System.out.println("four");
                                break;
                            }
                            case 5:{
                                System.out.println("five");
                                break;
                            }
                            case 6:{
                                System.out.println("six");
                                break;
                            }
                            case 7:{
                                System.out.println("seven");
                                break;
                            }
                            case 8:{
                                System.out.println("eight");
                                break;
                            }
                            case 9:{
                                System.out.println("nice");
                                break;
                            }

                        }
                    }
                }
            }
    }
}
