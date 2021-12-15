![Modern Cross-Browser Testing Workshop](images/modern-cbt-banner.png)

# Workshop Walkthrough

This guide provides a full written walkthrough for the
[Modern Cross-Browser Testing](https://applitools.com/crossbrowser-testing-workshop/) workshop
led by [Pandy Knight](https://twitter.com/AutomationPanda)
and hosted by [Applitools](https://applitools.com/)
on December 16, 2021.
You can follow along with it during the live event,
or you can reference it afterwards to help you learn more.


## 1. Traditional cross-browser testing

Traditional cross-browser testing requires lots of work,
both in automating test cases and in maintaining testing infrastructure.
Let's give this a try ourselves to see what it takes.


### Writing a typical login test

SCREENSHARE

Describe web test

* show the demo site
* explain how to set up the project locally
* walk through the code
* explain how the assertions check some things but not all things
* also explain how the assertions are complicated


### Running the test locally

SCREENSHARE

* Run the test with Chrome
* Yay, it passes


### Updating the test to handle multiple browsers

SCREENSHARE

* Recommended practice: one test launch points to one browser
* Parameterizing tests becomes sloppy and repetitive
* Theoretically, any site should run on any browser
* Update setup to switch between Chrome and Firefox
* Run it once with Firefox


### Scaling out cross-browser testing yourself

SLIDES

* Local testing has limits: browser choices, versions, and parallel scale
* Show device count somehow
* Anecdotal optimal execution time: 1 web test per processor/core
* You could build your own Selenium Grid
* I did this at Q2; share the case study
* VMs running in Azure with scripts to power on and off
* Tests ran fast, but startup took a few minutes
* Figuring it all out took MONTHS
* We had to be picky about our browser choices (thankfully, no mobile)
* Maintenance was a CHORE (every Chrome update)
* Random crashes happened that are hard to debug
* Image: VW Beetle maintenance


### Scaling out cross-browser testing as a service

SLIDES

* Vendors make it a little easier to run cross-browser testing
* Less setup and maintenance time
* They provide all the browser, OS, and platform combos
* They also provide nice features like dashboards, screenshots, and videos
* But tests run much slower: anecdotally 2-4x slowdown
* It's also very, very expensive
* It's also sometimes unreliable! (esp. for mobile?)
* Security is challenging because communication must go two ways
* It's still hard to debug
* I've used Sauce Labs, CrossBrowserTesting, and LambdaTest


## 2. Modern cross-browser testing

There's got to be a better way to do cross-browser testing!
Let's rethink our approach in what we want to test
and how techniques like visual testing can simplify things.


### Reconsidering what should be tested

SLIDES

* What's the purpose of "cross-browser testing"?
* CBT makes sure that web apps work in different environments
* These days, browsers have standardized on JavaScript functionality
* It's more important to test rendering, visuals, and responsiveness
* Those are the things that are different across browsers


### Introducing Applitools Ultrafast Grid

SLIDES

* Visual testing with Ultrafast Grid!
* Explain how it works
* Snapshots in a single direction
* Check any browsers and platforms you want


### Rewriting login as a visual test

SCREENSHARE

* Rewrite test with Eyes SDK
* Revisit assertions: they are complicated
* Rerun original test with changed demo site, and the test still passes!
* Show how config is declarative and sharable
* Show how assertions are simplified: "A picture is worth a thousand assertions."


### Running visual tests across multiple browsers

SCREENSHARE

* Run tests using Ultrafast Grid
* Show Applitools dashboard with baselines and stuff
* Explain browsers, OS's, versions
* Show groupings
* Rerun tests with the changed demo site
* Determine visual failures
* Highlight advantages: speed, simplicity, accuracy


### Integrating modern cross-browser testing with CI/CD

SLIDES
SCREENSHARE (if we include GitHub Actions)

Lip service about CI/CD integration.
We have plugins for Jenkins, etc.
Bring up how slower CBT makes true Continuous Testing tough - it requires tradeoffs.
Ultrafast Grid shifts testing further left.

Maybe write GitHub Actions?
