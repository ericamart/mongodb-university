# Problem

Download Handouts:
- [using_avg__m101p_52b1f306e2d4235b7e5ebb77.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/using_avg__m101p_52b1f306e2d4235b7e5ebb77.js)
- [zips.json](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/zips.json)

*This problem uses the same data set as we described in using $sum quiz and you should review that quiz if you did not complete it.*

Given population data by zip code (postal code) that looks like this:

```
{
    "city" : "FISHERS ISLAND",
    "loc" : [
            -72.017834,
            41.263934
    ],
    "pop" : 329,
    "state" : "NY",
    "_id" : "06390"
}
```

Write an aggregation expression to calculate the average population of a zip code (postal code) by state. As before, the postal code is in the _id field and is unique. The collection is assumped to be called "zips" and you should name the key in the result set "average_pop"

Enter answer here:

<details>
	<summary>Solution</summary>
	<br>
		db.zips.aggregate([<br>
			{ "$group": {<br>
				"_id": "$state",<br>
				"average_pop" : {$avg: "$pop"}<br>
			}}<br>
		])<br>
</details>



