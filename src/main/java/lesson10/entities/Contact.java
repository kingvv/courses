package lesson10.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Contact {

    private String fio;
    private LocalDate birthDate;
    private List<String> phoneNumber;
    private String address;
    private LocalDateTime modifyDate;
    private int id;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Контакт. ");
        sb.append("ФИО: ").append(fio);
        sb.append(", Дата рождения: ").append(birthDate);
        sb.append(", Номер телефона: ").append(phoneNumber);
        sb.append(", Адрес: ").append(address);
        sb.append(", Дата и время редактирования: ").append(modifyDate);
        return sb.toString();
    }
}
