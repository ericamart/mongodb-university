# PROBLEM

Download Handouts:

[zips.json](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/zips.json)

**Prefered Cities to Live!**

In this problem you will calculate the number of people who live in a zip code in the US where the city starts with one of the following characthers:

- *B, D, O, G, N or M .*

We will take these are the prefered cities to live in (chosen by this instructor, given is special affection to this set of characters!).

You will be using the zip code collection data set, which you will find in the 'handouts' link in this page.

Import it into your mongod using the following command from the command line:

```
mongoimport --drop -d test -c zips zips.json
```

If you imported it correctly, you can go to the test database in the mongo shell and confirm that

```
> db.zips.count()
```

yields 29353 documents.

The *$project* stage can extract the first character from any field. For example, to extract the first character from the city field, you could write this pipeline:

```
db.zips.aggregate([
    {$project:
     {
    first_char: {$substr : ["$city",0,1]},
     }
   }
])
```

Using the aggregation framework, calculate the sum total of people who are living in a zip code where the city starts with one of those possible first characters. Choose the answer below.

*You will need to probably change your projection to send more info through than just that first character. Also, you will need a filtering step to get rid of all documents where the city does not start with the select set of initial characters.*

Choose the best answer:

- [ ] 76394871
- [ ] 9134188
- [ ] 9430890
- [ ] 19499064
- [ ] 11623385
- [ ] 20043717
- [ ] 3326663627

<details>
	<summary>Solution</summary>
	<br>76394871<br><br>
		db.zips.aggregate([<br>
			{ $project : {<br>
				_id  : 0,<br>
				city : 1,<br>
				pop  : 1,<br>
				first_char: { $substr : ["$city",0,1] }<br>
			} },<br>
			{ $match : { first_char: { $in: ['B', 'D', 'O', 'G', 'N', 'M'] } } },<br>
			{ $group : { <br>
				_id   : "null",<br>
				total : { $sum : "$pop" }<br>
			} }<br>
		])<br>
</details>