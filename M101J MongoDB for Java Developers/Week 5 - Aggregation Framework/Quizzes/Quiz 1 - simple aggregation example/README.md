# PROBLEM	

Download Handouts:

- [products__m101.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/products__m101.js)
- [simple_example__m101p_52b1e9abe2d4235b7e5ebb63.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/simple_example__m101p_52b1e9abe2d4235b7e5ebb63.js)

Write the aggregation query that will find the number of products by category of a collection that has the form:

```
{
    "_id" : ObjectId("50b1aa983b3d0043b51b2c52"),
    "name" : "Nexus 7",
    "category" : "Tablets",
    "manufacturer" : "Google",
    "price" : 199
}
```

Load the corresponding products data, available in the attached products__m101.js file, by running the following:

```
mongo --eval "load('products__m101.js')"
```

Have the resulting key be called "num_products," as in the video lesson. Hint, you just need to change which key you are aggregating on relative to the examples shown in the lesson.

<details>
  <summary>Solution</summary>
	<br>
	db.products.aggregate([<br>
		{$group:<br>
			{<br>
				_id:"$category", <br>
				num_products:{$sum:1}<br>
			}<br>
		}<br>
	])<br>
</details>