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

The logical order for Billing and Revenue module would be to configure rates, receiving the superbills, generating claims, communication with insurer and clearinghouse, adjusting claims, generating and sending statements to the patients. **[More info](https://www.pivotaltracker.com/n/projects/2532665)**

|Title|User story opening sentence|Additional details|Definition of Ready|Story points|Estimation (Hrs per week) |
|-----|---------------------------|------------------|-------------------|------------|--------------------------|
|Add, modify, configure rates |As an administrator, I should be able to add, modify, configure rates based on CPT, HPPCS, ICD codes. |Administrator should be able to configure the system with the initial rates applied to different CPT, HPPS, ICD. Administrator should also be able to modify add these configuration. This will make billing module extensible to any Health Care Provider.|1. There should be services to add, modify the rates. 2. There should a database with the rates of different CPT, HPPS, ICD.| 3 |20|
|View the rates based on CPT, HPPCS, ICD codes |As an administrator, I should be able to view the rates based on CPT, HPPCS, ICD codes. |Administrator should be able to view the different rates of CPT, HPPCS, ICD.|A UI to view the rates.Possibly, a UI to manually add rates to a bill. (May not be deliverable) | 3|20|
|Get insurance details|As a biller, I should be able to get insurance details - third party |Claims also have information about the provider, listed via a National Provider Index (NPI) number. Some claims will also include a Place of Service code, which details what type of facility the medical services were performed in. |A UI or service to gather information about the insurer listed via a National Provider Index (NPI) number.|3|20|


|Team Members         |Estimation (Hrs per week) |
|---------------------|--------------------------|
|Rohit Sonawane       |15                        |
|Ankit Darekar        |15                        |
|Nitesh Lalan Jha     |15                        |
|Priyam A Sahoo       |15                        |
|Chandresh Sikarwar   |15                        |
