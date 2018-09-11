# PROBLEM	

Download Handouts:
- [compound1__m101p_52b1edebe2d4235b7e5ebb69.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/compound1__m101p_52b1edebe2d4235b7e5ebb69.js)
- [simple_example1__m101p_52b1ef62e2d4235b7e5ebb6c.js](```
https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/simple_example1__m101p_52b1ef62e2d4235b7e5ebb6c.js)

Given the following collection:

```
> db.stuff.find()
{ "_id" : ObjectId("50b26f9d80a78af03b5163c8"), "a" : 1, "b" : 1, "c" : 1 }
{ "_id" : ObjectId("50b26fb480a78af03b5163c9"), "a" : 2, "b" : 2, "c" : 1 }
{ "_id" : ObjectId("50b26fbf80a78af03b5163ca"), "a" : 3, "b" : 3, "c" : 1 }
{ "_id" : ObjectId("50b26fcd80a78af03b5163cb"), "a" : 3, "b" : 3, "c" : 2 }
{ "_id" : ObjectId("50b26fd380a78af03b5163cc"), "a" : 3, "b" : 5, "c" : 3 }
{ "_id" : ObjectId("50b27f7080a78af03b5163cd"), "a" : 3, "b" : 3, "c" : 2 }
```

And the following aggregation query:

```
db.stuff.aggregate([{$group:
             {_id:
              {'moe':'$a',
               'larry':'$b',
               'curly':'$c'
              }
             }
            }])
```

How many documents will be in the result set?

Choose the best answer:

- [ ] 2
- [ ] 3
- [ ] 4
- [ ] 5
- [ ] 6

<details>
  <summary>Solution</summary>
	<br>5
</details>