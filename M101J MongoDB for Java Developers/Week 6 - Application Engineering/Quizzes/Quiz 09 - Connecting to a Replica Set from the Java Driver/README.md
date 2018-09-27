# PROBLEM

If you leave a replica set node out of the seedlist within the driver, what will happen?

Choose the best answer:

- [ ] The missing node will not be used by the application.
- [ ] The missing node will be discovered as long as you list at least one valid node.
- [ ] This missing node will be used for reads, but not for writes.
- [ ] The missing node will be used for writes, but not for reads.

<details>
	<summary>Solution</summary>
	<br>The missing node will be discovered as long as you list at least one valid node.
</details>
