
const jsonString = `[
    {
        "name": "TechCorp",
        "location": "Bangalore",
        "employees": 1200,
        "industry": "Software"
    },
    {
        "name": "InnoSoft",
        "location": "Hyderabad",
        "employees": 800,
        "industry": "IT Services"
    }
]`;

const companies = JSON.parse(jsonString);

console.log("Companies JSON:", companies);

const listElement = document.getElementById("companyList");

companies.forEach(company => {
    const li = document.createElement("li");
    li.innerHTML = `<strong>${company.name}</strong> - ${company.location}, Employees: ${company.employees}, Industry: ${company.industry}`;
    listElement.appendChild(li);
});
