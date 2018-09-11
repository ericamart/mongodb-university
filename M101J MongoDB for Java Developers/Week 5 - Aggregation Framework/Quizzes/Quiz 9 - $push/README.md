# PROBLEM

Download Handouts:

- [using_push__m101p_52b1f44ae2d4235b7e5ebb7c.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/using_push__m101p_52b1f44ae2d4235b7e5ebb7c.js)
- [zips.json](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/zips.json)

Given the zipcode dataset (explained more fully in the using $sum quiz) that has documents that look like this:

```
> db.zips.findOne()
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

would you expect the following two queries to produce the same result or different results?

```
db.zips.aggregate([{"$group":{"_id":"$city", "postal_codes":{"$push":"$_id"}}}])
```
```
db.zips.aggregate([{"$group":{"_id":"$city", "postal_codes":{"$addToSet":"$_id"}}}])
```

Choose the best answer:

- [ ] Same result
- [ ] Different result

<details>
	<summary>Solution</summary>
	<br>Same result
</details>