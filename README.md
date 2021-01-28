# group-A-weekly-assessment-2
EMOF CRM





We have created unit tests for every method other than basic getters, setters, constructors and methods that required user input.

This program handle all exceptions so incorrect input should not crash the program.

Leads can be added to the CRM by typing the command "New Lead" (case insensitive).

When a new Lead is created the user will be prompted for name, phoneNumber, email, and companyName. All fields must be supplied to create the new Lead.

The system automatically creates an id for the Lead. And it keeps track of how many objects have been created and provide the current count as the id for each new object.

A list of all Leads' id and name can be displayed by typing "Show Leads" (case insensitive).

An individual Lead's details can be displayed by typing "Lookup Lead id" (case insensitive) where "id" is the actual id of the Lead to lookup.

A Lead can be converted to an Opportunity by typing "convert id" (case insensitive) where "id" is the actual id of the Lead to convert.

When a Lead is converted, a Contact will be created with the Lead contact info and a new id.

When a Lead is converted, the user will be prompted for the product and the number of trucks for this Opportunity. A new Opportunity should be created with the above information and with the new Contact as the decisionMaker for the Opportunity and a status of "OPEN". To recap, Opportunity should have the following properties:

    id - a unique identifier
    product - an Enum with options HYBRID, FLATBED, or BOX
    quantity - the number of trucks being considered for purchase
    decisionMaker - a Contact
    status - an Enum with options OPEN, CLOSED_WON, CLOSED_LOST (these are common sales terms indicating an ongoing potential sale, a sale, and an opportunity where a sale was not made and the sale is no longer a possibility)

When a Lead is converted, the user will be prompted for the industry, number of employees, city, and country of the organization. An Account represents the company that is looking to buy a truck. Each Account should have a List of Contacts and a List of Opportunities. To recap, Account should have the following properties:

    id - a unique identifier
    industry - an Enum with options PRODUCE, ECOMMERCE, MANUFACTURING, MEDICAL, OTHER
    employeeCount - a number respresenting the number of employees in the company
    city - a String
    country - a String
    contactList - a List of Contacts associated with this Account
    opportunityList - a list of Opportunities associated with this Account

Leads are removed from the system once the have been successfully converted.

Opportunity status can be edited using the command "change status id" and then writing lost or won. Where "id" is the id of the Opportunity that should be closed.
