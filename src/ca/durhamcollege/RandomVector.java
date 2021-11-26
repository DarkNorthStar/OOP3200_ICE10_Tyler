/**
 *  Author: Tyler Osborne
 *  Date: 2021-11-26
 *  Description:
 *          This Class of a static functions that creates random vector2Ds
 * */
package ca.durhamcollege;
import java.util.Random;

// SINGLETON
public class RandomVector
{
    // Private static instance
    private static RandomVector randomVectorInstance = null;
    private Random rand;

    // Private default constructor
    private RandomVector()
    {
        // Random numbers
        rand = new Random();
    }
    // Portal
    public static RandomVector Instance()
    {
        if(randomVectorInstance == null)
        {
            randomVectorInstance = new RandomVector();
        }
        return randomVectorInstance;
    }

    // Creates a random Vector2D within passed Vector2D Range
    public final Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        // X Value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (rand.nextFloat() * maxX) + minX;

        // Y Value
        float minY = Math.min(start.getX(), end.getX());
        float maxY = Math.max(start.getX(), end.getX());
        float randomY = (rand.nextFloat() * maxY) + minY;

        // Return the new random Vector2D
        return new Vector2D(randomX, randomY);
    }
}
