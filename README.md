![Modern Cross-Browser Testing Workshop](images/modern-cbt-banner.png)

# Applitools Workshop: Modern Cross-Browser Testing

This repository contains the example code for the
[Modern Cross-Browser Testing](https://applitools.com/crossbrowser-testing-workshop/) workshop
led by [Pandy Knight](https://twitter.com/AutomationPanda)
and hosted by [Applitools](https://applitools.com/)
on December 16, 2021.


## Abstract

As organizations double down on digital,
the concept of quality has evolved from “does it work” to “is it the best experience”
— but the race to deliver innovation to market faster than the competition is causing challenges for software teams.

More frequent releases multiplied by an explosion of device/browser combinations and increased application complexity
has exponentially increased the number of screens that need to be validated each cycle –
an industry average of 81,480 screens to 681,296 for the top 33% –
and traditional test automation can’t keep up.

In this 1-hour interactive workshop
you will learn how industry leaders are integrating cross-browser testing into CI/CD
for faster and immediate feedback.

**Highlights:**

* The importance and evolution of cross browser testing
* Critical requirements for a scalable cross browser testing initiative and pros/cons of different approaches
* How to accelerate cross browser / cross device testing for integration into CI/CD


## Outline

TBD


## Prerequisites

To complete this workshop, you will need:

1. An Applitools account
   (register [here](https://auth.applitools.com/users/register) for free)
2. [Java Development Kit](https://www.oracle.com/java/technologies/downloads/) (JDK) 17 
3. A Java IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/)
4. [Google Chrome](https://www.google.com/chrome/)
   * The up-to-date version of the browser
   * The matching version of [ChromeDriver](https://chromedriver.chromium.org/) installed on system path
5. [Mozilla Firefox](https://www.mozilla.org/en-US/firefox/new/)
   * The up-to-date version of the browser
   * The matching version of [geckodriver](https://github.com/mozilla/geckodriver/releases) installed on the system path


## Architecture

This project is a small Java test automation project
containing [JUnit 5](https://junit.org/junit5/) test cases
for an [Applitools demo site](https://demo.applitools.com).
It uses [Apache Maven](https://search.maven.org/) for dependency management.
Each test case covers the same login behavior, but they do so in different ways:

1. `TraditionalTest` covers login using traditional assertions on a local machine.
2. `UltrafastVisualTest` covers login using Visual AI with [Applitools Eyes](https://applitools.com/products-eyes/)
   and [Ultrafast Grid](https://applitools.com/product-ultrafast-test-cloud/).


## Running tests

The easiest way to run the tests is one at a time through an IDE.
Alternatively, you can run the tests from the command line with Maven using the `mvn test` command.

`TraditionalTest` runs WebDriver sessions on the local machine.
Each test launch can target either Google Chrome or Mozilla Firefox.
Set the `BROWSER` environment variable to `chrome` or `firefox` to choose the browser.

`UltrafastVisualTest` runs one WebDriver session on the local machine with Applitools Eyes.
Then, it sends snapshots of pages to Applitools Ultrafast Grid to visually test across seven unique configurations.
To connect to the Applitools cloud,
you must set the `APPLITOOLS_API_KEY` environment variable to your Applitools API key.

Both tests can cover the "original" state of the demo site as well as a visually "changed" state.
Set the `DEMO_SITE` environment variable to `original` or `changed` to pick the target site.
`TraditionalTest` should pass for both versions of the site.
`UltrafastVisualTest` should detect visual differences.
Run it first with `DEMO_SITE=original` to set a baseline,
and then run it with `DEMO_SITE=changed` to reveal the differences.