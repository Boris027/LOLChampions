# Proyecto de Champions en Android

## Descripción

Este es un proyecto de Android que muestra una lista de campeones de un juego (por ejemplo, League of Legends) usando un `RecyclerView`. Cada campeón se presenta con su imagen, nombre, título y lore.

## Tecnologías Utilizadas

- **Android Studio**: IDE para el desarrollo de aplicaciones Android.
- **Kotlin**: Lenguaje de programación utilizado para la implementación del proyecto.
- **RecyclerView**: Componente de UI para mostrar listas de elementos.
- **CardView**: Para mostrar cada campeón con bordes redondeados.
- **Coil**: Librería utilizada para cargar imágenes de manera eficiente desde URLs.

## Características

- Muestra una lista de campeones en un `RecyclerView`.
- Cada campeón se presenta en una tarjeta con una imagen, nombre, título y lore.
- Incluye un placeholder en caso de que no se pueda cargar la imagen.

## Estructura del Proyecto

- **Modelos**: Clases que representan los datos de los campeones.
- **Adapter**: Adaptador del `RecyclerView` para enlazar los datos con la UI.
- **Layouts**: Archivos XML que definen la apariencia de los elementos en la interfaz.
