# PROBLEM

Download Handouts:

- [create_replica_set__m101p_52b35df6e2d423678d3b9d48.sh](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/create_replica_set__m101p_52b35df6e2d423678d3b9d48.sh)
- [init_replica__m101p_52b35e02e2d423678d3b9d4d.js](https://university.mongodb.com/static/MongoDB_2018_M101J_August/handouts/init_replica__m101p_52b35e02e2d423678d3b9d4d.js)

Which command, when issued from the mongo shell, will allow you to read from a secondary?

Choose the best answer:

- [ ] db.isMaster()
- [ ] db.adminCommand({'readPreference':'Secondary"})
- [ ] rs.setStatus("Primary")
- [ ] rs.slaveOk()

<details>
	<summary>Solution</summary>
	<br>rs.slaveOk()
</details>
