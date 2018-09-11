# PROBLEM

Download Handouts:

- [single_group__m101p_52b1f5b5e2d4235b7e5ebb87.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/single_group__m101p_52b1f5b5e2d4235b7e5ebb87.js)
- [double_group__m101p_52b1f544e2d4235b7e5ebb84.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/double_group__m101p_52b1f544e2d4235b7e5ebb84.js)

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

And the following aggregation query

```
db.fun.aggregate([
	{ $group:{
		_id : { a : "$a", b : "$b" }, 
		c   : { $max : "$c" }
	} }, 
	{ $group:{
		_id : "$_id.a", 
		c   : { $min : "$c" }
	} }
])
```

What values are returned?

Choose the best answer:

- [ ] 17 and 54
- [ ] 97 and 21
- [ ] 54 and 5
- [ ] 52 and 22

<details>
	<summary>Solution</summary>
	<br> 52 and 22
</details>

