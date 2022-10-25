/**
 * Student: Joseph Grados
 * Professor: Hyesung Park
 * Date: 10/20/2022
 * Course:ITEC 2150
 * Purpose: To create a new file where the user can write a new file.
 */
package Poem;

public class Poem {
    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }


    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }
}
