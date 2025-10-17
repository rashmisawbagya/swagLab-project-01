🧠 Swag Labs UI Automation (Selenium + Java)

This project automates the end-to-end user flow of the Swag Labs Demo Website
 using Selenium WebDriver with Java.
It covers login, product selection, checkout, and order completion — simulating a real user journey.


🚀 Features

✅ Launches Chrome browser using Selenium WebDriver

✅ Logs in with valid credentials

✅ Adds a product (“Sauce Labs Backpack”) to the cart

✅ Proceeds to checkout

✅ Enters customer details

✅ Completes the purchase flow

✅ Returns to home page

🧩 Tech Stack
Tool / Library	Purpose
Java	                          Main programming language
Selenium                      WebDriver	Browser automation
ChromeDriver	                Chrome browser driver
JUnit/TestNG (optional)	     For test management (future scope)

📂 Project Structure
SwagLab-project/
├── src/
│   └── Login/
│       └── SwagUI.java
├── pom.xml (if using Maven)
└── README.md

⚙️ Setup Instructions
1️⃣ Prerequisites

Java JDK 11+ installed

Maven or IntelliJ IDEA (recommended)

Google Chrome browser

ChromeDriver installed and added to your system PATH


2️⃣ Clone the Project
git clone https://github.com/yourusername/swagLab-project.git
cd swagLab-project

3️⃣ Run the Script

Run directly from your IDE or use:

javac -cp ".;path/to/selenium-java.jar" SwagUI.java
java -cp ".;path/to/selenium-java.jar" Login.SwagUI


🧠 Test Flow Summary
Step	Action	Element	Method
1	   Open Swag Labs site	              https://www.saucedemo.com/	        driver.get()
2	   Enter Username & Password	        user-name, password	                sendKeys()
3	  Click Login	                        login-button	                      click()
4	  Add Item to Cart	                   add-to-cart-sauce-labs-backpack	  click()
5	  Open Cart & Checkout	               shopping_cart_link, checkout	     click()
6	  Fill Customer Info	                first-name, last-name, postal-code	sendKeys()
7	  Continue & Finish Order	           continue, finish	                 click()
8	  Return Home	                       back-to-products	                  click()  


🧾 Example Output

When executed successfully:

The Chrome browser opens Swag Labs

The user logs in

A product is added to the cart

Checkout is completed

Browser remains open at the home page after purchase confirmation

🧠 Future Enhancements

✅ Convert to TestNG test suite

✅ Add Assertions to validate results

✅ Use Page Object Model (POM) for better structure

✅ Integrate Extent Reports for test reporting

👩‍💻 Author

Rashmi Sawbagya
🌐 GitHub Profile

💬 Passionate about automation testing and UI quality assurance
