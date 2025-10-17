# Swag Labs UI Automation (Selenium + Java)

This repository contains a simple end-to-end UI automation script for the Swag Labs demo site (https://www.saucedemo.com/) using Selenium WebDriver with Java. The script automates a typical user journey: login, add product to cart, checkout, and complete an order.

Author: Rashmi Sawbagya  
GitHub: @rashmi-rightmo

---

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Run the Script](#run-the-script)
- [Test Flow Summary](#test-flow-summary)
- [Future Enhancements](#future-enhancements)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- Launches Chrome browser using Selenium WebDriver
- Logs in with valid credentials
- Adds "Sauce Labs Backpack" to the cart
- Proceeds to checkout, fills customer details, and completes purchase
- Returns to home (products) page after order completion

---

## Prerequisites

- Java JDK 11 or newer
- Maven (recommended) or ability to manage JAR classpath manually
- Google Chrome browser installed
- ChromeDriver available on PATH OR use WebDriverManager (recommended)

Recommended libraries (Maven coordinates):
- Selenium Java (org.seleniumhq.selenium:selenium-java)
- (Optional) io.github.bonigarcia:webdrivermanager

---

## Project Structure

SwagLab-project/
├── src/  
│   └── Login/  
│       └── SwagUI.java  
├── pom.xml (optional)  
└── README.md

The main automation class is `Login.SwagUI` (located at `src/Login/SwagUI.java`).

---

## Setup & Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/swagLab-project.git
cd swagLab-project
```

2. If using Maven, ensure `pom.xml` includes Selenium (and optionally WebDriverManager). Example dependencies:
```xml
<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.11.0</version>
  </dependency>
  <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.3.2</version>
  </dependency>
</dependencies>
```

3. ChromeDriver options:
- Option A (recommended): Use WebDriverManager to download and manage ChromeDriver automatically (no manual PATH setup).
- Option B: Download ChromeDriver matching your Chrome version and add it to your system PATH.

---

## Run the Script

### With Maven
If you add a small `main` class or configure the project as an executable, you can run via Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="Login.SwagUI"
```
(or run from your IDE)

### Without Maven
Compile and run manually. Make sure selenium-java JARs are on the classpath.
Example on Windows:
```bash
javac -cp ".;path/to/selenium-java-<version>.jar;path/to/selenium-deps/*" src/Login/SwagUI.java
java -cp ".;path/to/selenium-java-<version>.jar;path/to/selenium-deps/*;src" Login.SwagUI
```
On macOS/Linux replace `;` with `:` in the classpath.

---

## Test Flow Summary

1. Open Swag Labs site: https://www.saucedemo.com/
2. Enter Username & Password (example: standard_user / secret_sauce)
3. Click Login
4. Add item to cart: `add-to-cart-sauce-labs-backpack`
5. Open Cart and Checkout: `shopping_cart_link` → `checkout`
6. Enter customer details: `first-name`, `last-name`, `postal-code`
7. Continue and Finish order: `continue`, `finish`
8. Return Home: `back-to-products`

The automation interacts with elements using typical Selenium methods: driver.get(), findElement(), sendKeys(), click().

---

## Example Credentials (Demo Site)
- Username: `standard_user`
- Password: `secret_sauce`

(These are the public demo credentials for the Sauce Demo site.)

---

## Future Enhancements

- Convert into a TestNG or JUnit test suite
- Add assertions to validate page states and success messages
- Refactor to Page Object Model (POM) for maintainability
- Integrate WebDriverManager (if not already) to handle driver binaries
- Add logging and reporting (e.g., Extent Reports)
- CI integration (GitHub Actions) to run tests on push

---

## Troubleshooting

- Session fails to start / ChromeDriver mismatch: ensure ChromeDriver version matches Chrome browser. Use WebDriverManager to avoid mismatches.
- Element not found: waits may be needed. Consider adding explicit waits (WebDriverWait) before interacting with elements.
- Classpath errors when running manually: verify all Selenium JARs and transitive dependencies are on the classpath.

---

## Contributing

Contributions and improvements are welcome! Open an issue or submit a pull request with proposed changes. Ideas:
- Add tests/assertions
- Implement POM structure
- Add CI pipeline and cross-browser support

---

## License

This project is provided as-is for demonstration purposes. Add a LICENSE file as needed for explicit licensing.

---

If you'd like, I can:
- Create a ready-to-use `pom.xml` for Maven with Selenium & WebDriverManager,
- Convert the script into a TestNG test or POM structure,
- Add example assertions and waits to make the script more robust.

Which one would you like next?
