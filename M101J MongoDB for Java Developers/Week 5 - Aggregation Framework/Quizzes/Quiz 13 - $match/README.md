# PROBLEM

Download Handouts:

- [match_group_and_project__m101p_52b20448e2d42362670d8236.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/match_group_and_project__m101p_52b20448e2d42362670d8236.js)
- [match_and_group__m101p_52b20442e2d42362670d8235.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/match_and_group__m101p_52b20442e2d42362670d8235.js)
- [match__m101p_52b203fce2d42362670d8234.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/match__m101p_52b203fce2d42362670d8234.js)

Again, thinking about the zipcode collection, write an aggregation query with a single match phase that filters for zipcodes with greater than 100,000 people. You may need to look up the use of the $gt operator in the MongoDB docs. Assume the collection is called zips.

Enter answer here:

<details>
	<summary>Solution</summary>
	<br>
		db.zips.aggregate([<br>
			{ $match : {<br>
				"pop" : {$gt : 100000}<br>
			} }<br>
		])<br>
</details>