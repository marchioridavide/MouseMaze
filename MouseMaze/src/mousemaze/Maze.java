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
    Stack mazestack = new Stack();
    Scanner sc = new Scanner(System.in);
    char mousechar = 'µ';
    char cheesechar = '©';
    int [] startpoint = new int[2];
    int [] goal = new int[2];

    int risp;
    int risp2;
    Random r = new Random();
    int rand;

    public Maze()
    {
         System.out.println("Larghezza");
         risp = sc.nextInt();
         System.out.println("Altezza");
         risp2 = sc.nextInt();
         maze = new Cell[risp2][risp];
         Cell[] tmp = new Cell[risp];

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
             //for (Cell x : tmp)
             //    System.out.println(x.content);

             linkedlist.add(tmp);
             for (int n = 0;n < risp; n++)
             {
               maze[i][n] = linkedlist.get(i)[n];
             }
         }
    }

    public void stampa()
    {
        for(int x = 0;x < risp2; x++)
        {
            for(int y = 0;y < risp; y++)
            {
                System.out.print(maze[x][y].content);
            }
            System.out.print("\n");
        }
    }

    public void PlaceMouse()
    {
        loop:
        for (int y = 0;y < risp2; y++)
        {
            for (int x = 0;x < 5; x++)
            {
                rand = r.nextInt(5);
                if (rand == 4 && maze[y][x].content != '█')
                {
                    maze[y][x].content = mousechar;
                    startpoint = new int[] {y, x};
                    break loop;
                }
            }
        }
    }

    public void PlaceCheese()
    {
       loop2:
       for (int y = 0;y < risp2; y++)
       {
           for (int x = risp - 1; x > 5; x--)
           {
               rand = r.nextInt(5);
               if (rand == 4 && maze[y][x].content != '█')
               {
                   maze[y][x].content = cheesechar;
                   goal = new int[] {y, x};
                   break loop2;
               }
           }
       }
    }

    public void findcheese()
    {
       while(true)
       {
          if()
       }
    }
}
