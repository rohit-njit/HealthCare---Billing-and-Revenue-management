# HealthCare Billing and Revenue management
## PRODUCT VISION

We have already created "Scrum Team - Billing and Revenue Management" group in Canvas.

**[Access Git Repository from here](https://github.com/rohit-njit/HealthCare---Billing-and-Revenue-management/)**

**Team Name:** SudoPower

|Team Members         |Role                                    |
|---------------------|----------------------------------------|
|Rohit Sonawane       |Data Architect                          |
|Ankit Darekar        |UI/UX Developer                         |
|Nitesh Lalan Jha     |Product management / Business Analyst   |
|Priyam A Sahoo       |Quality & DevOps                        |
|Chandresh Sikarwar   |Microservices Developer                 |

**Roster:** Sprint call on weekdays from 3-4PM to track the daily progress/agile methodology.

**Product Vision:** Making Billing and revenue management as a service which is simple, secure, convenient and extensible for any Health Care Product

**Near Vision:** Designing architecture for the billing module and understanding the dependencies with other modules of the product

**Stakeholders:** BackOffice, Patinets, Insurance Company

**User Persona:**

**1. BackOffice:** Any user responsible for bill generation and bill tracking and they should be able to generate and send bills
to payee and keep the historical records.

**2. Patients:** Anyone who visit a doctor's office with the intention to get treatment for his/her ailment and recieve's 
billing information based on their encounters; Patient can also see information/details about their prior visits.

**3. Insurance Company:** Insurer responsible for paying off patient's bill payment. Insurance company should recieve billing 
information based on Insurance taken by the patient.

**[Access Backlogs on Pivotal Tracker](https://www.pivotaltracker.com/n/projects/2532665)**

**Current Product backlog and rationale**
1. As an administrator, I should be able to add, modify, configure rates based on CPT, HPPCS, ICD codes.
2. As an administrator, I should be able to view the rates based on CPT, HPPCS, ICD codes.
3. As a biller, I should be able to get insurance details - third party.
4. As a biller, I should be able to validate the superbill - ensure that the procedures coded are billable.
5. As a biller, I should be able to generate a claim based on superbill, patient info, rates and provider.
6. As a biller, I should be able to ensure the standards of compliance, both for coding and format.
7. As a biller, I should be able to send claims to clearinghouse and/or insurer.
9. As a biller, I should be able to receive claims back from clearinghouse and/or insurer.
10. As a biller, I should be able to send left over amount to second or more insurer.
11. As a biller, I should be able to correct rejected bill and resend it.
12. As a biller, I should be able to process denied claim.
13. As a biller, I should be able to to send an appeal in case of a discrepancies.
14. As a biller, I should be able to make statement to the patient.
15. As a biller, I should be able to follow-up, send reminder to the patient.

We will be starting off with designing the architecture and understand the underlying dependencies on other modules and design Database, UI, API's with security and compliance in place for all the modules and integrate QA-tested code with other modules.


