import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Animation{
    
    public static void main(String[]args)throws InterruptedException,IOException{
        
        System.out.println("                                                                   .-'` `}");
        System.out.println("                                                            ./)   /       }");
        System.out.println("                                                           .'o   ) |       }");
        System.out.println("                                                           '.___.'`.)    {`");
        System.out.println("                                                           /`(_/  , `.    }");
        System.out.println("                                                           (=' .-'   _`)  {");
        System.out.println("                                                           `'`;/      `,  }");
        System.out.println("                                                             _(       ;  }");
        System.out.println("                                                            /__`;-...'--':");

        Thread.sleep(500);
        

        System.out.println("                                                                   .-'` `}");
        System.out.println("     ___                                                    ./)   /       }");
        System.out.println("   ,' e`--o                                                .'o   ) |       }");
        System.out.println("  (  | __,'                                                '.___.'`.)    {`");
        System.out.println("-' (_;/                                                    /`(_/  , `.    }");
        System.out.println("     /                                                     (=' .-'   _`)  {");
        System.out.println("_.  )                                                      `'`;/      `,  }");
        System.out.println("(( (                                                         _(       ;  }");
        System.out.println(" ``-'                                                       /__`;-...'--':");
        
        Thread.sleep(500);

        System.out.println("                                                                   .-'` `}");
        System.out.println("         __                                                 ./)   /       }");
        System.out.println("       ,' e`--o                                            .'o   ) |       }");
        System.out.println("      (  | __,'                                            '.___.'`.)    {`");
        System.out.println("-----' (_;/                                                /`(_/  , `.    }");
        System.out.println("         /                                                 (=' .-'   _`)  {");
        System.out.println("_____.  )                                                  `'`;/      `,  }");
        System.out.println("    (( (                                                     _(       ;  }");
        System.out.println("     ``-'                                                   /__`;-...'--':");

        Thread.sleep(500);

        System.out.println("                                                                   .-'` `}");
        System.out.println("               __                                           ./)   /       }");
        System.out.println("             ,' e`--o                                      .'o   ) |       }");
        System.out.println("            (  | __,'                                      '.___.'`.)    {`");
        System.out.println("-----------' (_;/                                          /`(_/  , `.    }");
        System.out.println("               /                                           (=' .-'   _`)  {");
        System.out.println("____________.  )                                           `'`;/      `,  }");
        System.out.println("           (( (                                              _(       ;  }");
        System.out.println("            ``-'                                            /__`;-...'--':");

        Thread.sleep(500);

        System.out.println("                                                                   .-'` `}");
        System.out.println("                        __                                  ./)   /       }");
        System.out.println(" ,                    ,' e`--o                             .'o   ) |       }");
        System.out.println("((                   (  | __,'                             '.___.'`.)    {`");
        System.out.println(" ((~----------------' (_;/                                 /`(_/  , `.    }");
        System.out.println(" (                     /                                   (=' .-'   _`)  {");
        System.out.println(" /) ._______________. )                                    `'`;/      `,  }");
        System.out.println("(( (               (( (                                      _(       ;  }");
        System.out.println(" ``-'               ``-'                                    /__`;-...'--':");

        Thread.sleep(500);

        System.out.println("                                                                   .-'` `}");
        System.out.println("                        __                                  ./)   /       }");
        System.out.println(" ,                    ,' ^`--o          __          _      .'o   ) |       }");
        System.out.println("((                   (  | __,O  |   |  (  )  |     / )     '.___.'`.)    {`");
        System.out.println(" ((~----------------' (_;/      |---| (    ) |    |___)    /`(_/  , `.    }");
        System.out.println(" (                     /        |   |  (__)  |___ |   )    (=' .-'   _`)  {");
        System.out.println(" /) ._______________. )                                    `'`;/      `,  }");
        System.out.println("(( (               (( (                                      _(       ;  }");
        System.out.println(" ``-'               ``-'                                    /__`;-...'--':");

        Thread.sleep(500);

        Scanner input = new Scanner(System.in);
        System.out.println("Quieres acariciar a salchi?");
        System.out.println("Pulsa 1 para acariciar    >");
        if(input.nextInt()==1){
            System.out.println("                        __               ");
            System.out.println(" ,                    ,' ^`--o           ");
            System.out.println("((                   (  | __,O     GUAUF ");
            System.out.println(" ((~----------------' (_;/               ");
            System.out.println(" (                     /                 ");
            System.out.println(" /) ._______________. )                  ");
            System.out.println("(( (               (( (                  ");
            System.out.println(" ``-'               ``-'                 ");
            System.out.println("Pulsa 1 para volver a acariciar o 0 para parar   >");
            
            int vecesAcariciado = 0; 
            while(true){
                if(vecesAcariciado>=3){
                    System.out.println("                     º . º              ");
                    System.out.println("                       º .               ");
                    System.out.println("                       º__               ");
                    System.out.println(" ,                    ,' ~`--o           ");
                    System.out.println("((                   (  | __,~     GUuAauUFf ");
                    System.out.println(" ((~----------------' (_;/               ");
                    System.out.println(" (                     /                 ");
                    System.out.println(" /) ._______________. )                  ");
                    System.out.println("(( (               (( (                  ");
                    System.out.println(" ``-'               ``-'                 ");
                }else{
                    System.out.println("                        __               ");
                    System.out.println(" ,                    ,' ^`--o           ");
                    System.out.println("((                   (  | __,O     GUAUF ");
                    System.out.println(" ((~----------------' (_;/               ");
                    System.out.println(" (                     /                 ");
                    System.out.println(" /) ._______________. )                  ");
                    System.out.println("(( (               (( (                  ");
                    System.out.println(" ``-'               ``-'                 ");
                }
                System.out.println("Pulsa 1 para volver a acariciar o 0 para parar   >");
                if(input.nextInt()==0)
                    break;
                else 
                    vecesAcariciado++;
            }
        }

            for(int i = 0; i<3; i++){
                System.out.println("...\n");
                Thread.sleep(1000);
            }
            System.out.println("Un momento...  Que es ese ruido?");

            Thread.sleep(2000);
            
            System.out.println(" ______    _______  _______  _______   __     __ ");
            System.out.println("|       ) |       ||       ||       | |  )   /  |");
            System.out.println("|       / |       ||       ||       | |   ) /   |");
            System.out.println("|------   |       ||       ||       | |    -    |");
            System.out.println("|       ) |       ||       ||       | |         |");
            System.out.println("|        )|       ||       ||       | |         |");
            System.out.println("|       / |       ||       ||       | |         |");
            System.out.println("|______/  |_______||_______||_______| |         |");
            
            Thread.sleep(3000);

            for(int i = 0; i<3; i++){
                System.out.println("...\n");
                Thread.sleep(500);
            }

            System.out.println("\n\n\nglup...");

            Thread.sleep(1000);

            System.out.println("                        ?                                     ?    .-'` `}");
            System.out.println("                        __                ___               ./)   /       }");
            System.out.println(" ,                    ,' e`--o               )             .'o   ) |       }");
            System.out.println("((                   (  | __,'             _/              '.___.'`.)    {`");
            System.out.println(" ((~----------------' (_;/                |                /`(_/  , `.    }");
            System.out.println(" (                     /                  o                (=' .-'   _`)  {");
            System.out.println(" /) ._______________. )                                    `'`;/      `,  }");
            System.out.println("(( (               (( (                                      _(       ;  }");
            System.out.println(" ``-'               ``-'                                    /__`;-...'--':");

            for(int i = 0; i<3; i++){
                System.out.println("...\n");
                Thread.sleep(500);
            }

            System.out.println("o   o");
            Thread.sleep(500);
            System.out.println("'  '     ,oO))))))))Oo,");
            Thread.sleep(500);
            System.out.println("       ,'))))))))))))))), /{");
            Thread.sleep(500);
            System.out.println("  '  ,'o  ))))))))))))))))={");
            Thread.sleep(500);
            System.out.println("     >    ))))))))))))))))={");
            Thread.sleep(500);
            System.out.println("      `,   ))))))( ())))))={");
            Thread.sleep(500);
            System.out.println("        ',))))))))(/)))))' {");
            Thread.sleep(500);
            System.out.println("          '*O))))))))O*'");
        
        Thread.sleep(500);
        
        
        System.out.println("                                         o   o                       ");
        System.out.println("    FELIZ                                '  '     ,oO))))))))Oo,     ");
        System.out.println("     18                                         ,'))))))))))))))), /{");
        System.out.println("    ARDILLITA!!!! <3                       '  ,'o  ))))))))))))))))={");
        System.out.println("                                              >    ))))))))))))))))={");
        System.out.println("                                               `,   ))))))( ())))))={");
        System.out.println("                                                 ',))))))))(/)))))' {");
        System.out.println("                                                   '*O))))))))O*'    ");

        Thread.sleep(5000);
        

        System.out.println("Quieres acariciar a Pina?");
        System.out.println("Pulsa 1 para acariciar    >");
        if(input.nextInt()==1){
            System.out.println("                                     o   o                       ");
            System.out.println("                                     '  '     ,oO))))))))Oo,     ");
            System.out.println("                                            ,'))))))))))))))), /{");
            System.out.println("                                       '  ,'o  ))))))))))))))))={");
            System.out.println("                                          >    ))))))))))))))))={");
            System.out.println("                                           `,   ))))))( ())))))={");
            System.out.println("                                             ',))))))))(/)))))' {");
            System.out.println("                                               '*O))))))))O*'    ");
            System.out.println("Pulsa 1 para volver a acariciar o 0 para parar   >");
            
            int vecesAcariciado = 0; 
            while(true){
                if(vecesAcariciado>=3){
                    System.out.println("                                     o   o  O                    ");
                    System.out.println("                                  0  '  '     ,oO))))))))Oo,     ");
                    System.out.println("                                    O  0    ,'))))))))))))))), /{");
                    System.out.println("                                      ~'  ,'~  ))))))))))))))))={");
                    System.out.println("       GLuUuPp                         o -z    ))))))))))))))))={");
                    System.out.println("                                           `,   ))))))( ())))))={");
                    System.out.println("                                             ',))))))))(/)))))' {");
                    System.out.println("                                               '*O))))))))O*'    ");
                    System.out.println("Pulsa 1 para volver a acariciar o 0 para parar   >");
                }else{
                    System.out.println("                                     o   o                       ");
                    System.out.println("                                     '  '     ,oO))))))))Oo,     ");
                    System.out.println("                                            ,'))))))))))))))), /{");
                    System.out.println("                                       '  ,'o  ))))))))))))))))={");
                    System.out.println("        GLUP                              >    ))))))))))))))))={");
                    System.out.println("                                           `,   ))))))( ())))))={");
                    System.out.println("                                             ',))))))))(/)))))' {");
                    System.out.println("                                               '*O))))))))O*'    ");
                    System.out.println("Pulsa 1 para volver a acariciar o 0 para parar   >");
                }
                if(input.nextInt()==0)
                    break;
                else 
                    vecesAcariciado++;
            }
        }
        System.out.println("Pulsa 1 para sorpresa  >");
        if(input.nextInt()==1){

            System.out.println("CUIDADO!!!");
            Thread.sleep(1000);
            System.out.println("Hay muchos salchis perdidos en la carretera!! ");
            Thread.sleep(1000);
            System.out.println("CORRE!!! COJE EL COCHE Y VAMOS A SALVARLOS");
            Thread.sleep(1000);

            System.out.println("              __________      __________     ________                               ____________            ");
            System.out.println(" |           |          |    |          |   |        )      |      |)         |    |                        ");
            System.out.println(" |           |          |    |          |   |         )     |      | )        |    |                        ");
            System.out.println(" |           |          |    |          |   |          )    |      |  )       |    |                        ");
            System.out.println(" |           |          |    |__________|   |           )   |      |   )      |    |                        ");
            System.out.println(" |           |          |    |          |   |           |   |      |    )     |    |     ________           ");
            System.out.println(" |           |          |    |          |   |           |   |      |     )    |    |             |          ");
            System.out.println(" |           |          |    |          |   |          /    |      |      )   |    |             |          ");
            System.out.println(" |           |          |    |          |   |         /     |      |       )  |    |             |          ");
            System.out.println(" |           |          |    |          |   |        /      |      |        ) |    |             |          ");
            System.out.println(" |________   |__________|    |          |   |_______/       |      |         )|    |_____________|     .     .     .     ");
            Thread.sleep(4000);
            new GameFrame();
        }
    }
} 