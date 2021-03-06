package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Game;
import com.bezkoder.springjwt.security.services.GameServiceImpl;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GameController {

	@Autowired
	GameServiceImpl gameServiceImpl;

	@GetMapping("/games")
	public List<Game> listarGame() {
		return gameServiceImpl.listarGames();
	}

	@PostMapping("/games")
	public Game salvarGame(@RequestBody Game game) {

		return gameServiceImpl.guardarGame(game);
	}

	@GetMapping("/games/{id}")
	public Game GameXID(@PathVariable(name = "id") int id) {

		Game Game_xid = new Game();

		Game_xid = gameServiceImpl.gameXID(id);

		return Game_xid;
	}
	
	@GetMapping("/games/nombre/{nombre}")
	public List<Game> GameXNombre(@PathVariable(name = "nombre") String nombre) {
		return gameServiceImpl.buscarGame(nombre);
	}

	@PutMapping("/games/{id}")
	public Game actualizarGame(@PathVariable(name = "id") int id, @RequestBody Game Game) {

		Game Game_seleccionado = new Game();
		Game Game_actualizado = new Game();

		Game_seleccionado = gameServiceImpl.gameXID(id);

		Game_seleccionado.setNombre(Game.getNombre());
		Game_seleccionado.setImagen(Game.getImagen());

		Game_actualizado = gameServiceImpl.actualizarGame(Game_seleccionado);

		// System.out.println("El Game actualizado es: "+ Game_actualizado);

		return Game_actualizado;
	}

	@DeleteMapping("/games/{id}")
	public void eleiminarGame(@PathVariable(name = "id") int id) {
		gameServiceImpl.eliminarGame(id);
	}
}