/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemaze;

/**
 *
 * @author portatile
 */
public class Cell {
    public int x;
    public int y;
    public char content;
    
    public Cell(int or, int as, char c)
    {
        x = or;
        y = as;
        content = c;
    }
    
    public boolean solid()
    {
        if (content == '█')
        {
            return true;
        }
        return false;
    }
}
