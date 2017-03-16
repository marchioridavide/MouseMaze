/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemaze;
import java.util.*;
/**
 *
 * @author portatile
 */
public class Maze {
    public Cell [][] maze;// = new Cell[22][12];
    LinkedList<Cell[]> linkedlist = new LinkedList<Cell[]>();
    Scanner sc = new Scanner(System.in);
    int risp;
    int risp2;
    
    public Maze()
    {
         System.out.println("Larghezza");
         risp = sc.nextInt();
         System.out.println("Altezza");
         risp2 = sc.nextInt();
         maze = new Cell[risp2][risp];
         Cell[] tmp = new Cell[risp];
         Random r = new Random();
         int rand;
         
         for (int i = 0;i < risp2; i++)
         {
             if (i == 0)
             {
                 for (int x = 0;x < risp;x++)
                 {
                     tmp[x] = new Cell(x,i,'█');
                 }
             }
             else if (i == risp2 - 1)
             {
                 for (int x = 0;x < risp;x++)
                 {
                     tmp[x] = new Cell(x,i,'█');
                 }
             }
             else
             {
                for (int x = 0;x < risp;x++)
                 {
                     if (x == 0 || x == risp-1)
                     {
                         tmp[x] = new Cell(x,i,'█');
                     }
                     else
                     {
                         rand = r.nextInt(10);
                         if (rand < 7)
                         {
                             tmp[x] = new Cell(x,i,' ');
                         }
                         else 
                         {
                             tmp[x] = new Cell(x,i,'█');
                         }
                     }
                 } 
             }
             linkedlist.add(tmp);
         }
    }
    
    public void stampa()
    {
        for (int cont = 0;cont < risp2;cont++)
        {
           for (int n = 0;n < risp; n++)
           {
               System.out.print(linkedlist.get(cont)[n].content);
           }
           System.out.print("\n");
        }
    }
    
    public void PlaceMouse()
    {
        
    }
}
