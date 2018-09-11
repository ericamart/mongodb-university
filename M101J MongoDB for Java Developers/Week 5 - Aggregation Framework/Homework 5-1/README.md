# PROBLEM

Download Handouts:

[posts.json](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/posts.json)

**Finding the most frequent author of comments on your blog**

In this assignment you will use the aggregation framework to find the most frequent author of comments on your blog. We will be using a data set similar to ones we've used before.
Start by downloading the handout zip file for this problem. Then import into your blog database as follows:

```
mongoimport --drop -d blog -c posts posts.json
```

Now use the aggregation framework to calculate the author with the greatest number of comments.

To help you verify your work before submitting, the author with the fewest comments is Mariela Sherer and she commented 387 times.

Please choose your answer below for the most prolific comment author:

Choose the best answer:

- [ ] Gwyneth Garling
- [ ] Milan Mcgavock
- [ ] Elizabet Kleine
- [ ] Dusti Lemmond
- [ ] Leonida Lafond
- [ ] Corliss Zuk

<details>
	<summary>Solution</summary>
	<br>Elizabet Kleine<br><br>
	db.posts.aggregate([<br>
		{ $unwind : "$comments" },<br>
		{ $group  : {<br>
			"_id" : "$comments.author",<br>
			"total" : { $sum: 1 }<br>
		} }, <br>
		{ $sort : { total : -1 } },<br>
		{ $limit : 1 }<br>
	])<br>
</details>