package items.UkrtelecomRegItems.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "contact_info")
public class ContractInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID contactInfoId;

    // Унікальний ID договору
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "ID договору не повинно бути порожнім")
    private String contractId;

    // Децимальний код підрозділу (Код філії)
    @NotNull
    @Size(min = 6, max = 6)
    @Column(nullable = false)
    @NotEmpty(message = "Поле департамент повинно бути заповнене")
    private String departmentCode;

    // 16-розрядний особовий рахунок
    @NotNull
    @Size(min = 16, max = 16)
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "ОР є обов'язковим полем")
    private String accountNumber;

    // Номер договору з АРМ УС (номер наряду)
    @NotNull
    @Column(nullable = false)
    @NotEmpty(message = "Поле задача згідно АРМ УС повинно бути заповнене")
    private String contractNumber;

    // Логін договору з АРМ УС
    @NotNull
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Логін клієнта згідно наряду")
    private String login;

    // Дата формування даних що передаються під час підключення
    @NotNull
    @Column(nullable = false)
    private LocalDateTime createdData;

    public ContractInfo() {
    }

    public ContractInfo(UUID contactInfoId, String contractId, String departmentCode, String accountNumber, String contractNumber, String login, LocalDateTime createdData) {
        this.contactInfoId = contactInfoId;
        this.contractId = contractId;
        this.departmentCode = departmentCode;
        this.accountNumber = accountNumber;
        this.contractNumber = contractNumber;
        this.login = login;
        this.createdData = createdData;
    }

    public UUID getContactInfoId() {
        return contactInfoId;
    }

    public void setContactInfoId(UUID contactInfoId) {
        this.contactInfoId = contactInfoId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDateTime getCreatedData() {
        return createdData;
    }

    public void setCreatedData(LocalDateTime createdData) {
        this.createdData = createdData;
    }
}
