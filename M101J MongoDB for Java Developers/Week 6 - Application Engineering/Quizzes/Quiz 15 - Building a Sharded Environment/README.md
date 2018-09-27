# PROBLEM

Download Handouts:

- [create_scores3__m101p_55315b14d8ca3950b977e06a.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/create_scores3__m101p_55315b14d8ca3950b977e06a.js)
- [init_sharded_env__m101p_55315ad9d8ca39503877dfe8.bat](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/init_sharded_env__m101p_55315ad9d8ca39503877dfe8.bat)
- [init_sharded_env__m101p_52b36d2de2d423678d3b9d7a.sh](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/init_sharded_env__m101p_52b36d2de2d423678d3b9d7a.sh)

If you want to build a production system with two shards, each one a replica set with three nodes, how may mongod processes must you start?

Choose the best answer:

- [ ] 2
- [ ] 6
- [ ] 7
- [ ] 9

<details>
	<summary>Solution</summary>
	<br>9
	<br>6 of them are going to come from the shards. There's two replica sets, each one with three nodes in the replica set. And there's three config servers. That's what we recommend for production systems.
</details>
