/**
 * Write a description of class ProjectMathRandom here.
 *
 * @author (Niharika Shah)
 * @version (2.0)
 */
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ProjectMathRandom
{
   int         FinalsAdditionArray[]        = new int [21];
   int         FinalsSubtractionArray[]     = new int [21];
   int         FinalsMultiplicationArray[]  = new int [21];
   int         FinalsDivisionArray[]        = new int [21];
   boolean     FinalsCheck                  = false;
   boolean     FinalsFormatting             = false;
   int         FinalsChoice                 = 0;
   int         time                         = 40;
   int         time2                        = 40;
   int         nameCheck                    = 0;
   int         classDivCheck                = 0;
   String      name                         = "";
   String      classDiv                     = "";
   DateFormat  a                            = new SimpleDateFormat("yyyy/MM/dd");
   DateFormat  b                            = new SimpleDateFormat("HH:mm:ss");
   public static void main()
    {
      ProjectMathRandom obj = new ProjectMathRandom();
      Scanner sc = new Scanner(System.in);
      obj.go();
      int retry =0;
      while(retry!=2)
      {
        obj.priln("Would you like to try again?");
        obj.priln("1- Yes");
        obj.priln("2- No");
        retry = sc.nextInt();
        if(retry==1)
        {
            System.out.println("\f");
            obj.go();
          }
          else if(retry == 2)
          System.exit(0);
      }
   }
   void go()
   {    
      int choice = MainScreen();
      double marks=0;
      switch(choice)
      {
        case 1:marks=Addition(); break;
        case 2:marks=Subtraction(); break;
        case 3:marks=Multiplication(); break;    
        case 4:marks=Division(); break;  
        case 5:marks=Finals(); break;
      }      
      priln("\t\t\t\t\t" +marks +"%");
     
      pause(600);
      System.out.println("\f");
   }      
   int difficulty(int a)
   {
      int r = 0;    
      int difficultyCheck =0;
     
     
      switch(a)
      {
        case 1: r=20;break;
        case 2: r=200;break;  
        case 3: r=2000;   break;
        case 4: r=20000;   break;
        default:priln("Wrong Choice");break;
      }
      System.out.println("\f");
        Banner();
      return r;
   }
   void Banner()
   {  DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
      DateFormat timeF = new SimpleDateFormat("HH:mm");
      Date date = new Date();
      Scanner sc = new Scanner(System.in);
     
     
      while (nameCheck==0)
      {
         
      priln("Please enter your name(Max Length:10)");
      name= sc.next();
      name = name.trim();
      if(name.equals("betaTest"))
      {
          time = 0;
          time2 =0;
      }
      name += "           ";
      name = name.substring(0,9);
      nameCheck++;
     
      priln("Please enter your standard and division(Ex: \"10E\")");
      classDiv= sc.next();
      classDiv = classDiv.trim();
      classDiv += "        ";
      classDiv = classDiv.substring(0,3);
     
      classDivCheck++;
      System.out.println("\f");
    }
      System.out.println("                                        ╔════════════════════════════════════════════════════╗         ");
      System.out.println("                                        ║Name:"+name+"                                       ║         ");
      System.out.println("                                        ║Date:"+ dateF.format(date) +"                                ║         ");
      System.out.println("                                        ║Time:"+ timeF.format(date) +"                                ║         ");
      System.out.println("                                        ║Class:"+classDiv+"                                           ║         ");
      System.out.println("                                        ╚════════════════════════════════════════════════════╝         ");
   }
   void Results(int [] a, int n, String s )
   {    
      if(FinalsFormatting == false)
      {
        load();
        System.out.println("\f");
        Banner();
        priln("Question                               Your answer                     Correct Answer                Result");
      }
      time =10;
      for(int i=1,j=0; i<=n; i++, j+=2)
      {
        pri(a[j] + " " + s + " " + a[j+1] +"               ");
        if(a[j]<10 && a[j]>-10)
          pri(" ");
        if(a[j+1]<10 && a[j+1]>-10)
          pri(" ");
        if(a[j]<100 && a[j]>-100)
          pri(" ");
        if(a[j+1]<100 && a[j+1]>-100)
          pri(" ");
        if(a[j]<1000 && a[j]>-1000)
          pri(" ");
        if(a[j+1]<1000 && a[j+1]>-1000)
          pri(" ");
        if(a[j]<10000 && a[j]>-10000)
          pri(" ");
        if(a[j+1]<10000 && a[j+1]>-10000)
          pri(" ");
        if(a[j]<100000 && a[j]>-100000)
          pri(" ");
        if(a[j+1]<100000 && a[j+1]>-100000)
          pri(" ");
        if(a[j]<1000000 && a[j]>-1000000)
          pri(" ");
        if(a[j+1]<1000000 && a[j+1]>-1000000)
          pri(" ");
        if(a[j]<10000000 && a[j]>-10000000)
          pri(" ");
        if(a[j+1]<10000000 && a[j+1]>-10000000)
          pri(" ");
        if(a[j]<100000000 && a[j]>-100000000)
          pri(" ");
        if(a[j+1]<100000000 && a[j+1]>-100000000)
          pri(" ");
        if(a[j]<1000000000 && a[j]>-1000000000)
          pri(" ");
        if(a[j+1]<1000000000 && a[j+1]>-1000000000)
          pri(" ");
        if(a[i+n*3-1]>=0)
          pri(" ");
       
        pri( a[i+n*3-1] +"                     " );
        if(a[i+n*3-1]<10 && a[i+n*3-1]>-10)
          pri(" ");
        if(a[i+n*3-1]<100 && a[i+n*3-1]>-100)
          pri(" ");
        if(a[i+n*3-1]<1000 && a[i+n*3-1]>-1000)
          pri(" ");
        if(a[i+n*3-1]<10000 && a[i+n*3-1]>-10000)
          pri(" ");
        if(a[i+n*3-1]<100000 && a[i+n*3-1]>-100000)
          pri(" ");
        if(a[i+n*3-1]<1000000 && a[i+n*3-1]>-1000000)
          pri(" ");
        if(a[i+n*3-1]<10000000 && a[i+n*3-1]>-10000000)
          pri(" ");
        if(a[i+n*3-1]<100000000 && a[i+n*3-1]>-100000000)
          pri(" ");
        if(a[i+n*3-1]<1000000000 && a[i+n*3-1]>-1000000000)
          pri(" ");
        if(a[i+n*2-1]>=0)
          pri(" ");
       
        pri(a[i+ n*2-1] +"                    ");
        if(a[i+n*2-1]<10 && a[i+n*2-1]>-10)
          pri(" ");
        if(a[i+n*2-1]<100 && a[i+n*2-1]>-100)
          pri(" ");
        if(a[i+n*2-1]<1000 && a[i+n*2-1]>-1000)
          pri(" ");
        if(a[i+n*2-1]<10000 && a[i+n*2-1]>-10000)
          pri(" ");
        if(a[i+n*2-1]<100000 && a[i+n*2-1]>-100000)
          pri(" ");
        if(a[i+n*2-1]<1000000 && a[i+n*2-1]>-1000000)
          pri(" ");
        if(a[i+n*2-1]<10000000 && a[i+n*2-1]>-10000000)
          pri(" ");
        if(a[i+n*2-1]<100000000 && a[i+n*2-1]>-100000000)
          pri(" ");
        if(a[i+n*2-1]<1000000000 && a[i+n*2-1]>-1000000000)
          pri(" ");
       
        pause(100);
        if(a[i+n*2-1] == a[i+n*3-1])
        {
          priln("✔");
        }
        else
        {
          priln("✘");
        }  
      }
   }
   void pause(int t)
   {
      try
      {
        Thread.sleep(t);
      }
      catch (Exception e){          
      }
   }
   void priln(String s)
   {
      int l = s.length();
      for(int i=0;i<=l-1;i++)
      {
        System.out.print(s.charAt(i));
    pause(time2);
      }
      System.out.println();
    }
   void pri(String s)
   {
      int l = s.length();
      for(int i=0;i<=l-1;i++)
      {
        System.out.print(s.charAt(i));
    pause(time);
      }
   }  
    void load()
   {
      String load[] = new String[11]; //█
           
      load[0] ="(█       )";
      load[1] ="(██      )";
      load[2] ="( ██     )";
      load[3] ="(  ██    )";
      load[4] ="(   ██   )";
      load[5] ="(    ██  )";
      load[6] ="(     ██ )";
      load[7] ="(      ██)";      
      load[8] ="(       █)";
      load[9] ="(        )";
      System.out.println("\t\t\t\t\t\t\t\t"+load[9]);
      System.out.println("\t\t\t\t\t\t\t\t Loading : 0%");
      for(int p =1, q =1; q<=10; q++)
      {
        for(int i=0;i<10;i++)
        {
          System.out.println("\f");
          for(int j=0; j<14;j++)
            System.out.println();
          System.out.println("\t\t\t\t\t\t\t\tLoading : " + p +"%");
          System.out.println("\t\t\t\t\t\t\t\t"+load[i]);
          p++;      
          pause(60);      
         
          if(p==100)
          pause(800);
        }
      }
   }    
   int MainScreen()
   {
      //Screen
      Scanner sc= new Scanner(System.in);
     
      priln("All tests will consist of procedurally generated numbers and so no two tests will be the same");
      pause(500);
      System.out.println("");
      Banner();
     
      priln("1- Addition");
      priln("2- Subtraction");
      priln("3- Multiplication");
      priln("4- Division");
      priln("5- Finals");
      priln("Enter Choice");
     
      int ch=0;
    while (ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5)
      {
      ch = sc.nextInt();
     
      if(ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5)
      priln("Wrong input, choose again");
    }
      System.out.println("\f");
      Banner();
      return ch;
   }
   double Addition()
   {
      Scanner sc= new Scanner(System.in);
     
      int AdditionQ = 0;
      int ch2=0;
      if(FinalsCheck == false)
      {
        priln("Please enter the number of questions");
        AdditionQ = sc.nextInt();        
        System.out.println("\f");
        Banner();        
         
        priln("Choose Difficulty");
        priln("1- Basic");
        priln("2- Intermediate");
        priln("3- Advanced");
        priln("4- Expert");
       
        while (ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      {
      ch2 = sc.nextInt();
     
      if(ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      priln("Wrong input, choose again");
    }
         
        System.out.println("\f");
        Banner();
      }
      else
      {
        AdditionQ = 5;
        ch2 = FinalsChoice;
       
        System.out.println("\f");
        Banner();
      }
     
      int AdditionArray [] = new int[(4*AdditionQ)+1];
      double MarksP=0;
      int rand = difficulty(ch2);
     
      for(int i=0; i<AdditionQ*2; i++)
        AdditionArray[i]= (int)((Math.random() * rand)+1);
                                   
      for(int i=1,j=0; i<=AdditionQ; i++, j+=2)
      {
        pri("Q"+ i +") "+AdditionArray[j] +" + " + AdditionArray[j+1] + " = ");
        AdditionArray[i+AdditionQ*3-1] = sc.nextInt();
        AdditionArray[i+AdditionQ*2-1]= AdditionArray[j] + AdditionArray[j+1];
      }
      for(int i= AdditionQ*2; i<AdditionQ*3; i++)
      {
        if(AdditionArray[i] == AdditionArray[i+AdditionQ] )
          AdditionArray[AdditionQ*4]++;  
      }
     
      MarksP = (((double)AdditionArray[AdditionQ*4]*100)/((double)AdditionQ));
     
      if(FinalsCheck == false)
      {
        pause(100);
        priln("Calculating Results");
        pause(300);
        Results(AdditionArray, AdditionQ, "+");
       
        for(int i=0; i<=4; i++)
          System.out.println();
         
        priln("");
        pri("Final Percentage: ");
      }
      else
      {
        FinalsAdditionArray = AdditionArray;              
      }
     
      return  MarksP;
   }
   double Subtraction()
   {
      Scanner sc= new Scanner(System.in);    
      int SubtractionQ = 0;
      int ch2=0;
      if(FinalsCheck == false)
      {
        priln("Please enter the number of questions");
        SubtractionQ = sc.nextInt();        
        System.out.println("\f");
        Banner();        
        priln("Choose Difficulty");
        priln("1- Basic");
        priln("2- Intermediate");
        priln("3- Advanced");
        priln("4- Expert");        
         while (ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      {
      ch2 = sc.nextInt();
     
      if(ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      priln("Wrong input, choose again");
    }          
        System.out.println("\f");
        Banner();
      }
      else
      {
        SubtractionQ = 5;
        ch2 = FinalsChoice;
       
        System.out.println("\f");
        Banner();
      }                  
      int SubtractionArray [] = new int[(4*SubtractionQ)+1];
      double MarksP =0;
     
      for(int i=0; i<=4; i++)
        System.out.println();
       
      int rand = difficulty(ch2);
     
      for(int i=0; i<SubtractionQ*2; i++)
        SubtractionArray[i]= (int)((Math.random() * rand)+1);
                 
      for(int i=1,j=0; i<=SubtractionQ; i++, j+=2)
      {
        pri("Q"+ i +") "+SubtractionArray[j] +" - " + SubtractionArray[j+1] + " = ");
        SubtractionArray[i+SubtractionQ*3-1] = sc.nextInt();
        SubtractionArray[i+SubtractionQ*2-1]= SubtractionArray[j] - SubtractionArray[j+1];
      }
      for(int i= SubtractionQ*2; i<SubtractionQ*3; i++)
      {
        if(SubtractionArray[i] == SubtractionArray[i+SubtractionQ] )
          SubtractionArray[SubtractionQ*4]++;  
      }      
      MarksP = (((double)SubtractionArray[SubtractionQ*4]*(100/(double)SubtractionQ)));
     
      if(FinalsCheck == false)
      {
        pause(80);
        priln("Calculating Results");
        pause(300);
       
        for(int i=0; i<=5; i++)
          System.out.println();
         
        Results(SubtractionArray, SubtractionQ, "-");
       
        for(int i=0; i<=4; i++)
        System.out.println();
       
        priln("");
        pri("Final Percentage: ");
      }
      else
      {
        FinalsSubtractionArray = SubtractionArray;
      }
      return  MarksP;
   }
   double Multiplication()
   {
        Scanner sc= new Scanner(System.in);
       
        int MultiplicationQ = 0;
        int ch2=0;
       if(FinalsCheck == false)
       {
         priln("Please enter the number of questions");
          MultiplicationQ = sc.nextInt();
         
         
         System.out.println("\f");
         Banner();
         
         priln("Choose Difficulty");
         priln("1- Basic");
         priln("2- Intermediate");
         priln("3- Advanced");
         priln("4- Expert");
         
           while (ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      {
      ch2 = sc.nextInt();
     
      if(ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      priln("Wrong input, choose again");
    }
         
          System.out.println("\f");
          Banner();
        }
        else
        {
            MultiplicationQ = 5;
            ch2 = FinalsChoice;
           
            System.out.println("\f");
        Banner();
        }
         
         
         int MultiplicationArray [] = new int[(4*MultiplicationQ)+1];
         double MarksP=0;
       for(int i=0; i<=4; i++)
        System.out.println();
       
         int rand = difficulty(ch2);
       for(int i=0; i<MultiplicationQ*2; i++)
         MultiplicationArray[i]= (int)((Math.random() * rand)+1);
         
         
         
         
       for(int i=1,j=0; i<=MultiplicationQ; i++, j+=2)
          {
          pri("Q"+ i +") "+MultiplicationArray[j] +" × " + MultiplicationArray[j+1] + " = ");
          MultiplicationArray[i+MultiplicationQ*3-1] = sc.nextInt();
          MultiplicationArray[i+MultiplicationQ*2-1]= MultiplicationArray[j] * MultiplicationArray[j+1];
       
       
       
       
       
        }
       for(int i= MultiplicationQ*2; i<MultiplicationQ*3; i++)
           {if(MultiplicationArray[i] == MultiplicationArray[i+MultiplicationQ] )
              MultiplicationArray[MultiplicationQ*4]++;
             
            }
           
          MarksP = (((double)MultiplicationArray[MultiplicationQ*4])*100/((double)MultiplicationQ));
         
          if(FinalsCheck == false)
          {
         pause(100);
        priln("Calculating Results");
        pause(300);
         for(int i=0; i<=5; i++)
         System.out.println();
       
         Results(MultiplicationArray, MultiplicationQ, "×");
         for(int i=0; i<=4; i++)
         System.out.println();
         priln("");
         pri("Final Percentage: ");
       }
       else
         FinalsMultiplicationArray = MultiplicationArray;
         return  MarksP;
        }
    double Division()
   {
        Scanner sc= new Scanner(System.in);
       
          int DivisionQ = 0;
        int ch2=0;
       if(FinalsCheck == false)
       {
         priln("Please enter the number of questions");
          DivisionQ = sc.nextInt();
         
         System.out.println("\f");
         Banner();
         
         
         priln("Choose Difficulty");
         priln("1- Basic");
         priln("2- Intermediate");
         priln("3- Advanced");
         priln("4- Expert");
         
           while (ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      {
      ch2 = sc.nextInt();
     
      if(ch2 != 1 && ch2 != 2 && ch2 != 3 && ch2 != 4)
      priln("Wrong input, choose again");
    }
         
          System.out.println("\f");
          Banner();
        }
        else
        {
            DivisionQ = 5;
            ch2 = FinalsChoice;
           
            System.out.println("\f");
            Banner();
        }
         
         int DivisionArray [] = new int[(4*DivisionQ)+1];
         double MarksP=0;
         for(int i=0; i<=4; i++)
        System.out.println();
       
         int rand = difficulty(ch2);
         for(int i=0; i<DivisionQ*2; i++)
         DivisionArray[i]= (int)((Math.random() * rand)+1);
         
         for(int i=0; i<DivisionQ*2; i+=2)
         DivisionArray[i]+=DivisionArray[(i+1)];
         
         
          priln("Only answer with Quotient as whole number");
          for(int i=1,j=0; i<=DivisionQ; i++, j+=2)
          {
          pri("Q"+ i +") "+DivisionArray[j] +" ÷ " + DivisionArray[j+1] + " = ");
          DivisionArray[i+DivisionQ*3-1] = sc.nextInt();
          DivisionArray[i+DivisionQ*2-1]= DivisionArray[j] / DivisionArray[j+1];
       
       
       
       
       
        }
         for(int i= DivisionQ*2; i<DivisionQ*3; i++)
           {
               if(DivisionArray[i] == DivisionArray[i+DivisionQ] )
                { DivisionArray[DivisionQ*4]++;
                }
            }
           
          MarksP = (((double)DivisionArray[DivisionQ*4])*100/((double)DivisionQ));
         
         if(FinalsCheck==false)
         {
         pause(100);
        priln("Calculating Results");
        pause(300);
         for(int i=0; i<=5; i++)
         System.out.println();
       
        Results(DivisionArray, DivisionQ, "÷");
        for(int i=0; i<=4; i++)
        System.out.println();
        priln("");
        pri("Final Percentage: ");
    }
    else
    {
        FinalsDivisionArray = DivisionArray;
    }
    return  MarksP;
        }
   double Finals()
   {
         Scanner sc = new Scanner(System.in);
         priln("In the finals you will be tested on 5 questions from each of the other tests");
         
         priln("Choose Difficulty");
         priln("1- Basic");
         priln("2- Intermediate");
         priln("3- Advanced");
         priln("4- Expert");
         
          while (FinalsChoice != 1 && FinalsChoice != 2 && FinalsChoice != 3 && FinalsChoice != 4)
      {
      FinalsChoice = sc.nextInt();
     
      if(FinalsChoice != 1 && FinalsChoice != 2 && FinalsChoice != 3 && FinalsChoice != 4)
      priln("Wrong input, choose again");
    }
       
         FinalsCheck = true;
         
         double FinalsMarks1 =0;
         double FinalsMarks2 =0;
         double FinalsMarks3 =0;
         double FinalsMarks4 =0;
         priln("");
         priln("Part I:   Addition");
         pause(200);
         FinalsMarks1 =   Addition();
         priln("");
         priln("Part II:  Subtraction");
         pause(200);
         FinalsMarks2 =   Subtraction();
         priln("");
         priln("Part III: Multiplication");
         pause(200);
         FinalsMarks3 =   Multiplication();
         priln("");
         priln("Part IV:  Division");
         pause(200);
         FinalsMarks4 =   Division();
         
         double FinalsMarksP = ((double)(FinalsMarks1 + FinalsMarks2 + FinalsMarks3 + FinalsMarks4))/(4);
         time=25;
         
         Results(FinalsAdditionArray, 5, "+");
         FinalsFormatting = true;
         Results(FinalsSubtractionArray, 5, "-");
         Results(FinalsMultiplicationArray, 5, "×");
         Results(FinalsDivisionArray, 5, "÷");
         for(int i=0; i<=4; i++)
         System.out.println();
         pri("Final Percentage: ");
         return FinalsMarksP;
   }      
}
