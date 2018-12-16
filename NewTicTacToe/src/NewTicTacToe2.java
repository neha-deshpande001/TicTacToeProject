
public class NewTicTacToe2 {
    // Instance Variables
    String topLeft = " ";
    String topMiddle = " ";
    String topRight = " ";
    String middleLeft = " ";
    String middleMiddle = " ";
    String middleRight = " ";
    String bottomLeft = " ";
    String bottomMiddle = " ";
    String bottomRight = " ";
    
    
    // Constructor
    public NewTicTacToe2() {}
    

    // Methods
    
    public String getSpace(String space)
    {
        if (space.equalsIgnoreCase("top left"))
            return topLeft;
        else if (space.equalsIgnoreCase("top middle"))
            return topMiddle;
        else if (space.equalsIgnoreCase("top right"))
            return topRight;
        else if (space.equalsIgnoreCase("middle left"))
            return middleLeft;
        else if (space.equalsIgnoreCase("middle middle"))
            return middleMiddle;
        else if (space.equalsIgnoreCase("middle right"))
            return middleRight;
        else if (space.equalsIgnoreCase("bottom left"))
            return bottomLeft;
        else if (space.equalsIgnoreCase("bottom middle"))
            return bottomMiddle;
        else if (space.equalsIgnoreCase("bottom right"))
            return bottomRight;
        else
            return "Error: Something is wrong with the method getSpace.";
    }
    
    public void printBoard()
    {
        System.out.println();
        System.out.println("    " + topLeft + " | " + topMiddle + " | " + topRight);
        System.out.println("    " + "---------");
        System.out.println("    " + middleLeft + " | " + middleMiddle + " | " + middleRight);
        System.out.println("    " + "---------");
        System.out.println("    " + bottomLeft + " | " + bottomMiddle + " | " + bottomRight);
    }
    
    public void changeSpace(String space, String xORo)
    {
        if (space.equalsIgnoreCase("top left"))
            topLeft = xORo;
        else if (space.equalsIgnoreCase("top middle"))
            topMiddle = xORo;
        else if (space.equalsIgnoreCase("top right"))
            topRight = xORo;
        else if (space.equalsIgnoreCase("middle left"))
            middleLeft = xORo;
        else if (space.equalsIgnoreCase("middle middle"))
            middleMiddle = xORo;
        else if (space.equalsIgnoreCase("middle right"))
            middleRight = xORo;
        else if (space.equalsIgnoreCase("bottom left"))
            bottomLeft = xORo;
        else if (space.equalsIgnoreCase("bottom middle"))
            bottomMiddle = xORo;
        else if (space.equalsIgnoreCase("bottom right"))
            bottomRight = xORo;
        else
            System.out.println("Error: That is not a valid space, or something is wrong with the method changeSpace.");
    }
    
    public boolean seeIfLetterWon(String xORo)
    {
        // HORIZONTAL TOP
        if (topLeft.equals(xORo) && topLeft.equals(topMiddle) && topLeft.equals(topRight))
            return true;
        
        // HORIZONTAL MIDDLE
        else if (middleLeft.equals(xORo) && middleLeft.equals(middleMiddle) && middleLeft.equals(middleRight))
            return true;

        // HORIZONTAL BOTTOM
        else if (bottomLeft.equals(xORo) && bottomLeft.equals(bottomMiddle) && bottomLeft.equals(bottomRight))
            return true;
        
        // VERTICAL LEFT
        else if (topLeft.equals(xORo) && topLeft.equals(middleLeft) && topLeft.equals(bottomLeft))
            return true;

        // VERTICAL MIDDLE
        else if (topMiddle.equals(xORo) && topMiddle.equals(middleMiddle) && topMiddle.equals(bottomMiddle))
            return true;

        // VERTICAL RIGHT
        else if (topRight.equals(xORo) && topRight.equals(middleRight) && topRight.equals(bottomRight))
            return true;
        
        // DIAGONAL TOP LEFT TO BOTTOM RIGHT
        else if (topLeft.equals(xORo) && topLeft.equals(middleMiddle) && topLeft.equals(bottomRight))
            return true;
        
        // DIAGONAL TOP RIGHT TO BOTTOM LEFT
        else if (topRight.equals(xORo) && topRight.equals(middleMiddle) && topRight.equals(bottomLeft))
            return true;
        
        // NONE
        else
            return false;
    }
    
    public boolean letterCanWin(String xORo)
    {
        boolean returnValue;
        
        String topLeft1 = topLeft;
        String topMiddle1 = topMiddle;
        String topRight1 = topRight;
        String middleLeft1 = middleLeft;
        String middleMiddle1 = middleMiddle;
        String middleRight1 = middleRight;
        String bottomLeft1 = bottomLeft;
        String bottomMiddle1 = bottomMiddle;
        String bottomRight1 = bottomRight;
        
        if (topLeft.equals(" "))
            topLeft = xORo;
        if (topMiddle.equals(" "))
            topMiddle = xORo;
        if (topRight.equals(" "))
            topRight = xORo;
        if (middleLeft.equals(" "))
            middleLeft = xORo;
        if (middleMiddle.equals(" "))
            middleMiddle = xORo;
        if (middleRight.equals(" "))
            middleRight = xORo;
        if (bottomLeft.equals(" "))
            bottomLeft = xORo;
        if (bottomMiddle.equals(" "))
            bottomMiddle = xORo;
        if (bottomRight.equals(" "))
            bottomRight = xORo;
        
        returnValue = this.seeIfLetterWon(xORo);
        
        topLeft = topLeft1;
        topMiddle = topMiddle1;
        topRight = topRight1;
        middleLeft = middleLeft1;
        middleMiddle = middleMiddle1;
        middleRight = middleRight1;
        bottomLeft = bottomLeft1;
        bottomMiddle = bottomMiddle1;
        bottomRight = bottomRight1;
                
        return returnValue;
    }

}
