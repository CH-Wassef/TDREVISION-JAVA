import java.util.Objects;

public class Voiture {
    private String immatriculation;
    private String marque;
    private float prixLocation;

    public Voiture(String immatriculation, String marque, float prixLocation) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }

    @Override
    public int hashCode() {
        return immatriculation.hashCode() + marque.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Voiture other = (Voiture) obj;
        return immatriculation.equals(other.immatriculation) && marque.equals(other.marque);
    }

    @Override
    public String toString() {
        return "Immatriculation: " + immatriculation + ", Marque: " + marque + ", Prix de location: " + prixLocation;
    }
}

