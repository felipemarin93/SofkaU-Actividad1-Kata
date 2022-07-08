package katas;

import com.google.common.collect.ImmutableList;
import model.MovieList;
import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata3Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata3.execute().size(), equalTo(4));

    }
}
