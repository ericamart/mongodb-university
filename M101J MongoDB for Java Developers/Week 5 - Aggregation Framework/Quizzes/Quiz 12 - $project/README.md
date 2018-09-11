# PROBLEM

Download Handouts:

- [quiz_using_project__m101p_52b1f62ae2d42360b66c713f.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/quiz_using_project__m101p_52b1f62ae2d42360b66c713f.js)
- [reshape_products__m101p_52b1f77ee2d42360b66c7140.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/reshape_products__m101p_52b1f77ee2d42360b66c7140.js)

Write an aggregation query with a single projection stage that will transform the documents in the zips collection from this:

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
`
to documents in the result set that look like this:

```
{
    "city" : "acmar",
    "pop" : 6055,
    "state" : "AL",
    "zip" : "35004"
}
```

So that the checker works properly, please specify what you want to do with the _id key as the first item. The other items should be ordered as above. As before, assume the collection is called zips. You are running only the projection part of the pipeline for this quiz.

*A few facts not mentioned in the lesson that you will need to know to get this right: If you don't mention a key, it is not included, except for _id, which must be explicitly suppressed. If you want to include a key exactly as it is named in the source document, you just write key:1, where key is the name of the key. You will probably get more out of this quiz is you download the zips.json file and practice in the shell. zips.json link is in the using $sum quiz*

Enter answer here:

<details>
	<summary>Solution</summary>
	<br>
		db.zips.aggregate([<br>
			{ $project : {<br>
				_id : 0,<br>
				"city" : { $toLower : "$city" },<br>
				"pop" : 1,<br>
				"state" : 1,<br>
				"zip" : "$_id"<br>
			} }<br>
		])<br>
</details>

