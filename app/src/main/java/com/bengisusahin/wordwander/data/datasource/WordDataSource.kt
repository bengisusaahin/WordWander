package com.bengisusahin.wordwander.data.datasource

import com.bengisusahin.wordwander.data.model.Translation
import com.bengisusahin.wordwander.data.model.Word

object WordDataSource {
    fun getWords(): List<Word> {
        return listOf(
            Word(1, "Hello", listOf(
                Translation("Turkish", "Merhaba"),
                Translation("Spanish", "Hola"),
                Translation("French", "Bonjour")
            )),
            Word(2, "Goodbye", listOf(
                Translation("Turkish", "Hoşça kal"),
                Translation("Spanish", "Adiós"),
                Translation("French", "Au revoir")
            )),
            Word(3, "Thank you", listOf(
                Translation("Turkish", "Teşekkür ederim"),
                Translation("Spanish", "Gracias"),
                Translation("French", "Merci")
            )),
            Word(4, "Yes", listOf(
                Translation("Turkish", "Evet"),
                Translation("Spanish", "Sí"),
                Translation("French", "Oui")
            )),
            Word(5, "No", listOf(
                Translation("Turkish", "Hayır"),
                Translation("Spanish", "No"),
                Translation("French", "Non")
            )),
            Word(6, "Please", listOf(
                Translation("Turkish", "Lütfen"),
                Translation("Spanish", "Por favor"),
                Translation("French", "S'il vous plaît")
            )),
            Word(7, "Excuse me", listOf(
                Translation("Turkish", "Affedersiniz"),
                Translation("Spanish", "Disculpe"),
                Translation("French", "Excusez-moi")
            )),
            Word(8, "I'm sorry", listOf(
                Translation("Turkish", "Üzgünüm"),
                Translation("Spanish", "Lo siento"),
                Translation("French", "Je suis désolé")
            )),
            Word(9, "How are you?", listOf(
                Translation("Turkish", "Nasılsın?"),
                Translation("Spanish", "¿Cómo estás?"),
                Translation("French", "Comment ça va?")
            )),
            Word(10, "Good morning", listOf(
                Translation("Turkish", "Günaydın"),
                Translation("Spanish", "Buenos días"),
                Translation("French", "Bonjour")
            )),
            Word(11, "Good night", listOf(
                Translation("Turkish", "İyi geceler"),
                Translation("Spanish", "Buenas noches"),
                Translation("French", "Bonne nuit")
            )),
            Word(12, "Welcome", listOf(
                Translation("Turkish", "Hoş geldiniz"),
                Translation("Spanish", "Bienvenido"),
                Translation("French", "Bienvenue")
            )),
            Word(13, "Friend", listOf(
                Translation("Turkish", "Arkadaş"),
                Translation("Spanish", "Amigo"),
                Translation("French", "Ami")
            )),
            Word(14, "Family", listOf(
                Translation("Turkish", "Aile"),
                Translation("Spanish", "Familia"),
                Translation("French", "Famille")
            )),
            Word(15, "Food", listOf(
                Translation("Turkish", "Yemek"),
                Translation("Spanish", "Comida"),
                Translation("French", "Nourriture")
            )),
            Word(16, "Water", listOf(
                Translation("Turkish", "Su"),
                Translation("Spanish", "Agua"),
                Translation("French", "Eau")
            )),
            Word(17, "House", listOf(
                Translation("Turkish", "Ev"),
                Translation("Spanish", "Casa"),
                Translation("French", "Maison")
            )),
            Word(18, "Car", listOf(
                Translation("Turkish", "Araba"),
                Translation("Spanish", "Coche"),
                Translation("French", "Voiture")
            )),
            Word(19, "Street", listOf(
                Translation("Turkish", "Sokak"),
                Translation("Spanish", "Calle"),
                Translation("French", "Rue")
            )),
            Word(20, "City", listOf(
                Translation("Turkish", "Şehir"),
                Translation("Spanish", "Ciudad"),
                Translation("French", "Ville")
            )),
            Word(21, "Book", listOf(
                Translation("Turkish", "Kitap"),
                Translation("Spanish", "Libro"),
                Translation("French", "Livre")
            )),
            Word(22, "School", listOf(
                Translation("Turkish", "Okul"),
                Translation("Spanish", "Escuela"),
                Translation("French", "École")
            )),
            Word(23, "Teacher", listOf(
                Translation("Turkish", "Öğretmen"),
                Translation("Spanish", "Profesor"),
                Translation("French", "Professeur")
            )),
            Word(24, "Student", listOf(
                Translation("Turkish", "Öğrenci"),
                Translation("Spanish", "Estudiante"),
                Translation("French", "Étudiant")
            )),
            Word(25, "Work", listOf(
                Translation("Turkish", "Çalışmak"),
                Translation("Spanish", "Trabajar"),
                Translation("French", "Travailler")
            )),
            Word(26, "Play", listOf(
                Translation("Turkish", "Oynamak"),
                Translation("Spanish", "Jugar"),
                Translation("French", "Jouer")
            )),
            Word(27, "Music", listOf(
                Translation("Turkish", "Müzik"),
                Translation("Spanish", "Música"),
                Translation("French", "Musique")
            )),
            Word(28, "Dance", listOf(
                Translation("Turkish", "Dans"),
                Translation("Spanish", "Baile"),
                Translation("French", "Danse")
            )),
            Word(29, "Run", listOf(
                Translation("Turkish", "Koşmak"),
                Translation("Spanish", "Correr"),
                Translation("French", "Courir")
            )),
            Word(30, "Jump", listOf(
                Translation("Turkish", "Zıplamak"),
                Translation("Spanish", "Saltar"),
                Translation("French", "Sauter")
            )),
            Word(31, "Swim", listOf(
                Translation("Turkish", "Yüzmek"),
                Translation("Spanish", "Nadar"),
                Translation("French", "Nager")
            )),
            Word(32, "Travel", listOf(
                Translation("Turkish", "Seyahat etmek"),
                Translation("Spanish", "Viajar"),
                Translation("French", "Voyager")
            )),
            Word(33, "Holiday", listOf(
                Translation("Turkish", "Tatil"),
                Translation("Spanish", "Vacaciones"),
                Translation("French", "Vacances")
            )),
            Word(34, "Market", listOf(
                Translation("Turkish", "Pazar"),
                Translation("Spanish", "Mercado"),
                Translation("French", "Marché")
            )),
            Word(35, "Store", listOf(
                Translation("Turkish", "Dükkan"),
                Translation("Spanish", "Tienda"),
                Translation("French", "Magasin")
            )),
            Word(36, "Money", listOf(
                Translation("Turkish", "Para"),
                Translation("Spanish", "Dinero"),
                Translation("French", "Argent")
            )),
            Word(37, "Health", listOf(
                Translation("Turkish", "Sağlık"),
                Translation("Spanish", "Salud"),
                Translation("French", "Santé")
            )),
            Word(38, "Happy", listOf(
                Translation("Turkish", "Mutlu"),
                Translation("Spanish", "Feliz"),
                Translation("French", "Heureux")
            )),
            Word(39, "Sad", listOf(
                Translation("Turkish", "Üzgün"),
                Translation("Spanish", "Triste"),
                Translation("French", "Triste")
            )),
            Word(40, "Angry", listOf(
                Translation("Turkish", "Kızgın"),
                Translation("Spanish", "Enojado"),
                Translation("French", "En colère")
            )),
            Word(41, "Tired", listOf(
                Translation("Turkish", "Yorgun"),
                Translation("Spanish", "Cansado"),
                Translation("French", "Fatigué")
            )),
            Word(42, "Beautiful", listOf(
                Translation("Turkish", "Güzel"),
                Translation("Spanish", "Hermoso"),
                Translation("French", "Beau")
            )),
            Word(43, "Ugly", listOf(
                Translation("Turkish", "Çirkin"),
                Translation("Spanish", "Feo"),
                Translation("French", "Laid")
            )),
            Word(44, "Big", listOf(
                Translation("Turkish", "Büyük"),
                Translation("Spanish", "Grande"),
                Translation("French", "Grand")
            )),
            Word(45, "Small", listOf(
                Translation("Turkish", "Küçük"),
                Translation("Spanish", "Pequeño"),
                Translation("French", "Petit")
            )),
            Word(46, "Hot", listOf(
                Translation("Turkish", "Sıcak"),
                Translation("Spanish", "Caliente"),
                Translation("French", "Chaud")
            )),
            Word(47, "Cold", listOf(
                Translation("Turkish", "Soğuk"),
                Translation("Spanish", "Frío"),
                Translation("French", "Froid")
            )),
            Word(48, "Light", listOf(
                Translation("Turkish", "Hafif"),
                Translation("Spanish", "Ligero"),
                Translation("French", "Léger")
            )),
            Word(49, "Heavy", listOf(
                Translation("Turkish", "Ağır"),
                Translation("Spanish", "Pesado"),
                Translation("French", "Lourd")
            )),
            Word(50, "Bright", listOf(
                Translation("Turkish", "Parlak"),
                Translation("Spanish", "Brillante"),
                Translation("French", "Brillant")
            ))
        )
    }
}