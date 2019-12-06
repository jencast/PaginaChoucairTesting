#language:es

Característica: Pagina de chocair/empleo
  como usuario quiero ingresar a la web de choucair, ir a empleos y
  buscar por palabra clave y/o ubicación.

  @EncuentraEmpleo
  Escenario: Hallar empleo de analista en medellin
    Dado que Jennifer quiere encontrar empleo
    Cuando ella de click en convocatorias e ingrese una palabra clave en empleo y su ubicación
      | palabraclave | ubicacion |
      | analista        | Medellin  |

    Entonces ella verifica el empleo con la palabra Analista


  @Manual1
  Escenario: Evaluar la capacidad de la interfaz de usuario
    Dado que Jennifer desea sentirse satisfecha en la interacción con la pagina de Choucair Testing
    Cuando ella analice su apariencia, colocaciones, armonia de colores y ortografia.
    Entonces ella verificará que si la interfaz de usuario es agradable.

  @Manual2
  Escenario: Evaluar la usabilidad de la página Choucair Testing/Empleos
    Dado que Bibiana quiere analizar la capacidad de la página para ser usada y respondes a las necesidades de usuario
    Cuando ella de click en cada uno de los componentes
    Entonces ella cerciorará que la página es fácil de aprender y cumple con sus necesidades.


