import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    employee = employee['salary'].drop_duplicates()
    salary = employee.nlargest(2).iloc[-1] if len(employee) >= 2 else None
    if salary is None: 
        return pd.DataFrame({'SecondHighestSalary':[None]})
    return pd.DataFrame({'SecondHighestSalary': [salary]})