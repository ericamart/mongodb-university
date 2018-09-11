# PROBLEM

Download Handouts:

- [first__m101p_52b208b6e2d42362670d8247.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/first__m101p_52b208b6e2d42362670d8247.js)
- [first_phase1__m101p_52b208b4e2d42362670d8245.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/first_phase1__m101p_52b208b4e2d42362670d8245.js)
- [first_phase2__m101p_52b208b3e2d42362670d8244.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/first_phase2__m101p_52b208b3e2d42362670d8244.js)
- [first_phase3__m101p_52b208b2e2d42362670d8243.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/first_phase3__m101p_52b208b2e2d42362670d8243.js)

Given the following collection:

```
> db.fun.find()
{ "_id" : 0, "a" : 0, "b" : 0, "c" : 21 }
{ "_id" : 1, "a" : 0, "b" : 0, "c" : 54 }
{ "_id" : 2, "a" : 0, "b" : 1, "c" : 52 }
{ "_id" : 3, "a" : 0, "b" : 1, "c" : 17 }
{ "_id" : 4, "a" : 1, "b" : 0, "c" : 22 }
{ "_id" : 5, "a" : 1, "b" : 0, "c" : 5 }
{ "_id" : 6, "a" : 1, "b" : 1, "c" : 87 }
{ "_id" : 7, "a" : 1, "b" : 1, "c" : 97 }
```

What would be the value of c in the result from this aggregation query

```
db.fun.aggregate([
    {$match:{a:0}},
    {$sort:{c:-1}},
    {$group:{_id:"$a", c:{$first:"$c"}}}
	])
```

Choose the best answer:

- [ ] 21
- [ ] 54
- [ ] 97
- [ ] 5

<details>
	<summary>Solution</summary>
	<br>54
</details>