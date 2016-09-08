package ru.parsentev.task_021;

import org.junit.Test;
import ru.parsentev.task_021.Company;
import ru.parsentev.task_021.CompanyServiceImpl;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by parsentev on 03.09.2016.
 */
public class CompanyServiceImplTest {
    @Test
    public void whenChainCompanyHasThreeLevelThenReturnTop() {
        Company root = new Company(null, 0);
        Company manager = new Company(root, 0);
        Company developer = new Company(manager, 0);
        Company top = new CompanyServiceImpl().getTopLevelParent(developer);
        assertThat(top, is(root));
    }

    @Test
    public void whenCalcTotalCampForRootThenResultIsAllCamp() {
        Company root = new Company(null, 10);
        Company manager = new Company(root, 10);
        long result = new CompanyServiceImpl().getEmployeeCountForCompanyAndChildren(
                root, Arrays.asList(root, manager, new Company(manager, 10), new Company(manager, 40))
        );
        assertThat(result, is(70L));
    }
}