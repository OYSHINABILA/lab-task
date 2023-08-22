import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static int count = 0;
    public static int SIZE = 10;

    public static void main(String[] args) {

        Plant[] plants = new Plant[SIZE];

        Plant a = new Herb("Red", "Rose", false, "Always");
        Plant b = new Flower("Yellow", "Daliya", false, false);
        Plant c = new Flower("White", "NightQueen", true, false);


        add(plants, a);
        add(plants, b);
        add(plants, c);

        display(plants);

        remove(plants, "Daliya");

        display(plants);

        System.out.println(search(plants, "NightQueen"));
    }

    static void add(Plant[] plants, Plant a)
    {
        if(count < SIZE)
        {
            plants[count] = a;
            count++;
        }
    }

    static void remove(Plant[] plants, String name)
    {
        for(int i = 0; i < count; i++)
        {
            if(plants[i].getName().equals(name))
            {
                for(int j = i; j < count - 1; j++)
                {
                    plants[j] = plants[j + 1];
                }
                count--;
            }
        }
    }

    static Plant search(Plant[] plants, String name)
    {
        for (int i = 0; i < count; i++) {
            if(plants[i].getName().equals(name))
            {
                return plants[i];
            }
        }
        return null;
    }

    static void display(Plant[] plants)
    {
        for(int i = 0; i < count; i++)
        {
            System.out.println(plants[i] + "\n");
        }
    }

}

