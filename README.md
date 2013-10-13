Description
===========

At Thumbtack, engineers and designers enjoy a healthy dose of caffeine in the morning. They like to drink coffee, tea, or espresso. Your goal is to build a slot machine to award lucky users one of these random beverages. Your solution should be in JavaScript and CSS. You may use standard libraries like jQuery, Underscore, Backbone, and/or Angular. If you're applying for one of our mobile engineering positions, use Objective-C (iOS) or Java (Android) as appropriate.

Your slot machine should have three reels:

The first reel has a coffee maker, a teapot, and an espresso machine.
The second reel has a coffee filter, a tea strainer, and an espresso tamper.
The third reel has coffee grounds, loose tea, and ground espresso beans.
When the lever is pulled (you can simulate this with the click of a button), the slot machine goes into action. Each reel spins and randomly stops on one of the three options. If the user is lucky, the three reels will line up and she will be rewarded with a tasty hot beverage. Your solution should show the user what beverage she's won. For example, if the reels show coffee maker, coffee filter, and coffee grounds, the user wins a cup of coffee.

We'll be looking for exceptionally clean JavaScript and CSS, so focus on those first. Bonus points will be awarded for especially structured code or fanciful designs.

BDD
---
Class SlotMachine
should contain 3 reels
should be able to spin the reels individually
should determine what the prize for any of the 27 combinations should be
should respond to input