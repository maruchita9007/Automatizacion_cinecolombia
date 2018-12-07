#Author: marisella.restrepo@sophossolutions.com
Feature: reservation cinecolombia
  As a Web User  
  I want to select a movie into cinecolombia

  Scenario: Do a reservation for a movie
    Given that Mari wants to add a movie to the reservation
      | ciudad    | teatro                 | fecha | pelicula     |
      | /medellin | /cine-colombia-molinos |     7 | wifi-ralph |
    When she do the reservation
      | usuario                     | clave      | pago   | silla |
      | marisellarestrepo@gmail.com | prueba1234 | master | 4b    |
    Then she should see the movie in the reservation
			|triler|
			|WIFI RALPH - CINE COLOMBIA|