# PROBLEM

Download Handouts:

- [quiz_unwind__m101p_52b208b7e2d42362670d8248.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/quiz_unwind__m101p_52b208b7e2d42362670d8248.js)

Suppose you have the following collection:

```
db.people.find()
{ "_id" : "Will", "likes" : [ "physics", "MongoDB", "indexes" ] }
{ "_id" : "Dwight", "likes" : [ "starting companies", "restaurants", "MongoDB" ] }
```

And you unwind the "likes" array of each document. How many documents will you wind up with?

Choose the best answer:

- [ ] 2
- [ ] 4
- [ ] 6
- [ ] 9

<details>
	<summary>Solution</summary>
	<br>6
</details>