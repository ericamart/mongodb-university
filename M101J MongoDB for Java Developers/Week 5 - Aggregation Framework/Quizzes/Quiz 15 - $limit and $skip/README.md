# PROBLEM

Download Handouts:

[limit__m101p_52b2071ae2d42362670d823e.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/limit__m101p_52b2071ae2d42362670d823e.js)

Suppose you change the order of skip and limit in the query shown in the lesson, to look like this:

```
db.zips.aggregate([
    { $match: { state:"NY" } },
    { $group: { 
				_id: "$city", 
				population: {$sum:"$pop"} 
				} 
	},
    { $project: {
				_id: 0,
				city: "$_id",
				population: 1,
				}
    },
    { $sort: { population : -1 } },
    { $limit: 5 },
    { $skip: 10 }
])
```

How many documents do you think will be in the result set?

Choose the best answer:

- [ ] 10
- [ ] 5
- [ ] 0
- [ ] 100

<details>
	<summary>Solution</summary>
	<br>0
</details>