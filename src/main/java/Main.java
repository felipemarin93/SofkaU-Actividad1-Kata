import katas.*;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {


        assertEquals(Kata1.execute().size(), 4);
        System.out.println("Kata 1 solved!");

        assertThat(Kata2.execute().size(), equalTo(2));
        System.out.println("Kata 2 solved!");

        assertThat(Kata3.execute().size(), equalTo(4));
        System.out.println("Kata 3 solved!");

        assertThat(Kata4.execute().size(), equalTo(4));
        System.out.println("Kata 4 solved!");

        assertThat(Kata5.execute(), equalTo(5.0));
        System.out.println("Kata 5 solved!");

        assertThat(Kata6.execute(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg"));
        System.out.println("Kata 6 solved!");

        assertThat(Kata7.execute().size(), equalTo(4));
        System.out.println("Kata 7 solved!");

        assertThat(Kata8.execute().size(), equalTo(3));
        System.out.println("Kata 8 solved!");

        assertThat(Kata9.execute().size(), equalTo(4));
        System.out.println("Kata 9 solved!");

        assertThat(Kata10.execute().size(), equalTo(2));
        System.out.println("Kata 10 solved!");

        assertThat(Kata11.execute().size(), equalTo(2));
        System.out.println("Kata 11 solved!");

        System.out.println("ALL DONE, you're a functional programming NINJA!");
    }
}
