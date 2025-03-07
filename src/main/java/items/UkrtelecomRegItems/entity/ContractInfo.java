package items.UkrtelecomRegItems.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "contract_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractInfo {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false, unique = true)
    private UUID contactInfoId;

    // Унікальний ID договору
    @Column(nullable = false, unique = true)
    @NotBlank(message = "ID договору не повинно бути порожнім")
    private String contractId;

    // Децимальний код підрозділу (Код філії)

    @Size(min = 6, max = 6)
    @Column(nullable = false)
    @NotBlank(message = "Поле департамент повинно бути заповнене")
    private String departmentCode;

    // 16-розрядний особовий рахунок

    @Size(min = 16, max = 16)
    @Column(nullable = false, unique = true)
    @NotBlank(message = "ОР є обов'язковим полем")
    private String accountNumber;

    // Номер договору з АРМ УС (номер наряду)

    @Column(nullable = false)
    @NotBlank(message = "Поле задача згідно АРМ УС повинно бути заповнене")
    private String contractNumber;

    // Логін договору з АРМ УС

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Логін клієнта згідно наряду")
    private String login;

    // Дата формування даних що передаються під час підключення
    @NotNull
    @Column(nullable = false)
    private LocalDateTime createdData;


}
