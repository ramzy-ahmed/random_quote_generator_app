package com.random.quote.generator;

import java.util.Random;

public class QuoteProvider {
    public static Quote[] quotes = {
            new Quote("Success is going from failure to failure without losing your enthusiasm.", "Winston Churchill"),
            new Quote("I have not failed. I've just found 10,000 ways that won't work.", "Thomas Edison"),
            new Quote("The only thing we have to fear is fear itself.", "Franklin D. Roosevelt"),
            new Quote("To be, or not to be, that is the question.", "William Shakespeare"),
            new Quote("I think, therefore I am.", "René Descartes"),
            new Quote("That which does not kill us makes us stronger.", "Friedrich Nietzsche"),
            new Quote("The unexamined life is not worth living.", "Socrates"),
            new Quote("The way to get started is to quit talking and begin doing.", "Walt Disney"),
            new Quote("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"),
            new Quote("In the end, we will remember not the words of our enemies, but the silence of our friends.", "Martin Luther King Jr."),
            new Quote("If you want to live a happy life, tie it to a goal, not to people or things.", "Albert Einstein"),
            new Quote("Not all those who wander are lost.", "J.R.R. Tolkien"),
            new Quote("Faith is taking the first step even when you don't see the whole staircase.", "Martin Luther King Jr."),
            new Quote("The most wasted of all days is one without laughter.", "E.E. Cummings"),
            new Quote("To thine own self be true.", "William Shakespeare"),
            new Quote("The best and most beautiful things in the world cannot be seen or even touched – they must be felt with the heart.", "Helen Keller"),
            new Quote("Happiness is not something ready made. It comes from your own actions.", "Dalai Lama"),
            new Quote("It is never too late to be what you might have been.", "George Eliot"),
            new Quote("You must be the change you wish to see in the world.", "Mahatma Gandhi"),
            new Quote("Success is not the key to happiness. Happiness is the key to success.", "Albert Schweitzer"),
            new Quote("Success usually comes to those who are too busy to be looking for it.", "Henry David Thoreau"),
            new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"),
            new Quote("Success is walking from failure to failure with no loss of enthusiasm.", "Winston Churchill"),
            new Quote("The road to success and the road to failure are almost exactly the same.", "Colin R. Davis"),
            new Quote("Don't be distracted by criticism. Remember – the only taste of success some people get is to take a bite out of you.", "Zig Ziglar"),
            new Quote("The secret of success is to do the common thing uncommonly well.", "John D. Rockefeller Jr."),
            new Quote("Success is not how high you have climbed, but how you make a positive difference to the world.", "Roy T. Bennett"),
            new Quote("Success is not in what you have, but who you are.", "Bo Bennett"),
            new Quote("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"),
            new Quote("The greatest wealth is to live content with little.", "Plato"),
            new Quote("A room without books is like a body without a soul.", "Marcus Tullius Cicero"),
            new Quote("No one can make you feel inferior without your consent.", "Eleanor Roosevelt"),
            new Quote("I can't change the direction of the wind, but I can adjust my sails to always reach my destination.", "Jimmy Dean"),
            new Quote("Change your thoughts and you change your world.", "Norman Vincent Peale"),
            new Quote("We must be the change we wish to see.", "Mahatma Gandhi"),
            new Quote("The only thing necessary for the triumph of evil is for good men to do nothing.", "Edmund Burke"),
            new Quote("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"),
            new Quote("We are what we repeatedly do. Excellence, then, is not an act, but a habit.", "Aristotle"),
            new Quote("It is during our darkest moments that we must focus to see the light.", "Aristotle Onassis"),
            new Quote("Happiness is not something ready-made. It comes from your own actions.", "Dalai Lama"),
            new Quote("The purpose of our lives is to be happy.", "Dalai Lama"),
            new Quote("If you want to achieve greatness, stop asking for permission.", "Unknown"),
            new Quote("The only person you are destined to become is the person you decide to be.", "Ralph Waldo Emerson"),
            new Quote("Don't watch the clock; do what it does. Keep going.", "Sam Levenson"),
            new Quote("The best revenge is massive success.", "Frank Sinatra"),
            new Quote("If you don't stand for something, you will fall for anything.", "Malcolm X"),
            new Quote("Everything you can imagine is real.", "Pablo Picasso"),
            new Quote("You are never too old to set another goal or to dream a new dream.", "C.S. Lewis"),
            new Quote("The true test of character is not how much we know how to do, but how we behave when we don't know what to do.", "John Holt"),
            new Quote("Success is not how high you have climbed, but how you make a positive difference to the world.", "Roy T. Bennett"),
            new Quote("Success is not about being the best. It's about always getting better.", "Behdad Sami"),
            new Quote("A rose by any other name would smell as sweet.", "William Shakespeare"),
            new Quote("All that glitters is not gold.", "William Shakespeare"),
            new Quote("All the world's a stage, and all the men and women merely players.", "William Shakespeare"),
            new Quote("Ask not what your country can do for you; ask what you can do for your country.", "John F. Kennedy"),
            new Quote("Eighty percent of success is showing up.", "Woody Allen"),
            new Quote("Elementary, my dear Watson.", "Sherlock Holmes"),
            new Quote("Frankly, my dear, I don't give a damn.", "Rhett Butler"),
            new Quote("Genius is one percent inspiration and ninety-nine percent perspiration.", "Thomas Edison"),
            new Quote("Go ahead, make my day.", "Harry Callahan"),
            new Quote("He travels the fastest who travels alone.", "Rudyard Kipling"),
            new Quote("Hell has no fury like a woman scorned.", "William Congreve"),
            new Quote("Hell is other people.", "Jean-Paul Sartre"),
            new Quote("Here's looking at you, kid.", "Rick Blaine"),
            new Quote("Houston, we have a problem.", "Jim Lovell"),
            new Quote("I have a dream that my four little children will one day live in a nation where they will not be judged by the color of their skin but by the content of their character.", "Martin Luther King Jr."),
            new Quote("I have always depended on the kindness of strangers.", "Blanche DuBois"),
            new Quote("I love the smell of napalm in the morning.", "Lt. Kilgore"),
            new Quote("If at first you don't succeed, try, try again.", "W. E. Hickson"),
            new Quote("If you are going through hell, keep going.", "Winston Churchill"),
            new Quote("If you build it, they will come.", "Joe Jackson"),
            new Quote("If you want something done right, do it yourself.", "Charles-Guillaume Étienne"),
            new Quote("If you want something said, ask a man; if you want something done, ask a woman.", "Margaret Thatcher"),
            new Quote("I'll be back.", "Terminator"),
            new Quote("I'm gonna make him an offer he can't refuse.", "Vito Corleone"),
            new Quote("I've got a feeling we're not in Kansas anymore.", "Dorothy"),
            new Quote("Keep your friends close, but your enemies closer.", "Michael Corleone"),
            new Quote("Knowledge is power.", "Sir Francis Bacon"),
            new Quote("Life is like a box of chocolates.", "Forrest Gump"),
            new Quote("Love all, trust a few, do wrong to none.", "William Shakespeare"),
            new Quote("The only impossible journey is the one you never begin.", "Tony Robbins"),
            new Quote("Be yourself; everyone else is already taken.", "Oscar Wilde"),
            new Quote("This above all: to thine own self be true.", "William Shakespeare"),
            new Quote("Be who you are and say what you feel, because those who mind don't matter and those who matter don't mind.", "Bernard M. Baruch"),
            new Quote("Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.", "Robert Frost"),
            new Quote("We must not allow other people's limited perceptions to define us.", "Virginia Satir"),
            new Quote("Be a first rate version of yourself, not a second rate version of someone else.", "Judy Garland"),
            new Quote("If I am not for myself, who is for me? And if I am only for myself, what am I? And if not now, when?", "Rabbi Hillel"),
            new Quote("The only thing we have to fear is fear itself.", "Franklin D. Roosevelt"),
            new Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
            new Quote("You miss 100% of the shots you don't take.", "Wayne Gretzky"),
            new Quote("It always seems impossible until it is done.", "Nelson Mandela"),
            new Quote("Get busy living or get busy dying.", "Stephen King"),
            new Quote("The best way to predict your future is to create it.", "Peter Drucker"),
            new Quote("You only live once, but if you do it right, once is enough.", "Mae West")};

    public static Quote getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
}
