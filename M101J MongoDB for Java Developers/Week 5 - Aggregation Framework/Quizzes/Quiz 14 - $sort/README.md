# PROBLEM

Download Handouts:

- [sort__m101p_52b20714e2d42362670d823d.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/sort__m101p_52b20714e2d42362670d823d.js)

Again, considering the zipcode collection, which has documents that look like this,

```
{
    "city" : "ACMAR",
    "loc" : [
        -86.51557,
        33.584132
    ],
    "pop" : 6055,
    "state" : "AL",
    "_id" : "35004"
}
```

Write an aggregation query with just a sort stage to sort by (state, city), both ascending. Assume the collection is called zips.

<details>
	<summary>Solution</summary>
	<br>
		db.zips.aggregate([<br>
			{ $sort : {<br>
				state : 1,<br>
				city : 1<br>
			} }<br>
		])<br>
</details>