#Expenses for each day of the week as string
Expenses={
"Sunday ":"34.50",
"Monday": "60.76",
"Tuesday":"39.90",
"Wednesday":"75.25",
"Thrusday":"22.10",
"Friday":"58.85",
}
#Convert string value to float and calculator total and average expenses
total_expenses=sum(float(value)for value in expenses.value())
average_expenses=total_expenses /len(expenses)
print(f"Total expenses for the week:${total_expenses:.2f}")
print(f"Average daily expenses:${average_expenses:.2f}")