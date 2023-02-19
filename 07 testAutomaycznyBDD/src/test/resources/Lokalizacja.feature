Feature: Lokalizacja sklepu

  Jako klient sklepu internetowego chce miec mozliwosc
  znalezenia sklepu najblizej mojej lokalizacji, aby moja droga do sklepu byla jak najkrotsza

  Scenario: Lokalizacja sklpeu
    Given Uzytkownik jest na stronie sklepu
    When Uzytkownik klika button Znajdz moj sklep
    And Uzytkownik wpisuje Miasto
    And Uzytkownik klika button Pokaz
    Then Strona wyswietla sklep najblizej podanej lokalizacji
