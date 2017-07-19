package ru.job4j.task_021;

import java.util.List;

/**
 * Created by job4j on 03.09.2016.
 */
public class CompanyServiceImpl implements ICompanyService {
    public Company getTopLevelParent(Company child) {
        Company parent = child;
        if (child.parent != null) {
            parent = this.getTopLevelParent(child.parent);
        }
        return parent;
    }

    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long result = company.employeeCount;
        for (Company child : companies) {
            if (child.parent != null && child.parent.equals(company)) {
                result += this.getEmployeeCountForCompanyAndChildren(child, companies);
            }
        }
        return result;
    }
}
