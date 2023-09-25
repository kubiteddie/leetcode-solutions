import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    employee = employee['salary'].drop_duplicates()
    salary = employee.nlargest(N).iloc[-1] if len(employee) >= N else None
    index = f"getNthHighestSalary({N})"
    if salary is None:
        return pd.DataFrame({index : [None]})
    
    return pd.DataFrame({index : [salary]})