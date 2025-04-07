package fr.afpa.pompey.cda17.parcInfoAPI.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Classe entité JPA représentant un appareil dans le système.
 * <p>
 * Modélise la table "appareils" en base de données avec ses contraintes.
 * Utilise Lombok pour générer automatiquement les méthodes getters/setters/toString.
 * </p>
 *
 * @author Generated by Lombok
 * @version 1.0
 */
@Data // Génère automatiquement getters, setters, equals, hashCode et toString
@Entity // Indique que cette classe est une entité persistante JPA
@Table(name = "appareils") // Spécifie le nom de la table en base de données
public class Appareil {

    /**
     * Identifiant unique auto-généré de l'appareil.
     * <p>
     * Stratégie de génération automatique configurée avec la stratégie IDENTITY
     * pour la compatibilité avec la plupart des bases de données relationnelles.
     * </p>
     */
    @Id // Marque ce champ comme clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
    @Column(name = "idAppareil") // Nom de colonne en base
    private long id;

    /**
     * Libellé de l'appareil (nom technique ou descriptif).
     * <p>
     * Contraintes en base :
     * - Obligatoire (non null)
     * - Longueur maximale de 30 caractères
     * </p>
     */
    @Column(
            name = "libelle",
            nullable = false, // Ne peut pas être null en base
            length = 30 // Taille maximale en base de données
    )
    private String libelle;
}