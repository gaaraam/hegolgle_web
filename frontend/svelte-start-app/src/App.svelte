<script>
	export let name;
	export let name2;
	import Input from './components/Input.svelte';
	import Board from "./components/Board.svelte";
</script>

<main>
	<Input />
	<Board />
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>