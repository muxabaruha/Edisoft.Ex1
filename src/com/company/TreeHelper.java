package com.company;

import java.util.ArrayList;
import java.util.List;

public class TreeHelper{
    public static int GetTreeHeight(Node rootNode)
    {
        List<Integer> heights = new ArrayList<Integer>();

        GetTreeHeightRecursive(rootNode, 1, heights);

        int maxHeight = 0;
        for (int i = 0; i < heights.size(); i++)
        {
            if(heights.get(i) > maxHeight){
                maxHeight = heights.get(i);
            }
        }

        return maxHeight;
    }

    private static void GetTreeHeightRecursive(Node item, int currentHeight, List<Integer> heights){
        if(item == null)
            return;

        heights.add(currentHeight++);

        if(item.ChildItems == null)
            return;

        for (int i = 0; i < item.ChildItems.size(); i++)
        {
            GetTreeHeightRecursive(item.ChildItems.get(i), currentHeight, heights);
        }
    }
}
