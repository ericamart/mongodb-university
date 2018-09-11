# PROBLEM

Download Handouts:

- [using_max__m101p_52b1f47ae2d4235b7e5ebb7f.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/using_max__m101p_52b1f47ae2d4235b7e5ebb7f.js)

Again thinking about the zip code database, write an aggregation query that will return the population of the postal code in each state with the highest population. It should return output that looks like this:

```
{
            "_id" : "WI",
            "pop" : 57187
        },
        {
            "_id" : "WV",
            "pop" : 70185
        },
..and so on
```

Once again, the collection is named zips.

 
<details>
	<summary>Solution</summary>
	<br>
	db.zips.aggregate([<br>
			{ $group : {<br>
				"_id" : "$state",<br>
				"pop" : { $max : "$pop" }<br>
			} }<br>
		])<br>
</details>

